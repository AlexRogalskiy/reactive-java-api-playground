/**
 * Reactive Java API commons module configuration file.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.commons {
  exports com.tviplabs.api.playground.commons.exception;
  exports com.tviplabs.api.playground.commons.interfaces;
  exports com.tviplabs.api.playground.commons.configuration;

  requires reactive.java.api.annotations;
  requires reactive.java.api.extensions;
  requires static org.slf4j;
  requires java.desktop;
  requires lombok;
  requires org.apache.commons.lang3;
  requires org.apache.commons.io;
  requires com.fasterxml.jackson.annotation;
  requires com.fasterxml.jackson.core;
  requires com.fasterxml.jackson.databind;
  requires org.yaml.snakeyaml;
}
