package club.banyuan.controller;

import club.banyuan.bean.Blog;
import club.banyuan.bean.User;
import club.banyuan.service.BlogService;
import club.banyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class BlogController {
    @Autowired
    private UserService userService;
    @Autowired
    private BlogService blogService;

    @GetMapping("/user/{username}")
    String getUserBlogs(@PathVariable String username,
                        @RequestParam(required = false, defaultValue = "1") Integer page,
                        @RequestParam(required = false, defaultValue = "10") Integer size,
                        Model model) {
        //username -> user
        //userService ->getUserByUserName
        User user=userService.findUserByName(username);

        //username -> List<Blog> -> blogs
        //blogService ->getBlogsByUserName
        List<Blog> blogs=blogService.getPageBlogByUserName(username,page,size);

        //判断是否有上一页
        boolean hasPre=page ==1 ?false:true;

        //判断是否有下一页
        List<Blog> nextPageBlogs=blogService.getPageBlogByUserName(username,page+1,size);
        boolean hasNext=(nextPageBlogs.size()==0)?false:true;


        model.addAttribute("blogs",blogs);
        model.addAttribute("user",user);
        model.addAttribute("hasPre",hasPre);
        model.addAttribute("hasNext",hasNext);
        model.addAttribute("page",page);




        return "list";

    }
}
