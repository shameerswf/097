package com.mgi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

 
@Controller
public class HelloWorldController {
	@RequestMapping("/helloworld.do")
    public String sayHello(){
        System.out.println("Hello World from Controller shameer ");
        return "hellomvc";
    }
}
