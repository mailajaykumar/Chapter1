package pcf.text.example.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code")
public class HelloController {

    @GetMapping("/hello")
    public String GetHello(){
        return "This test hello1_111s";
    }
}
