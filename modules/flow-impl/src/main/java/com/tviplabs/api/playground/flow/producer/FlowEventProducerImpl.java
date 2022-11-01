package com.tviplabs.api.playground.flow.producer;

import com.tviplabs.api.playground.interfaces.producer.event.EventProducer;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducerFactory;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Flow event producer implementation based on Flow API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to produce.
 */
@Slf4j
@RequiredArgsConstructor
public class FlowEventProducerImpl<E> implements EventProducer<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("FlowEventProducerImpl");

  @NonNull private final EventProducerFactory<E> eventProducerFactory;

  public FlowEventProducerImpl() {
    this(null);
  }

  @NonNull
  public static <E> EventProducer<E> provider() {
    return new FlowEventProducerImpl<>();
  }

  @Override
  public void publish(final E event) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> Producing event: {}", event);
    final var t = this.eventProducerFactory;
  }
}
