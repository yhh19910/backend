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

import com.lwdevelop.backend.Dao.PostRepository;
import com.lwdevelop.backend.Model.Post;

@RestController
@RequestMapping("/api")
public class PostController {
    
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public Collection<Post> posts() {
        return postRepository.findAll();
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<?> getPost(@PathVariable Long id) {
        Optional<Post> post = postRepository.findById(id);
        return post.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
