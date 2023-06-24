package com.nagarro.remotelearning;

public class Producer extends Thread {
    private String message;
    private Server server;

    public Producer(Server server, String message) {
        this.server = server;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (server.getQueue()) {
                while (server.getQueue().size() == server.getCapacity()) {
                    try {
                        System.out .println("Queue is full, "
                                + "Producer thread waiting for consumer to take something from queue");
                        server.getQueue().wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                server.getQueue().add(this.message);
                server.getQueue().notifyAll();
            }
        }
    }
}

