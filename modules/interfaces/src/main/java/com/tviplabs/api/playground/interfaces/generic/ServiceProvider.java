package com.tviplabs.api.playground.interfaces.generic;

import java.util.List;
import java.util.ServiceLoader;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

import static com.tviplabs.api.playground.commons.exception.ServiceResolutionException.createServiceResolutionError;
import static java.util.stream.Collectors.toList;

/**
 * Service provider is intended to create new instances of services by input parameters
 *
 * @author Alexander Rogalskiy
 */
public interface ServiceProvider {
  /**
   * Return {@link S} service instance by input service {@link Class}
   *
   * @param serviceClass initial input service {@link Class} to instantiate
   * @param <S> type of service provider
   * @return new instance of {@link S} service provider
   */
  static <S> S getInstance(final Class<S> serviceClass) {
    return ServiceLoader.load(serviceClass)
        .findFirst()
        .orElseThrow(createServiceResolutionError(serviceClass));
  }

  /**
   * Return {@link S} service instance by input service {@link Class} and {@link Predicate}
   *
   * @param serviceClass initial input service {@link Class} to instantiate
   * @param servicePredicate initial input service {@link Predicate}
   * @param <S> type of service provider
   * @return new instance of {@link S} service provider
   */
  static <S> S getInstance(
      final Class<? extends S> serviceClass, final Predicate<? super S> servicePredicate) {
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
   * @param <S> type of service provider
   * @return list of service provider {@link S} instances
   */
  static <S> List<S> getInstances(
      final Class<? extends S> serviceClass,
      final Predicate<? super ServiceLoader.Provider<? extends S>> servicePredicate) {
    return ServiceLoader.load(serviceClass).stream()
        .filter(servicePredicate)
        .map(ServiceLoader.Provider::get)
        .collect(toList());
  }
}
