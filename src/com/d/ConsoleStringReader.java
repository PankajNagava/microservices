package com.d;

import java.util.Scanner;

public class ConsoleStringReader implements StringReader {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String read() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
}
