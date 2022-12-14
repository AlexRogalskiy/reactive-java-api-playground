package com.tviplabs.api.playground.interfaces.consumer.event;

import com.tviplabs.api.playground.interfaces.common.Event;
import com.tviplabs.api.playground.interfaces.consumer.generic.ConsumerFactory;

/**
 * Event consumer factory interface declaration.
 *
 * @author Alexander Rogalskiy
 * @param <E> type of event to consume.
 */
public interface EventConsumerFactory<E extends Event>
    extends ConsumerFactory<E, EventConsumer<E>> {}
