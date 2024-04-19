package com.lwdevelop.backend.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lwdevelop.backend.Model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}

