package com.tviplabs.api.playground.interfaces.consumer.event;

import com.tviplabs.api.playground.interfaces.common.Event;
import com.tviplabs.api.playground.interfaces.consumer.generic.Consumer;

/**
 * Event consumer interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to consume.
 */
@FunctionalInterface
public interface EventConsumer<E extends Event> extends Consumer<E> {
  /**
   * Subscribes to particular {@link E} event type.
   *
   * @param event initial input {@link E} event to consume.
   */
  @Override
  void subscribe(final E event);
}
