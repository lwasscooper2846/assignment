package com.liamcooper.assignment.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GuestBookWebController {



    @GetMapping("/web")
    public String displayGuestBook() {
        return "guestbook";
    }

}