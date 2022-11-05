package com.tviplabs.api.playground.samples.utils;

import lombok.experimental.UtilityClass;

import java.util.UUID;

/** String utilities. */
@UtilityClass
public class StringUtils {

  public static String generateUuid() {
    return UUID.randomUUID().toString();
  }
}
