package com.tviplabs.api.playground.samples;

import com.tviplabs.api.playground.interfaces.common.Event;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
import com.tviplabs.api.playground.interfaces.discovery.ServiceProvider;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducer;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducerFactory;
import com.tviplabs.api.playground.samples.models.StringDataEvent;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * Application runner works as a client for different reactive data processing techniques.
 *
 * @author Alexander Rogalskiy
 */
@Slf4j
public class ApplicationRunner {

  public static void main(final String... args) {
    final EventProducer<StringDataEvent> reactorEventProducer =
        createProducer("ReactorEventProducerFactoryImpl", new Properties());
    final EventConsumer<StringDataEvent> reactorEventConsumer =
        createConsumer("ReactorEventConsumerFactoryImpl", new Properties());

    final EventProducer<StringDataEvent> flowEventProducer =
        createProducer("FlowEventProducerFactoryImpl", new Properties());
    final EventConsumer<StringDataEvent> flowEventConsumer =
        createConsumer("FlowEventConsumerFactoryImpl", new Properties());
  }

  @SuppressWarnings("unchecked")
  private static <E extends Event> EventProducer<E> createProducer(
      final String serviceName, final Properties properties) {
    try {
      final EventProducerFactory<E> producerFactory =
          ServiceProvider.getInstance(EventProducerFactory.class, serviceName);

      return producerFactory.create(properties);
    } catch (Exception e) {
      log.error(
          ">>> ERROR: cannot instantiate event producer service, message: {}", e.getMessage());
      throw e;
    }
  }

  @SuppressWarnings("unchecked")
  private static <E extends Event> EventConsumer<E> createConsumer(
      final String serviceName, final Properties properties) {
    try {
      final EventConsumerFactory<E> consumerFactory =
          ServiceProvider.getInstance(EventConsumerFactory.class, serviceName);

      return consumerFactory.create(properties);
    } catch (Exception e) {
      log.error(
          ">>> ERROR: cannot instantiate event consumer service, message: {}", e.getMessage());
      throw e;
    }
  }
}
