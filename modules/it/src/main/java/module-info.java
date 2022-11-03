/**
 * Reactive Java API integration tests module configuration file.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.samples {
  requires reactive.java.api.interfaces;
  requires reactive.java.api.annotations;
  requires lombok;
  requires org.slf4j;
  requires io.cucumber.core;
  requires io.cucumber.java;
}
