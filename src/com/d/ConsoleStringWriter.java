package com.d;

public class ConsoleStringWriter implements StringWriter {
    @Override
    public void write(String data) {
        System.out.println("Output: " + data);
    }
}
