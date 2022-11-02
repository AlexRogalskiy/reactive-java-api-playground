package com.tviplabs.api.playground.interfaces.consumer.event;

import com.tviplabs.api.playground.interfaces.consumer.generic.Consumer;

/**
 * Event consumer interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to consume.
 */
@FunctionalInterface
public interface EventConsumer<E> extends Consumer<E> {
  /**
   * Subscribes to particular {@link E} event type.
   *
   * @param event initial input {@link E} event to consume.
   */
  @Override
  void subscribe(final E event);

  /**
   * Returns {@link String} current {@link EventConsumer} name.
   *
   * @return current event consumer name.
   */
  @Override
  default String getName() {
    return this.getClass().getSimpleName();
  }
}
