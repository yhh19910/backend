package com.lwdevelop.backend.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CommentId;
    @NonNull
    private String Content;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @NonNull
    private Member member;
    @ManyToOne
    @JoinColumn(name = "post_id")
    @NonNull
    private Post post;
    private Date createTime; 
}
