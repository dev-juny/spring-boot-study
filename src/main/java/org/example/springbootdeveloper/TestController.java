package org.example.springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        String content = """
                {
                 "id" : %d,
                 "name" : %s,
                }
                """.formatted(1, "J-Jay");


        return "Hello, world";
    }

}
