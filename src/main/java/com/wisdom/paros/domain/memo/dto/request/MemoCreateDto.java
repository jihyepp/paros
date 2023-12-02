package com.wisdom.paros.domain.memo.dto.request;

import com.wisdom.paros.domain.memo.entity.Memo;
import com.wisdom.paros.domain.memo.entity.enums.SizeType;
import com.wisdom.paros.domain.tag.entity.MemoTag;
import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;

@Builder
public record MemoCreateDto(
        String title,
        String content,
        boolean isBackground,
        SizeType sizeType,
        List<String> tags) {

    public Memo toEntity(String ip) {
        return Memo.builder()
                .createdIp(ip)
                .title(title)
                .content(content)
                .isBackground(isBackground)
                .sizeType(sizeType)
                .build();
    }

    public List<MemoTag> toMemoTag(Memo memo) {
        return tags.stream().map(s
                        -> MemoTag.builder()
                        .tag(s)
                        .memo(memo)
                        .build())
                .collect(Collectors.toList());
    }
}
