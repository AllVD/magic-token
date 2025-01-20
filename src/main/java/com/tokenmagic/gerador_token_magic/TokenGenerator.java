package com.tokenmagic.gerador_token_magic;

import java.util.Scanner;

public class TokenGenerator {

    public static Token generateToken() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the token:");
        String name = scanner.nextLine();

        System.out.println("Enter the type of the token:");
        String type = scanner.nextLine();

        System.out.println("Enter the color of the token:");
        String color = scanner.nextLine();

        System.out.println("Choose a layout (or leave blank for no layout):");
        String layout = scanner.nextLine();
        
        if (layout.isEmpty()) {
            System.out.println("No layout chosen. The token will have no specific layout.");
            layout = "No Layout";
        }

        return new Token(name, type, color, layout);
    }
}
