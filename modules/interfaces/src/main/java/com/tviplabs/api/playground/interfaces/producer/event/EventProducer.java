package com.tviplabs.api.playground.interfaces.producer.event;

import com.tviplabs.api.playground.interfaces.producer.generic.Producer;

/**
 * Event producer interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to produce.
 */
@FunctionalInterface
public interface EventProducer<E> extends Producer<E> {
  /**
   * Publishes particular {@link E} event type.
   *
   * @param event initial input {@link E} event to produce.
   */
  @Override
  void publish(final E event);
}
