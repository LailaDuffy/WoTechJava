package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.Message;
import com.datorium.Datorium.API.Services.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    private MessageService messageService;

    public MessageController(){
        messageService = new MessageService();
        // This code runs first when creating UserController object
    }
    //CRUD
    //AddUser
    //UpdateUser
    //GetUser
    //DeleteUser

    @PostMapping("/reply") //localhost:8080/test --> localhost:8080/user/test
    public String reply(@RequestBody Message message) {
        return messageService.sendText(message);
    }
}
