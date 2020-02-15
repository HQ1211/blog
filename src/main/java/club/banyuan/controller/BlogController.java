package club.banyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class BlogController {

    @GetMapping("/user/{username}")
    String getUserBlogs(@PathVariable String username,
                        @RequestParam(required = false, defaultValue = "1") Integer page,
                        @RequestParam(required = false, defaultValue = "10") Integer size,
                        Model model) {
        //username -> user -> (构造selectUserByName方法)
        //username -> List<Blog> ->blogs(view渲染) ->（构造selectBlogByUserName方法）

//        model.addAttribute("blogs",blogs);
//        model.addAttribute("user",user);


        return "list";

    }
}
