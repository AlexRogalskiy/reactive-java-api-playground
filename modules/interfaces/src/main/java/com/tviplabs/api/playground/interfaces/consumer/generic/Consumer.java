package com.tviplabs.api.playground.interfaces.consumer.generic;

/**
 * Generic consumer interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <T> type of data to consume.
 */
@FunctionalInterface
public interface Consumer<T> {
  /**
   * Consumes particular {@link T} data type.
   *
   * @param data initial input {@link T} data to consume.
   */
  void subscribe(final T data);

  /**
   * Returns {@link String} current {@link Consumer} name.
   *
   * @return current consumer name.
   */
  default String getName() {
    return this.getClass().getCanonicalName();
  }
}
