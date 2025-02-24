package com.d;

public class Main {
    public static void main(String[] args) {
        StringReader reader = new ConsoleStringReader();
        StringWriter writer = new ConsoleStringWriter();

        StringProcessor processor = new StringProcessor(reader, writer);
        processor.processString();
    }
}
