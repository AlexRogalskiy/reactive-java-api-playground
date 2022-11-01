import com.tviplabs.api.playground.interfaces.stream.EventEmitter;

/**
 * Reactive Java API interfaces module configuration file.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.interfaces {
  requires reactive.java.api.annotations;
  requires reactive.java.api.commons;

  exports com.tviplabs.api.playground.interfaces.generic;
  exports com.tviplabs.api.playground.interfaces.stream;

  uses EventEmitter;
}
