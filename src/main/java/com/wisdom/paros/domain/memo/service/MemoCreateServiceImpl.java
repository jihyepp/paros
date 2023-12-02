package com.wisdom.paros.domain.memo.service;

import com.wisdom.paros.domain.memo.dto.request.MemoCreateDto;
import com.wisdom.paros.domain.memo.entity.Memo;
import com.wisdom.paros.domain.memo.service.query.MemoQueryService;
import com.wisdom.paros.domain.tag.service.query.MemoTagQueryService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoCreateServiceImpl implements MemoCreateService{

    private final MemoQueryService memoQueryService;
    private final MemoTagQueryService memoTagQueryService;

    @Override
    @Transactional
    public void create(final MemoCreateDto memoCreateDto, final String ip) {
        Memo memo = memoQueryService.create(memoCreateDto.toEntity(ip));
        memoTagQueryService.create(memoCreateDto.toMemoTag(memo));
    }
}
