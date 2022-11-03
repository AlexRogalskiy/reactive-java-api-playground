package com.tviplabs.api.playground.commons.models;

/**
 * Represents a value with ordering information.
 *
 * @param <T> the value type
 */
public interface OrderedItem<T> extends Comparable<OrderedItem<T>> {
  /**
   * Returns the contained value.
   *
   * @return the contained value
   */
  T get();

  /**
   * Update the value in-place;
   *
   * @param newValue initial input {@link T} value to update by.
   */
  void set(final T newValue);

  /**
   * Returns the primary index.
   *
   * @return the primary index
   */
  long index();

  /**
   * Creates a new OrderedItem instance with a new value but the same indexes as this instance.
   *
   * @param <U> the new value type
   * @param u the new value
   * @return the new OrderedItem instance
   */
  <U> OrderedItem<U> copy(final U u);

  /**
   * Force a differently typed value into this container.
   *
   * @param <U> the new value type
   * @param u the new value
   * @return this
   */
  <U extends T> OrderedItem<U> change(final U u);
}
