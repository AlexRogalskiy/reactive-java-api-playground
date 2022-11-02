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
package com.tviplabs.api.playground.commons.enumerations;

import com.tviplabs.api.playground.commons.interfaces.PropertyTemplate;
import com.tviplabs.api.playground.extensions.annotations.GenerateResourceBundle;
import lombok.Getter;
import lombok.ToString;

/** Supported error property type. */
@ToString
@GenerateResourceBundle
public enum ErrorPropertyType implements PropertyTemplate {
  /** Unsupported messages basename */
  CONFIGURATION_MESSAGES_BASENAME_ERROR(
      "configuration.messages.basename.invalid", "Message basename error"),
  /** Unsupported service name */
  SERVICE_DISCOVERY_RESOLUTION_ERROR(
      "service.discovery.resolution.invalid", "Service name resolution error"),
  /** Invalid json parse exception */
  DATA_JSON_PARSE_ERROR("data.json.parse.invalid", "Json parsing format error"),
  /** Invalid yaml parse exception */
  DATA_YAML_PARSE_ERROR("data.yaml.parse.invalid", "Yaml parsing format error");

  /** {@link String} error key */
  @Getter(onMethod_ = {@Override})
  private final String key;
  /** {@link String} error description */
  @Getter(onMethod_ = {@Override})
  private final String description;

  /**
   * Default error template constructor by input {@link String} error code
   *
   * @param key initial input {@link String} code to operate by
   * @param description initial input {@link String} description to operate by
   */
  ErrorPropertyType(final String key, final String description) {
    this.key = NamespaceType.ERROR.apply(key);
    this.description = description;
  }
}
