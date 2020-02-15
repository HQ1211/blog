package club.banyuan.test;

import org.springframework.web.bind.annotation.*;

import javax.json.Json;

@RestController
@RequestMapping("test/{username}")
public class TestController02 {

    @GetMapping
    String getPerson(@PathVariable String username,
                     @RequestParam(name="page",required = false,defaultValue = "1") Integer page,
    @RequestParam(name="size",required = false,defaultValue = "10") Integer size){
        String json= Json.createObjectBuilder()
                .add("name",username)
                .add("page",page)
                .add("size",size)
                .build().toString();
        return json;

    }
}
