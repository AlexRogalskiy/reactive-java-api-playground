package com.tviplabs.api.playground.reactor.consumer;

import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.Properties;

/**
 * Reactor event consumer factory implementation based on Reactor API.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to consume.
 */
@Slf4j
@RequiredArgsConstructor
public class ReactorEventConsumerFactoryImpl<E> implements EventConsumerFactory<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("ReactorEventConsumerFactoryImpl");

  @NonNull private final ReactorEventConsumerBuilder<E> eventConsumerBuilder;

  public ReactorEventConsumerFactoryImpl() {
    this(new ReactorEventConsumerBuilder<>());
  }

  @NonNull
  public static <E> EventConsumerFactory<E> provider() {
    return new ReactorEventConsumerFactoryImpl<>();
  }

  @Override
  public EventConsumer<E> create(final Properties base) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> Consumer factory properties: {}", base);
    final var t = this.eventConsumerBuilder;
    return null;
  }
}
