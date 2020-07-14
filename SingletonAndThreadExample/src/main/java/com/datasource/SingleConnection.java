package com.datasource;

public enum SingleConnection {
    SINGLE_CONNECTION_INSTANCE;

    private final Connection connection;

    //get db connection from db utility/factory method/class
    private SingleConnection() {
        connection = DBUtility.buildConnection();
    }

    public static SingleConnection getInstance()
    {
        return SINGLE_CONNECTION_INSTANCE;
    }

    public Connection getConnection()
    {
        return connection;
    }
}
