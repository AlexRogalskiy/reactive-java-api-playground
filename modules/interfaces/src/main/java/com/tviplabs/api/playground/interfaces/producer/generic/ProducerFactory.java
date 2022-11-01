package com.tviplabs.api.playground.interfaces.producer.generic;

import java.util.Properties;

/**
 * General producer factory interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <T> type of data to consume.
 * @param <P> type of producer service.
 */
@FunctionalInterface
public interface ProducerFactory<T, P extends Producer<T>> {
  /**
   * Returns new {@link P} producer service by input configuration {@link Properties}
   *
   * @param base initial input configuration {@link Properties} to operate by.
   * @return new producer service
   */
  P create(final Properties base);
}
