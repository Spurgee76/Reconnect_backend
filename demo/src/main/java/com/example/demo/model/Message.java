package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Messages_table")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long messageId;

    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private User sender; // Changed from `user` to `User`

    @ManyToOne
    @JoinColumn(name = "receiver_id", nullable = false)
    private User receiver; // Changed from `user` to `User`

    @Column(name = "message", nullable = false) // Keeps DB name the same
    private String content; // Changed from `message` to `content` in Java

    @Column(name = "sent_at", nullable = false)
    private LocalDateTime sentAt;

    // Constructors
    public Message() {}

    public Message(User sender, User receiver, String content, LocalDateTime sentAt) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.sentAt = sentAt;
    }

    // Getters and Setters
    public Long getMessageId() { return messageId; }
    public void setMessageId(Long messageId) { this.messageId = messageId; }

    public User getSender() { return sender; }
    public void setSender(User sender) { this.sender = sender; }

    public User getReceiver() { return receiver; }
    public void setReceiver(User receiver) { this.receiver = receiver; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public LocalDateTime getSentAt() { return sentAt; }
    public void setSentAt(LocalDateTime sentAt) { this.sentAt = sentAt; }
}
