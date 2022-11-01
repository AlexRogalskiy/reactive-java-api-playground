package com.tviplabs.api.playground.interfaces.producer.generic;

/**
 * Generic producer interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <T> type of data to produce.
 */
@FunctionalInterface
public interface Producer<T> {
  /**
   * Publishes particular {@link T} data type.
   *
   * @param data initial input {@link T} data to produce.
   */
  void publish(final T data);

  /**
   * Returns {@link String} current {@link Producer} name.
   *
   * @return current producer name.
   */
  default String getName() {
    return this.getClass().getCanonicalName();
  }
}
