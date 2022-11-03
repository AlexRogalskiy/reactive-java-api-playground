import com.tviplabs.api.playground.flow.consumer.FlowEventConsumerFactoryImpl;
import com.tviplabs.api.playground.flow.producer.FlowEventProducerFactoryImpl;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducerFactory;

/**
 * Reactive Java API module configuration file for Flow library implementation.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.flow.impl {
  requires reactive.java.api.interfaces;
  requires reactive.java.api.annotations;
  requires reactive.java.api.commons;
  requires lombok;
  requires java.desktop;
  requires org.slf4j;

  provides EventConsumerFactory with
      FlowEventConsumerFactoryImpl;
  provides EventProducerFactory with
      FlowEventProducerFactoryImpl;
}
