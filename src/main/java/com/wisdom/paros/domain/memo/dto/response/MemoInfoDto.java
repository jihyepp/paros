package com.wisdom.paros.domain.memo.dto.response;

import com.wisdom.paros.domain.memo.entity.enums.SizeType;
import com.wisdom.paros.domain.tag.entity.MemoTag;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public record MemoInfoDto(
        String title,
        String content,
        boolean isBackground,
        SizeType sizeType,
        List<MemoTag> memoTags,
        LocalDateTime createAt,
        LocalDateTime updateAt) {
}
