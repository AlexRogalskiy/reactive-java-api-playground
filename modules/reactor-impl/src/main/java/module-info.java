import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducerFactory;
import com.tviplabs.api.playground.reactor.consumer.ReactorEventConsumerFactoryImpl;
import com.tviplabs.api.playground.reactor.producer.ReactorEventProducerFactoryImpl;

/**
 * Reactive Java API module configuration file for Reactor library implementation.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.reactor.impl {
  requires reactive.java.api.interfaces;
  requires reactive.java.api.annotations;
  requires reactive.java.api.commons;
  requires lombok;
  requires java.desktop;
  requires static org.slf4j;

  provides EventConsumerFactory with
      ReactorEventConsumerFactoryImpl;
  provides EventProducerFactory with
      ReactorEventProducerFactoryImpl;
}
