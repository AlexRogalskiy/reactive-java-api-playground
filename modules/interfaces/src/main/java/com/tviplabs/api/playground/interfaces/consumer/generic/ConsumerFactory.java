package com.tviplabs.api.playground.interfaces.consumer.generic;

import java.util.Properties;

/**
 * General consumer factory interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of consumer service.
 */
@FunctionalInterface
public interface ConsumerFactory<E> {
  /**
   * Returns new {@link E} consumer service by input configuration {@link Properties}
   *
   * @param base initial input configuration {@link Properties} to operate by.
   * @return new consumer service
   */
  E create(final Properties base);
}
