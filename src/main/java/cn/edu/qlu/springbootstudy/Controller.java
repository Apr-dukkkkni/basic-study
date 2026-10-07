package cn.edu.qlu.springbootstudy;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/test/age")
    public String TestAge( @RequestBody AgeDTO dto){
        return "接收到age：" + dto.getAge();
    }
}
