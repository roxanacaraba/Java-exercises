package com.nagarro.remotelearning;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Server server = new Server(queue, 10);
        Thread producer1 = new Producer(server, "Message from thread 1");
        Thread producer2 = new Producer(server, "Message from thread 2");
        Thread producer3 = new Producer(server, "Message from thread 3");
        Thread consumer = new Consumer(server);
        producer1.start();
        producer2.start();
        producer3.start();
        consumer.start();
    }
}
