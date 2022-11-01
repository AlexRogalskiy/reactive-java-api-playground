/**
 * The MIT License (MIT)
 *
 * <p>Copyright (c) 2021-present Alexander Rogalskiy
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.tviplabs.api.playground.commons.exception;

import com.tviplabs.api.playground.commons.enumerations.ErrorPropertyType;
import com.tviplabs.api.playground.commons.interfaces.PropertyTemplate;
import lombok.NonNull;

import java.util.function.Supplier;

/** Configuration {@link LocalizableException} implementation */
public class ServiceResolutionException extends LocalizableException {
  /** Default explicit serialVersionUID for interoperability */
  private static final long serialVersionUID = -2297995868660672241L;

  /**
   * {@link ServiceResolutionException} constructor with initial input message
   *
   * @param template initial input {@link PropertyTemplate} message
   * @param args initial input message {@link Object} collection of message arguments
   */
  public ServiceResolutionException(final PropertyTemplate template, final Object... args) {
    super(template, args);
  }

  /**
   * Returns {@link ServiceResolutionException} by input parameters
   *
   * @param template initial input {@link PropertyTemplate} message
   * @param args initial input message {@link Object} collection of message arguments
   * @return {@link ServiceResolutionException}
   */
  @NonNull
  public static Supplier<ServiceResolutionException> createError(
      final PropertyTemplate template, final Object... args) {
    return () -> new ServiceResolutionException(template, args);
  }

  /**
   * Returns {@link ServiceResolutionException} by input parameters
   *
   * @param args initial input message arguments {@link Object}
   * @return port {@link ServiceResolutionException}
   */
  @NonNull
  public static Supplier<ServiceResolutionException> createServiceResolutionError(
      final Object... args) {
    return createError(ErrorPropertyType.SERVICE_RESOLUTION_ERROR, args);
  }
}
