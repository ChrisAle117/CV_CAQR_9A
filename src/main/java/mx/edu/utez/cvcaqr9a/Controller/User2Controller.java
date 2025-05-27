package mx.edu.utez.cvcaqr9a.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user2")

public class User2Controller {
    @GetMapping("/api/user2")
    public String getUser2() {
        return "Hello from User2!";
    }

}
