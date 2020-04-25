package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name); //将浏览器传入的值传入model中，便于将其传到上下文中
        return "hello";  //返回“hello”，程序将会自动去resource/templates下去寻找名为hello的html文件
    }
}
