package club.banyuan.service;

import club.banyuan.bean.Blog;
import club.banyuan.dao.BlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    private BlogDao blogDao;

    @Autowired
    public BlogService(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    public List<Blog> getBlogsByUserName(String username){
        return blogDao.selectBlogByUserName(username);
    }

    public List<Blog> getPageBlogByUserName(String username,Integer page,Integer size){
        Integer offset=(page-1)*size;
        return blogDao.selectBlogByUserNameWithPageInfo(username,offset,size);
    }

}
