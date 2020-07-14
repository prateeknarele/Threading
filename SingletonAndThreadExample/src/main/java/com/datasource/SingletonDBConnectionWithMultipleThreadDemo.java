package com.datasource;

public class SingletonDBConnectionWithMultipleThreadDemo {
    public static void main(String[] args) {
        SingleConnection singleConnection = SingleConnection.SINGLE_CONNECTION_INSTANCE;

        //Create multiple thread and get connection object in each thread, with hashcode conclude each thread has same copy of object
        Runnable task1 = () -> {
            Connection connection = singleConnection.getConnection();
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Connection object hashcode is : " + connection.hashCode());
        };

        Runnable task2 = () -> {
            Connection connection = singleConnection.getConnection();
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Connection object hashcode is : " + connection.hashCode());
        };

        Runnable task3 = () -> {
            Connection connection = singleConnection.getConnection();
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Connection object hashcode is : " + connection.hashCode());
        };

        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
    }
}
