package com.tviplabs.api.playground.interfaces.consumer.generic;

/**
 * Delegating consumer interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <T> type of data to consume.
 */
public interface DelegatingConsumer<T> extends Consumer<T> {
  /**
   * Returns {@link Consumer} instance.
   *
   * @return delegating consumer instance.
   */
  Consumer<T> getDelegate();
}
