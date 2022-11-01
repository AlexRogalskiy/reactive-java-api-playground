package com.tviplabs.api.playground.interfaces.producer.generic;

import java.util.Properties;

/**
 * General producer factory interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of producer service.
 */
@FunctionalInterface
public interface ProducerFactory<E> {
  /**
   * Returns new {@link E} producer service by input configuration {@link Properties}
   *
   * @param base initial input configuration {@link Properties} to operate by.
   * @return new producer service
   */
  E create(final Properties base);
}
