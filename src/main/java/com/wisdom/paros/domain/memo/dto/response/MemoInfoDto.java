package com.wisdom.paros.domain.memo.dto.response;

import com.wisdom.paros.domain.memo.entity.Memo;
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
        List<String> memoTags,
        LocalDateTime createAt,
        LocalDateTime updateAt) {

    public static MemoInfoDto of(Memo memo) {
        return MemoInfoDto.builder()
                .title(memo.getTitle())
                .content(memo.getContent())
                .isBackground(memo.getIsBackground())
                .sizeType(memo.getSizeType())
                .createAt(memo.getCreatedAt())
                .updateAt(memo.getUpdatedAt())
//                .memoTags(memo.getMemoTags().stream().map(MemoTag::getTag).toList())
                .build();
    }
}
