package com.tviplabs.api.playground.interfaces.producer.generic;

/**
 * Delegating producer interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <T> type of data to produce.
 */
public interface DelegatingProducer<T> extends Producer<T> {
  /**
   * Returns {@link Producer} instance.
   *
   * @return delegating producer instance.
   */
  Producer<T> getDelegate();
}
