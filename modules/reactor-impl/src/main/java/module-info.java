import com.tviplabs.api.playground.interfaces.stream.EventEmitter;

/**
 * Reactive Java API module configuration file for Reactor library implementation.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.reactor.impl {
  requires reactive.java.api.interfaces;
  requires reactive.java.api.annotations;

  provides EventEmitter with
      com.tviplabs.api.playground.reactor.impl.EventEmitterReactorImpl;
}
