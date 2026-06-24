package com.back.domain.member.member.dto;

import com.back.domain.member.member.entity.Member;
import jakarta.annotation.Nonnull;

import java.time.LocalDateTime;

public record MemberDto(
        @Nonnull int id,
        @Nonnull LocalDateTime createDate,
        @Nonnull LocalDateTime modifyDate,
        @Nonnull String name
) {
    public MemberDto(Member member) {
        this(
                member.getId(),
                member.getCreateDate(),
                member.getModifyDate(),
                member.getName()
        );
    }
}