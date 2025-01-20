package com.tokenmagic.gerador_token_magic;

public class Token {
    private String name;
    private String type;
    private String color;
    private String layout;

    public Token(String name, String type, String color, String layout) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.layout = layout;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Token{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", layout='" + layout + '\'' +
                '}';
    }
}
