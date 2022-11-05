package com.tviplabs.api.playground.samples.models;

import com.tviplabs.api.playground.interfaces.common.Event;
import lombok.experimental.SuperBuilder;

/**
 * Abstract base event implementation.
 *
 * @author Alexander Rogalskiy
 * @param <T> type of event data.
 */
@SuperBuilder
public abstract class BaseEvent<T> implements Event {
  private final T data;
}
