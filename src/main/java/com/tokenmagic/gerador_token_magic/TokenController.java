package com.tokenmagic.gerador_token_magic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tokens")
public class TokenController {

    @PostMapping("/generate")
    public Token generateToken(@RequestParam String name, @RequestParam String type, @RequestParam String color, @RequestParam(required = false) String layout) {
        if (layout == null || layout.isEmpty()) {
            layout = "No Layout";
        }
        return new Token(name, type, color, layout);
    }

    @GetMapping("/template")
    public String getTemplate(@RequestParam String choice) {
        return TokenTemplate.getTemplate(choice);
    }
}
