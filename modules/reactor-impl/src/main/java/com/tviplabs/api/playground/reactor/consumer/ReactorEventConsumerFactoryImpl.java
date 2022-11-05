package com.tviplabs.api.playground.reactor.consumer;

import com.tviplabs.api.playground.commons.models.ConsumerConfig;
import com.tviplabs.api.playground.interfaces.common.Event;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
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
public class ReactorEventConsumerFactoryImpl<E extends Event> implements EventConsumerFactory<E> {

  /** Default logging configuration {@link Marker} instance */
  private static final Marker DEFAULT_LOGGING_MARKER =
      MarkerFactory.getMarker("ReactorEventConsumerFactoryImpl");

  @Override
  public EventConsumer<E> create(final Properties base) {
    log.info(DEFAULT_LOGGING_MARKER, ">>> consumer factory properties: {}", base);

    final ConsumerConfig config = ConsumerConfig.builder().config(null, null).build();

    return new ReactorEventConsumerImpl<>(config);
  }
}
