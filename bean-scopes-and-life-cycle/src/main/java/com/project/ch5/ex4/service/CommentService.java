package com.project.ch5.ex4.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {
    public CommentService() {
        System.out.println("CommentService instance created~");
    }
}
