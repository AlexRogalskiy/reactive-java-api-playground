package com.tviplabs.api.playground.commons.models;

import lombok.NonNull;

/**
 * Value container with only a primary index.
 *
 * @param <T> the value type
 */
public final class PrimaryOrderedItem<T> implements OrderedItem<T> {

  private final long index;
  private T value;

  private PrimaryOrderedItem(final T value, final long index) {
    this.value = value;
    this.index = index;
  }

  /**
   * Creates an primary OrderedItem instance.
   *
   * @param <T> the value type
   * @param value the value to hold
   * @param index the primary index
   * @return the new instance
   */
  @NonNull
  public static <T> OrderedItem<T> of(final T value, final long index) {
    return new PrimaryOrderedItem<>(value, index);
  }

  @Override
  public T get() {
    return this.value;
  }

  @Override
  public void set(final T newValue) {
    this.value = newValue;
  }

  @Override
  public long index() {
    return this.index;
  }

  @Override
  public int compareTo(final OrderedItem<T> o) {
    return Long.compare(this.index, o.index());
  }

  @Override
  public <U> OrderedItem<U> copy(final U u) {
    return of(u, this.index);
  }

  @SuppressWarnings("unchecked")
  @Override
  public <U extends T> OrderedItem<U> change(final U u) {
    this.value = u;
    return (OrderedItem<U>) this;
  }
}
