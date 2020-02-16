package club.banyuan.dao;

import club.banyuan.bean.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogDao {
    List<Blog> selectBlogByUserName(String username);
    //分页接口 offset-> 共多少条 limit-> 每页多少条
    List<Blog> selectBlogByUserNameWithPageInfo(String username,Integer offset,Integer limit);
}
