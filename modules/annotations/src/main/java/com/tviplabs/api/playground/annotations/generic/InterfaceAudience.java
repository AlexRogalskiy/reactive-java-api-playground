package com.tviplabs.api.playground.annotations.generic;

import java.lang.annotation.*;

/**
 * Annotation to inform users of a package, class or method's intended audience. Currently the
 * audience can be {@link PublicApi}, {@link LimitedApi} or {@link PrivateApi}. <br>
 * All public classes must have InterfaceAudience annotation. <br>
 *
 * <ul>
 *   <li>Public classes that are not marked with this annotation must be considered by default as
 *       {@link PrivateApi}.
 *   <li>External applications must only use classes that are marked {@link PublicApi}. Avoid using
 *       non public classes as these classes could be removed or change in incompatible ways.
 *   <li>Pinpoint projects must only use classes that are marked {@link LimitedApi} or {@link
 *       PublicApi}
 *   <li>Methods may have a different annotation that it is more restrictive compared to the
 *       audience classification of the class. Example: A class might be {@link PublicApi}, but a
 *       method may be {@link LimitedApi}
 * </ul>
 *
 * @author Alexander Rogalskiy
 */
@InterfaceAudience.PublicApi
@InterfaceStability.Evolving
public @interface InterfaceAudience {
  /**
   * This represents code that is considered as public API and intended for any projects or modules.
   */
  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target(
      value = {
        ElementType.CONSTRUCTOR,
        ElementType.METHOD,
        ElementType.TYPE,
        ElementType.FIELD,
        ElementType.PACKAGE
      })
  @interface PublicApi {}

  /**
   * This represents code that is considered as private API and intended for the project or module
   * itself.
   */
  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target(
      value = {
        ElementType.CONSTRUCTOR,
        ElementType.METHOD,
        ElementType.TYPE,
        ElementType.FIELD,
        ElementType.PACKAGE
      })
  @interface PrivateApi {}

  /**
   * This represents code that is considered as limited private API and intended for the projects or
   * modules specified in the annotation.
   */
  @Documented
  @Retention(RetentionPolicy.RUNTIME)
  @Target(
      value = {
        ElementType.CONSTRUCTOR,
        ElementType.METHOD,
        ElementType.TYPE,
        ElementType.FIELD,
        ElementType.PACKAGE
      })
  @interface LimitedApi {
    String[] value();
  }
}
