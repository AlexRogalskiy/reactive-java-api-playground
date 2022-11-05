package com.tviplabs.api.playground.reactor.producer;

import com.tviplabs.api.playground.commons.models.ProducerConfig;
import com.tviplabs.api.playground.interfaces.common.Event;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducer;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Reactor event producer implementation based on Reactor API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to produce.
 */
@Slf4j
@RequiredArgsConstructor
public class ReactorEventProducerImpl<E extends Event> implements EventProducer<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("ReactorEventProducerImpl");

  public ReactorEventProducerImpl(@NonNull final ProducerConfig config) {}

  @Override
  public void publish(final E event) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> producing event: {}", event);
  }
}
