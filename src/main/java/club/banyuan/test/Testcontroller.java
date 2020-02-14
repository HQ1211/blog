package club.banyuan.test;

import club.banyuan.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @GetMapping("/person")
    Person getPerson(@RequestParam String name,Integer age){
        Person p=new Person(name,age);
        return p;
    }

    @GetMapping("/personobj")
    Person getPersonobj(Person p){
        return p;//调用person的构造函数，并返回一个json对象
    }

}
