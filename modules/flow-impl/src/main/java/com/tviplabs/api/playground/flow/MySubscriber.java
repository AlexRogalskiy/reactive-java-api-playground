package com.tviplabs.api.playground.flow;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

@Slf4j
@RequiredArgsConstructor
class MySubscriber<T> implements Subscriber<T> {
  private final String name;
  private Subscription subscription;

  @Override
  public void onComplete() {
    log.info(this.name + ": onComplete");
  }

  @Override
  public void onError(final Throwable t) {
    log.info(this.name + ": onError");
    t.printStackTrace();
  }

  @Override
  public void onNext(final T msg) {
    log.info(this.name + ": " + msg.toString() + " received in onNext");
    this.subscription.request(1);
  }

  @Override
  public void onSubscribe(final Subscription subscription) {
    log.info(this.name + ": onSubscribe");
    this.subscription = subscription;
    subscription.request(1);
  }
}
