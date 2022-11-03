package com.tviplabs.api.playground.it;

import lombok.extern.slf4j.Slf4j;

import java.security.Permission;
import java.util.stream.Stream;

/**
 * Application runner for cucumber test scenarios.
 *
 * @author Alexander Rogalskiy
 */
@Slf4j
public final class ApplicationTestRunner {

  /** Default cucumber configuration options */
  private static final String[] DEFAULT_CUCUMBER_OPTIONS = {
    "--glue", "com.tviplabs.api.playground.it.hooks",
    "--glue", "com.tviplabs.api.playground.it.steps",
    "--plugin", "pretty",
    "--plugin", "json:reports/cucumber/report.json",
    "--plugin", "html:reports/cucumber/report.html",
    "--tags", "@rest-api",
    "classpath:features"
  };

  public static void main(final String[] args) {
    System.setSecurityManager(new IgnoreExitCall());

    try {
      final var cucumberOptions =
          Stream.concat(Stream.of(DEFAULT_CUCUMBER_OPTIONS), Stream.of(args))
              .toArray(String[]::new);
      io.cucumber.core.cli.Main.run(cucumberOptions);
    } catch (SecurityException ex) {
      log.error("Processing security exception by ignoring exit", ex);
    }
  }

  /** Security manager patch with ignoring exit call exception */
  private static class IgnoreExitCall extends SecurityManager {

    @Override
    public void checkExit(final int status) {
      // request operations not permitted in current context
      // throw new SecurityException();
    }

    @Override
    public void checkPermission(final Permission permission) {
      // request operations not permitted in current context
      // super.checkPermission(permission);
    }
  }
}
