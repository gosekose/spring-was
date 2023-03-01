package hello.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodByeController {

    @GetMapping("/goodbye")
    public String bye() {
        return "GoodBye";
    }

}
