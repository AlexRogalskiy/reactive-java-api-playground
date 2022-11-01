import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumer;
import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducer;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducerFactory;
import com.tviplabs.api.playground.reactor.consumer.ReactorEventConsumerFactoryImpl;
import com.tviplabs.api.playground.reactor.consumer.ReactorEventConsumerImpl;
import com.tviplabs.api.playground.reactor.producer.ReactorEventProducerFactoryImpl;
import com.tviplabs.api.playground.reactor.producer.ReactorEventProducerImpl;

/**
 * Reactive Java API module configuration file for Reactor library implementation.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.reactor.impl {
  requires reactive.java.api.interfaces;
  requires reactive.java.api.annotations;
  requires lombok;
  requires java.desktop;
  requires static org.slf4j;

  provides EventConsumer with
      ReactorEventConsumerImpl;
  provides EventConsumerFactory with
      ReactorEventConsumerFactoryImpl;
  provides EventProducer with
      ReactorEventProducerImpl;
  provides EventProducerFactory with
      ReactorEventProducerFactoryImpl;
}
