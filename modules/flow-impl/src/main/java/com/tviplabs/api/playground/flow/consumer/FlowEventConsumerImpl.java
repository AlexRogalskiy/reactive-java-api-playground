package com.tviplabs.api.playground.flow.consumer;

import com.tviplabs.api.playground.commons.configuration.ConsumerConfig;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Flow event consumer implementation based on Flow API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to consume.
 */
@Slf4j
public class FlowEventConsumerImpl<E> implements EventConsumer<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("FlowEventConsumerImpl");

  public FlowEventConsumerImpl(@NonNull final ConsumerConfig config) {}

  @Override
  public void subscribe(final E event) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> consuming event: {}", event);
  }
}
