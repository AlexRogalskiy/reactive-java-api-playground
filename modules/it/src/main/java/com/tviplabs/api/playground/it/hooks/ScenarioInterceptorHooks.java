package com.tviplabs.api.playground.it.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ScenarioInterceptorHooks {

  @BeforeAll
  public static void beforeAllScenarios() {
    log.info(">>> Before running all test scenarios >>>");
  }

  @AfterAll
  public static void afterAllScenarios() {
    log.info(">>> After running all test scenarios >>>");
  }

  @Before
  public void beforeScenario() {
    log.info(">>> Before running test scenario step >>>");
  }

  @After
  public void afterScenario() {
    log.info(">>> After running test scenario step >>>");
  }
}
