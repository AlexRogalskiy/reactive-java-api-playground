package com.tviplabs.api.playground.reactor.producer;

import com.tviplabs.api.playground.reactor.consumer.ReactorEventConsumerImpl;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.Map;

/**
 * Reactor event producer builder implementation based on Reactor API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to produce.
 */
@RequiredArgsConstructor
class ReactorEventProducerBuilder<E> {

  private final Map<String, Object> configMap;

  public ReactorEventProducerBuilder() {
    this(Collections.emptyMap());
  }

  public ReactorEventProducerImpl<E> build() {
    return new ReactorEventProducerImpl<>(this.configMap);
  }
}
