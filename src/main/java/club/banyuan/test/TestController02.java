package club.banyuan.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController02 {

    @GetMapping("user/{username}")
    String getPerson(@RequestParam(name="page",required = false,defaultValue = "1") Integer page,
    @RequestParam(name="size",required = false,defaultValue = "10") Integer size){
        return "list";

    }
}
