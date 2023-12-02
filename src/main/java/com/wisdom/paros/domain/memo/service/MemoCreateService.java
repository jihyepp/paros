package com.wisdom.paros.domain.memo.service;

import com.wisdom.paros.domain.memo.dto.request.MemoCreateDto;

public interface MemoCreateService {
    void create(MemoCreateDto memoCreateDto, String ip);
}
