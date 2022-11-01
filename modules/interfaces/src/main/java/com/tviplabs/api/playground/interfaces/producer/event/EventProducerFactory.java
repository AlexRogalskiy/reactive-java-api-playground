package com.tviplabs.api.playground.interfaces.producer.event;

import com.tviplabs.api.playground.interfaces.producer.generic.ProducerFactory;

/**
 * Event producer factory interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to produce.
 */
public interface EventProducerFactory<E> extends ProducerFactory<EventProducer<E>> {}
