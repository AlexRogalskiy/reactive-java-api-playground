package com.tviplabs.api.playground.interfaces.producer.event;

import com.tviplabs.api.playground.interfaces.common.Event;
import com.tviplabs.api.playground.interfaces.producer.generic.ProducerFactory;

/**
 * Event producer factory interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to produce.
 */
public interface EventProducerFactory<E extends Event>
    extends ProducerFactory<E, EventProducer<E>> {}
