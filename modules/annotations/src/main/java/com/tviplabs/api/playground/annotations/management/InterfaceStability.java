package com.tviplabs.api.playground.annotations.management;

import java.lang.annotation.*;

/**
 * Annotation to inform users of how much to rely on a particular package, class, method or field
 * not changing over time. Currently the stability can be {@link InterfaceAudience.PublicApi},
 * {@link InterfaceAudience.PrivateApi} or {@link InterfaceAudience.LimitedApi}. <br>
 *
 * <ul>
 *   <li>All classes that are annotated with {@link InterfaceAudience.PublicApi} or {@link
 *       InterfaceAudience.LimitedApi} must have InterfaceStability annotation.
 *   <li>Classes that are {@link InterfaceAudience.PrivateApi} are to be considered unstable unless
 *       a different InterfaceStability annotation states otherwise.
 *   <li>Incompatible changes must not be made to classes marked as stable.
 * </ul>
 *
 * @author Alexander Rogalskiy
 */
@InterfaceAudience.PublicApi
@InterfaceStability.Evolving
public @interface InterfaceStability {
  /**
   * Can evolve while retaining compatibility for minor release boundaries.; can break compatibility
   * only at major release (ie. at m.0).
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
  @interface Stable {}

  /** Evolving, but can break compatibility at minor release (i.e. m.x) */
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
  @interface Evolving {}

  /**
   * No guarantee is provided as to reliability or stability across any level of release
   * granularity.
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
  @interface Unstable {}
}
