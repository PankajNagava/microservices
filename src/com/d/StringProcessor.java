package com.d;

public class StringProcessor {
    private final StringReader stringReader;
    private final StringWriter stringWriter;

    public StringProcessor(StringReader stringReader, StringWriter stringWriter) {
        this.stringReader = stringReader;
        this.stringWriter = stringWriter;
    }

    public void processString() {
        String data = stringReader.read();
        stringWriter.write(data);
    }
}
