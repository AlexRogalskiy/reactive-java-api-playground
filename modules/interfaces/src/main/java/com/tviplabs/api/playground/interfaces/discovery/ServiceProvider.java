package com.tviplabs.api.playground.interfaces.discovery;

import com.tviplabs.api.playground.interfaces.common.Nameable;

import java.util.List;
import java.util.ServiceLoader;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

import static com.tviplabs.api.playground.commons.exceptions.ServiceResolutionException.createServiceResolutionError;
import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.equalsAnyIgnoreCase;

/**
 * Service provider provides service discovery mechanism that is intended to discover and create new
 * instances of services by input service parameters
 *
 * @author Alexander Rogalskiy
 */
public interface ServiceProvider {
  /**
   * Return {@link S} service instance by input service {@link Class}
   *
   * @param serviceClass initial input service {@link Class} to instantiate
   * @param <S> type of service instance
   * @return new instance of {@link S} service instance
   */
  static <S> S getInstance(final Class<S> serviceClass) {
    return ServiceLoader.load(serviceClass)
        .findFirst()
        .orElseThrow(createServiceResolutionError(serviceClass));
  }

  /**
   * Return {@link S} service instance by input service {@link Class} and {@link String} name
   *
   * @param serviceClass initial input service {@link Class} to instantiate
   * @param serviceName initial input service {@link String} name to fetch by
   * @param <S> type of service instance
   * @return new instance of {@link S} service instance
   */
  static <S extends Nameable> S getInstance(final Class<S> serviceClass, final String serviceName) {
    return getInstance(serviceClass, value -> equalsAnyIgnoreCase(value.getName(), serviceName));
  }

  /**
   * Return {@link S} service instance by input service {@link Class} and {@link Predicate}
   *
   * @param serviceClass initial input service {@link Class} to instantiate
   * @param servicePredicate initial input service {@link Predicate}
   * @param <S> type of service instance
   * @return new instance of {@link S} service instance
   */
  static <S> S getInstance(
      final Class<S> serviceClass, final Predicate<? super S> servicePredicate) {
    return StreamSupport.stream(ServiceLoader.load(serviceClass).spliterator(), false)
        .filter(servicePredicate)
        .findFirst()
        .orElseThrow(createServiceResolutionError(serviceClass));
  }

  /**
   * Return list of {@link S} service instances by input service {@link Class} and {@link Predicate}
   *
   * @param serviceClass initial input service {@link Class} to instantiate
   * @param servicePredicate initial input service provider {@link Predicate}
   * @param <S> type of service instance
   * @return list of {@link S} service instances
   */
  static <S> List<S> getInstances(
      final Class<S> serviceClass,
      final Predicate<? super ServiceLoader.Provider<? extends S>> servicePredicate) {
    return ServiceLoader.load(serviceClass).stream()
        .filter(servicePredicate)
        .map(ServiceLoader.Provider::get)
        .collect(toList());
  }
}
