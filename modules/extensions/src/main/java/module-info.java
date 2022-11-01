/**
 * Reactive Java API extension module configuration file.
 *
 * @author Alexander Rogalskiy
 */
module reactive.java.api.extensions {
  exports com.tviplabs.api.playground.extensions.annotations;

  requires reactive.java.api.annotations;
  requires java.compiler;
  requires org.apache.commons.lang3;
  requires com.google.errorprone.annotations;
}
