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
package com.tviplabs.api.playground.commons.factories;

import com.tviplabs.api.playground.commons.enumerations.ConfigPropertyType;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.tviplabs.api.playground.commons.exceptions.ConfigurationException.createMessagesBasenameError;
import static com.tviplabs.api.playground.commons.utils.ConfigurationUtils.getProperty;
import static com.tviplabs.api.playground.commons.utils.ServiceUtils.getPropertyValueAsString;

/** Configuration factory that provides configuration properties */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConfigurationFactory {

  /** Configuration factory default instance */
  private static final ConfigurationFactory INSTANCE = new ConfigurationFactory();

  /**
   * Returns default {@link ConfigurationFactory} instance.
   *
   * @return configuration factory
   */
  public static ConfigurationFactory getInstance() {
    return INSTANCE;
  }

  //  /**
  //   * Returns {@link String} server scheme.
  //   *
  //   * @return server scheme
  //   */
  //  public String getServerScheme() {
  //    final var property =
  //        getEnvProperty(PlatformVariables.CONFIG_APP_SCHEME,
  // ConfigPropertyType.CONFIG_APP_SCHEME);
  //    return getPropertyValueAsString(property).orElseThrow(createSchemeError(property));
  //  }

  //  /**
  //   * Returns {@link String} server host.
  //   *
  //   * @return server host
  //   */
  //  public String getServerHost() {
  //    final var property =
  //        getEnvProperty(PlatformVariables.CONFIG_APP_HOST, ConfigPropertyType.CONFIG_APP_HOST);
  //    return getPropertyValueAsString(property).orElseThrow(createHostError(property));
  //  }

  /**
   * Returns {@link String} messages basename.
   *
   * @return messages basename
   */
  public String getMessagesBasename() {
    final var property = getProperty(ConfigPropertyType.CONFIG_MESSAGES_BASENAME);
    return getPropertyValueAsString(property).orElseThrow(createMessagesBasenameError(property));
  }

  //  /**
  //   * Returns {@code int} server port.
  //   *
  //   * @return server port
  //   */
  //  public int getServerPort() {
  //    final var property =
  //        getEnvProperty(PlatformVariables.CONFIG_APP_PORT, ConfigPropertyType.CONFIG_APP_PATH);
  //    return getPropertyValueAsInt(property)
  //        .filter(ServiceUtils::isPositive)
  //        .orElseThrow(createPortError(property));
  //  }

  //  /**
  //   * Returns {@link String} server path.
  //   *
  //   * @return server path
  //   */
  //  public String getServerPath() {
  //    final var property =
  //        getEnvProperty(PlatformVariables.CONFIG_APP_PATH, ConfigPropertyType.CONFIG_APP_PATH);
  //    return getPropertyValueAsString(property)
  //        .map(value -> !value.startsWith("/") ? "/" + value : value)
  //        .orElseThrow(createPathError(property));
  //  }

  //  /**
  //   * Returns {@link String} templates directory.
  //   *
  //   * @return templates directory
  //   */
  //  public String getTemplatesDir() {
  //    final var property =
  //        getEnvProperty(
  //            PlatformVariables.CONFIG_TEMPLATES_DIR,
  // ConfigPropertyType.CONFIG_TEMPLATES_BASEDIR);
  //    return getPropertyValueAsString(property)
  //        .map(Paths::get)
  //        .map(Path::normalize)
  //        .map(Path::toAbsolutePath)
  //        .map(Path::toString)
  //        .orElseThrow(createTemplatesError(property));
  //  }

  //  /**
  //   * Returns {@link Duration} connect timeout.
  //   *
  //   * @return connect timeout (in millis)
  //   */
  //  public Duration getConnectTimeout() {
  //    final var property = getProperty(ConfigPropertyType.CONFIG_CLIENT_CONNECT_TIMEOUT);
  //    return getPropertyValueAsLong(property)
  //        .filter(ServiceUtils::isPositive)
  //        .map(Duration::ofMillis)
  //        .orElse(DEFAULT_CONNECT_TIMEOUT);
  //  }

  //  /**
  //   * Returns {@link Duration} connection request timeout.
  //   *
  //   * @return connection request timeout (in millis)
  //   */
  //  public Duration getConnectionRequestTimeout() {
  //    final var property =
  // getProperty(ConfigPropertyType.CONFIG_CLIENT_CONNECTION_REQUEST_TIMEOUT);
  //    return getPropertyValueAsLong(property)
  //        .filter(ServiceUtils::isPositive)
  //        .map(Duration::ofMillis)
  //        .orElse(DEFAULT_CONNECTION_REQUEST_TIMEOUT);
  //  }

  //  /**
  //   * Returns {@link Duration} socket timeout.
  //   *
  //   * @return socket timeout (in millis)
  //   */
  //  public Duration getSocketTimeout() {
  //    final var property = getProperty(ConfigPropertyType.CONFIG_CLIENT_SOCKET_TIMEOUT);
  //    return getPropertyValueAsLong(property)
  //        .filter(ServiceUtils::isPositive)
  //        .map(Duration::ofMillis)
  //        .orElse(DEFAULT_SOCKET_TIMEOUT);
  //  }
}
