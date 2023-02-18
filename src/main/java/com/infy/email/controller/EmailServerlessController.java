package com.infy.email.controller;

import com.infy.email.model.EmailServerless;
import com.infy.email.service.EmailServerlessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class EmailServerlessController {

    private final EmailServerlessService emailServerlessService;
    EmailServerlessController(EmailServerlessService emailServerlessService){
        this.emailServerlessService = emailServerlessService;
    }

    @PostMapping("/email")
    public String sendEmail(@RequestBody EmailServerless emailServerless){
        return emailServerlessService.sendEmail(emailServerless.getTo(), emailServerless.getSubject(), emailServerless.getMessage());
    }

}
