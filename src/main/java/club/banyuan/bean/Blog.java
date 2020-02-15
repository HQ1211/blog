package club.banyuan.bean;

import lombok.Data;

import java.util.Date;

@Data//相当于get set方法
public class Blog {
    private Integer id;
    private String title;
    private String content;
    private Date createdTime;
    private Integer userId;
}
