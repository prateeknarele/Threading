package com.datasource;

public class SingletonDBConnectionDemo {
    public static void main(String[] args) {
        SingleConnection singleConnection = SingleConnection.SINGLE_CONNECTION_INSTANCE;
        Connection connection1 = singleConnection.getConnection();
        Connection connection2 = singleConnection.getConnection();

        System.out.println("Singleton connection obj1 " + connection1.hashCode());
        System.out.println("Singleton connection obj2 " + connection2.hashCode());

        System.out.println("Output for connection1.show() :: ");
        connection1.show();
        System.out.println("Output for connection2.show() :: ");
        connection2.show();

    }
}
