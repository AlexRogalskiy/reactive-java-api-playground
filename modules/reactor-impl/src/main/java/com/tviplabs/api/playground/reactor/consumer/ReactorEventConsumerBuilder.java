package com.tviplabs.api.playground.reactor.consumer;

import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.Map;

/**
 * Reactor event consumer builder implementation based on Reactor API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to consume.
 */
@RequiredArgsConstructor
class ReactorEventConsumerBuilder<E> {

  private final Map<String, Object> configMap;

  public ReactorEventConsumerBuilder() {
    this(Collections.emptyMap());
  }

  public ReactorEventConsumerImpl<E> build() {
    return new ReactorEventConsumerImpl<>(this.configMap);
  }
}
