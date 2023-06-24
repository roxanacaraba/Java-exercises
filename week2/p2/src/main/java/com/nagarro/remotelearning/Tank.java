package main.java.com.nagarro.remotelearning;

public class Tank {
    private class Node {
        Student data;
        Node link;
    }

    private Node top;

    public Tank() {
        this.top = null;
    }

    public void push(Student student) {
        Node temp = new Node();
        temp.data = student;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public Student peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Tank is empty");
            return null;
        }
    }

    public boolean pop() {
        if (top == null) {
            return false;
        }
        top = top.link;
        return true;
    }

    public void display() throws Exception {
        if (top == null) {
            throw new Exception("Stack underflow");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data.toString());
                temp = temp.link;
            }
        }
    }
    @Override
    public void finalize() {
        if(isEmpty()) {
            System.out.println("Finalize method is called.");
        }
    }
}

