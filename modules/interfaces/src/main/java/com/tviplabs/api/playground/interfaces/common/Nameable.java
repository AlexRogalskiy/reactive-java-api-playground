package com.tviplabs.api.playground.interfaces.common;

/**
 * Nameable interface declaration.
 *
 * @author Alexander Rogalskiy
 */
@FunctionalInterface
public interface Nameable {
  /**
   * Returns {@link String} current descriptor name.
   *
   * @return current descriptor name.
   */
  String getName();
}
