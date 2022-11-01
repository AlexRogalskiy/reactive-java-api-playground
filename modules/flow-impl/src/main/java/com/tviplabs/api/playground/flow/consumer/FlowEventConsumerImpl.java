package com.tviplabs.api.playground.flow.consumer;

import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class FlowEventConsumerImpl<E> implements EventConsumer<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("FlowEventConsumerImpl");

  @NonNull private final EventConsumerFactory<E> eventConsumerFactory;

  public FlowEventConsumerImpl() {
    this(null);
  }

  @NonNull
  public static <E> EventConsumer<E> provider() {
    return new FlowEventConsumerImpl<>();
  }

  @Override
  public void subscribe(final E event) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> Consuming event: {}", event);
    final var t = this.eventConsumerFactory;
  }
}
