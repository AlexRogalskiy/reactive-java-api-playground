package com.tviplabs.api.playground.flow;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class EndSubscriber<T> implements Flow.Subscriber<T> {

  private final String name;
  private final AtomicInteger howMuchMessagesConsume;

  private final List<T> consumedElements = new LinkedList<>();
  private Flow.Subscription subscription;

  public EndSubscriber(final String name, final Integer howMuchMessagesConsume) {
    this.name = name;
    this.howMuchMessagesConsume = new AtomicInteger(howMuchMessagesConsume);
  }

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
  public void onNext(final T item) {
    this.howMuchMessagesConsume.decrementAndGet();
    log.info("Got : " + item);
    this.consumedElements.add(item);
    if (this.howMuchMessagesConsume.get() > 0) {
      this.subscription.request(1);
    }
  }

  @Override
  public void onSubscribe(final Flow.Subscription subscription) {
    this.subscription = subscription;
    subscription.request(1);
  }
}
