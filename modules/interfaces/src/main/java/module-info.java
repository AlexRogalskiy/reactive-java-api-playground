import com.tviplabs.api.playground.interfaces.consumer.event.EventConsumerFactory;
import com.tviplabs.api.playground.interfaces.producer.event.EventProducerFactory;

/**
 * Reactive Java API interfaces module configuration file.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.interfaces {
  requires reactive.java.api.annotations;
  requires reactive.java.api.commons;
  requires org.apache.commons.lang3;

  exports com.tviplabs.api.playground.interfaces.common;
  exports com.tviplabs.api.playground.interfaces.consumer.generic;
  exports com.tviplabs.api.playground.interfaces.producer.generic;
  exports com.tviplabs.api.playground.interfaces.consumer.event;
  exports com.tviplabs.api.playground.interfaces.producer.event;
  exports com.tviplabs.api.playground.interfaces.discovery;

  uses EventProducerFactory;
  uses EventConsumerFactory;
}
