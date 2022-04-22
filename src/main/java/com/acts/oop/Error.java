package com.acts.oop;

public class Error {
    private boolean active;
    private int status;
    private String msg;

    public Error(boolean active, int status, String msg) {
        this.active = active;
        this.status = status;
        this.msg = msg;
    }

    public Error() {
    }

    public void println() {
        System.out.println("Error: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + msg);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 1, "Error status 1");
        error.println();
        Error error1 = new Error(true, 5, "Error status 5");
        error1.println();
        Error error2 = new Error();
        error2.println();
    }
}
