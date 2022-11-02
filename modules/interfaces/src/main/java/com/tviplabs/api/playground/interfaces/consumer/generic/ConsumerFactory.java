package com.tviplabs.api.playground.interfaces.consumer.generic;

import com.tviplabs.api.playground.interfaces.common.Nameable;

import java.util.Properties;

/**
 * General consumer factory interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <T> type of data to consume.
 * @param <C> type of consumer service.
 */
@FunctionalInterface
public interface ConsumerFactory<T, C extends Consumer<T>> extends Nameable {
  /**
   * Returns new {@link C} consumer service by input configuration {@link Properties}
   *
   * @param base initial input configuration {@link Properties} to operate by.
   * @return new consumer service
   */
  C create(final Properties base);

  /**
   * Returns {@link String} current {@link ConsumerFactory} name.
   *
   * @return current consumer factory name.
   */
  @Override
  default String getName() {
    return this.getClass().getSimpleName();
  }
}
