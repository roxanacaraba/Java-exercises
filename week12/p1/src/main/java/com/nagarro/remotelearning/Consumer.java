package com.nagarro.remotelearning;

public class Consumer extends Thread {
    private Server server;

    public Consumer(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (server.getQueue()) {
                while (server.getQueue().isEmpty()) {
                    System.out.println("Queue is empty,"
                            + "Consumer thread is waiting"
                            + " for producer thread to put something in queue");
                    try {
                        server.getQueue().wait();
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                server.getQueue().remove();
                server.getQueue().notifyAll();
            }
        }
    }
}
