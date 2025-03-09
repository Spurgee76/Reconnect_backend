package com.example.demo.Controller;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Allows frontend access
@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    // Fetch all messages
    @GetMapping
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    // Send a message
    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }
}
