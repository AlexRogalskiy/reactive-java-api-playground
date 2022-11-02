package com.tviplabs.api.playground.interfaces.producer.generic;

import com.tviplabs.api.playground.interfaces.common.Nameable;

import java.util.Properties;

/**
 * General producer factory interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <T> type of data to consume.
 * @param <P> type of producer service.
 */
@FunctionalInterface
public interface ProducerFactory<T, P extends Producer<T>> extends Nameable {
  /**
   * Returns new {@link P} producer service by input configuration {@link Properties}
   *
   * @param base initial input configuration {@link Properties} to operate by.
   * @return new producer service
   */
  P create(final Properties base);

  /**
   * Returns {@link String} current {@link ProducerFactory} name.
   *
   * @return current producer factory name.
   */
  @Override
  default String getName() {
    return this.getClass().getCanonicalName();
  }
}
