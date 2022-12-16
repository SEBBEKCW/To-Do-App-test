package Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class RecommendationsController {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}
