package com.hemonth.springintegration;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class MyTransformer {

    public String transform(String path) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)));

        return "Transformed content:: "+ content;
    }
}
