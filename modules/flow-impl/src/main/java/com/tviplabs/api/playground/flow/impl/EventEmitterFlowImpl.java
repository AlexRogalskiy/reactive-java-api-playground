package com.tviplabs.api.playground.flow.impl;

import com.tviplabs.api.playground.interfaces.stream.EventEmitter;

/**
 * EventEmitter implementation based on Flow API.
 *
 * @author Alexander Rogalskiy
 */
public class EventEmitterFlowImpl implements EventEmitter {
  @Override
  public String getName() {
    return this.getClass().getSimpleName();
  }

  @Override
  public void emit() {}
}
