package com.datasource;

public class DBUtility {

    private static Connection connection;

    //build the connection object
    static Connection buildConnection() {
        return connection = new Connection();
    }
}
