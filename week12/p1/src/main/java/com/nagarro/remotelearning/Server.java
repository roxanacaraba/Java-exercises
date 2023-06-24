package com.nagarro.remotelearning;

import java.util.Queue;

public class Server {
    private Queue<String> queue;
    int capacity;

    public Server(Queue<String> queue, int capacity) {
        this.queue = queue;
        this.capacity = capacity;
    }

    public Queue<String> getQueue() {
        return queue;
    }

    public void setQueue(Queue<String> queue) {
        this.queue = queue;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
