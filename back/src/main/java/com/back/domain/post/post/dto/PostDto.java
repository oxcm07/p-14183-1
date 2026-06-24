package com.back.domain.post.post.dto;

import com.back.domain.post.post.entity.Post;
import jakarta.annotation.Nonnull;

import java.time.LocalDateTime;

public record PostDto(
        @Nonnull int id,
        @Nonnull LocalDateTime createDate,
        @Nonnull LocalDateTime modifyDate,
        @Nonnull int authorId,
        @Nonnull String authorName,
        @Nonnull String title,
        @Nonnull String summary
) {
    public PostDto(Post post) {
        this(
                post.getId(),
                post.getCreateDate(),
                post.getModifyDate(),
                post.getAuthor().getId(),
                post.getAuthor().getName(),
                post.getTitle(),
                post.getSummary()
        );
    }
}