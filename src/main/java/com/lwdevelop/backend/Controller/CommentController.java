package com.lwdevelop.backend.Controller;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwdevelop.backend.Dao.CommentRepository;
import com.lwdevelop.backend.Model.Comment;

@RestController
@RequestMapping("/api")
public class CommentController {
    
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/comments")
    public Collection<Comment> comments() {
        return commentRepository.findAll();
    }

    @GetMapping("/comment/{id}")
    public ResponseEntity<?> getComment(@PathVariable Long id) {
        Optional<Comment> comment = commentRepository.findById(id);
        return comment.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
