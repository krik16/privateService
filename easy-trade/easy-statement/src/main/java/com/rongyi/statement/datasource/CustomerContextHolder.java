package com.rongyi.statement.datasource;

public class CustomerContextHolder {

    private CustomerContextHolder() {

    }

    public static final String DATA_SOURCE = "sqlSessionFactory";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }

    public static String getCustomerType() {
        return contextHolder.get();
    }

    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
