package com.tviplabs.api.playground.flow;

import java.util.concurrent.SubmissionPublisher;

public class FlowTest {

  public static void main(final String... args) {
    final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
    final MySubscriber<String> subscriber = new MySubscriber<>("Mine");
    final MySubscriber<String> subscriberYours = new MySubscriber<>("Yours");
    final MySubscriber<String> subscriberHis = new MySubscriber<>("His");
    final MySubscriber<String> subscriberHers = new MySubscriber<>("Her");

    publisher.subscribe(subscriber);
    publisher.subscribe(subscriberYours);
    publisher.subscribe(subscriberHis);
    publisher.subscribe(subscriberHers);

    publisher.submit("One");
    publisher.submit("Two");
    publisher.submit("Three");
    publisher.submit("Four");
    publisher.submit("Five");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    publisher.close();
  }
}
