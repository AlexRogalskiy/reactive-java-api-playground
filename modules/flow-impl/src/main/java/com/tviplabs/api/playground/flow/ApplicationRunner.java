package com.tviplabs.api.playground.flow;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Flow;

/**
 * ApplicationRunner.
 *
 * @author Alexander Rogalskiy
 */
@Slf4j
public class ApplicationRunner {

  public static void main(final String... args) {
    final Flow.Publisher<Integer> publisherSync =
        subscriber -> {
          for (int i = 0; i < 10; i++) {
            log.info(Thread.currentThread().getName() + " | Publishing = " + i);
            subscriber.onNext(i);
          }
          subscriber.onComplete();
        };

    final Flow.Subscriber<Integer> subscriberSync =
        new Flow.Subscriber<>() {
          @Override
          public void onSubscribe(final Flow.Subscription subscription) {}

          @Override
          public void onNext(final Integer item) {
            log.info(Thread.currentThread().getName() + " | Received = " + item);
            try {
              Thread.sleep(100);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }

          @Override
          public void onError(final Throwable throwable) {}

          @Override
          public void onComplete() {}
        };

    publisherSync.subscribe(subscriberSync);
  }
}
