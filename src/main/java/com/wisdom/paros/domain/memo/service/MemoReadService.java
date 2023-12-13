package com.wisdom.paros.domain.memo.service;

import com.wisdom.paros.domain.memo.dto.response.MemoInfoDto;

public interface MemoReadService {
    MemoInfoDto read(Long id);
}
