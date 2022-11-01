import com.tviplabs.api.playground.flow.consumer.FlowEventConsumerFactoryImpl;
import com.tviplabs.api.playground.flow.consumer.FlowEventConsumerImpl;
import com.tviplabs.api.playground.flow.producer.FlowEventProducerFactoryImpl;
import com.tviplabs.api.playground.flow.producer.FlowEventProducerImpl;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducer;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducerFactory;

/**
 * Reactive Java API module configuration file for Flow library implementation.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.flow.impl {
  requires reactive.java.api.interfaces;
  requires reactive.java.api.annotations;
  requires lombok;
  requires java.desktop;
  requires static org.slf4j;

  provides EventConsumer with
      FlowEventConsumerImpl;
  provides EventConsumerFactory with
      FlowEventConsumerFactoryImpl;
  provides EventProducer with
      FlowEventProducerImpl;
  provides EventProducerFactory with
      FlowEventProducerFactoryImpl;
}
