package com.tokenmagic.gerador_token_magic;

import java.util.HashMap;
import java.util.Map;

public class TokenTemplate {
    private static final Map<String, String> templates = new HashMap<>();

    static {
        templates.put("1", "Template 1");
        templates.put("2", "Template 2");
        templates.put("3", "Template 3");
    }

    public static String getTemplate(String choice) {
        return templates.getOrDefault(choice, "Default Layout");
    }
}