package com.tviplabs.api.playground.interfaces.stream;

/**
 * EventEmitter.
 *
 * @author Alexander Rogalskiy
 */
@FunctionalInterface
public interface EventEmitter {
  default String getName() {
    return this.getClass().getCanonicalName();
  }

  void emit();
}
