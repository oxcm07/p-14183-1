package com.back.domain.post.postComment.dto;

import com.back.domain.post.postComment.entity.PostComment;
import jakarta.annotation.Nonnull;

import java.time.LocalDateTime;

public record PostCommentDto(
        @Nonnull int id,
        @Nonnull LocalDateTime createDate,
        @Nonnull LocalDateTime modifyDate,
        @Nonnull int authorId,
        @Nonnull String authorName,
        @Nonnull int postId,
        @Nonnull String content
) {
    public PostCommentDto(PostComment postComment) {
        this(
                postComment.getId(),
                postComment.getCreateDate(),
                postComment.getModifyDate(),
                postComment.getAuthor().getId(),
                postComment.getAuthor().getName(),
                postComment.getPost().getId(),
                postComment.getContent()
        );
    }
}