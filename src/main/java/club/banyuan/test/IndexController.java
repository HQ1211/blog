package club.banyuan.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/users/{username:[a-z0-9_]+}")
    public String show(@PathVariable String username){
        return "现在访问的用户为："+username;
    }
}
