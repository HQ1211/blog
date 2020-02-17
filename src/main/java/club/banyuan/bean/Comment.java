package club.banyuan.bean;

import lombok.Data;

import java.util.Date;

@Data//相当于get set方法
public class Comment {
    private Integer id;
    private String content;
    private Date createdTime;
    private Integer userId;
    private Integer blogId;
}
