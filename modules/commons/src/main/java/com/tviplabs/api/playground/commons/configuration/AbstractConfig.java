package com.tviplabs.api.playground.commons.configuration;

import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.util.Map;

/**
 * Abstract properties configuration with key/value support.
 *
 * @author Alexander Rogalskiy
 * @param <K> type of property key.
 * @param <V> type of property value.
 */
@SuppressWarnings("FallThrough")
@SuperBuilder
public abstract class AbstractConfig<K, V> {

  @Singular("config")
  private final Map<K, V> configMap;
}
