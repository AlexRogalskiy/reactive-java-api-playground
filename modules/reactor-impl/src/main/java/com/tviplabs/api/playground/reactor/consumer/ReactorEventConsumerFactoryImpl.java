package com.tviplabs.api.playground.reactor.consumer;

import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
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
public class ReactorEventConsumerFactoryImpl<E> implements EventConsumerFactory<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("ReactorEventConsumerFactoryImpl");

  @Override
  public EventConsumer<E> create(final Properties base) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> Consumer factory properties: {}", base);
    return null;
  }
}
