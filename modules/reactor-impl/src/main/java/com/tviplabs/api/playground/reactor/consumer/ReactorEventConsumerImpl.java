package com.tviplabs.api.playground.reactor.consumer;

import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
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

  @NonNull private final EventConsumerFactory<E> eventConsumerFactory;

  public ReactorEventConsumerImpl() {
    this(null);
  }

  @NonNull
  public static <E> EventConsumer<E> provider() {
    return new ReactorEventConsumerImpl<>();
  }

  @Override
  public void subscribe(final E event) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> Consuming event: {}", event);
    final var t = this.eventConsumerFactory;
  }
}
