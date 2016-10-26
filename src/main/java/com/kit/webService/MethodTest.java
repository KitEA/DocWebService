package com.kit.webService;

public class MethodTest {
    private final long id;
    private final String method;

    public MethodTest(long id, String method) {
        this.id = id;
        this.method = method;
    }

    public long getId() {
        return id;
    }

    public String getMethod() {
        return method;
    }
}
