package com.tviplabs.api.playground.reactor.impl;

import com.tviplabs.api.playground.interfaces.stream.EventEmitter;

/**
 * EventEmitter implementation based on Reactor API.
 *
 * @author Alexander Rogalskiy
 */
public class EventEmitterReactorImpl implements EventEmitter {
  @Override
  public String getName() {
    return this.getClass().getSimpleName();
  }

  @Override
  public void emit() {}
}
