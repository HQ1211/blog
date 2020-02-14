package club.banyuan.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @GetMapping("/users/{id}")
    public String show(@PathVariable("id") long id, Model model){
        model.addAttribute("tittle","This is a blog with id="+id);
        model.addAttribute("createdTime","2020-0214");
        model.addAttribute("content","This is content");
        return "index";
    }
}
