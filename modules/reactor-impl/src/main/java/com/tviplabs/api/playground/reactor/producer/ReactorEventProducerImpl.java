package com.tviplabs.api.playground.reactor.producer;

import com.tviplabs.api.playground.interfaces.producer.event.EventProducer;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.Map;

/**
 * Reactor event producer implementation based on Reactor API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to produce.
 */
@Slf4j
@RequiredArgsConstructor
public class ReactorEventProducerImpl<E> implements EventProducer<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("ReactorEventProducerImpl");

  @NonNull private final Map<String, Object> configMap;

  @Override
  public void publish(final E event) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> Producing event: {}", event);
    final var t = this.configMap;
  }
}
