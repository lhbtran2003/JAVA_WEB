package liliana.session_9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CloudController {
    @Autowired
    Environment env;
    @GetMapping("/a")
    public String a(@Value("${cloud.name}") String cloudName) {
        env.getProperty("cloud.name");
        System.out.println(cloudName);
        return "a";
    }
}
