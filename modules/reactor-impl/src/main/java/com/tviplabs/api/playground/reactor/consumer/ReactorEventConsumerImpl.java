package com.tviplabs.api.playground.reactor.consumer;

import com.tviplabs.api.playground.commons.configuration.ConsumerConfig;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Reactor event consumer implementation based on Reactor API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to consume.
 */
@Slf4j
@RequiredArgsConstructor
public class ReactorEventConsumerImpl<E> implements EventConsumer<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("ReactorEventConsumerImpl");

  public ReactorEventConsumerImpl(@NonNull final ConsumerConfig config) {}

  @Override
  public void subscribe(final E event) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> consuming event: {}", event);
  }
}
