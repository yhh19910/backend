package com.lwdevelop.backend.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id", unique = true, nullable = false, length = 50)
    private Long CommentId;
    @NonNull
    @Column(name = "content", nullable = false, length = 50)
    private String Content;
    @ManyToOne
    @JoinColumn(name = "mid")
    @NonNull
    private Member member;
    @ManyToOne
    @JoinColumn(name = "post_id")
    @NonNull
    private Post post;
    private Date createTime; 
}
