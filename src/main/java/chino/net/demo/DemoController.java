package chino.net.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping
    public String hello() {
        // template/hello.html のページを表示する意味。
        return "hello.html";
    }
}
