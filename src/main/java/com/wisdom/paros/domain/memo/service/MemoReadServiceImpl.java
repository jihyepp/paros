package com.wisdom.paros.domain.memo.service;

import com.wisdom.paros.domain.memo.dto.response.MemoInfoDto;
import com.wisdom.paros.domain.memo.entity.Memo;
import com.wisdom.paros.domain.memo.service.query.MemoQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemoReadServiceImpl implements MemoReadService {

    private final MemoQueryService memoQueryService;

    @Override
    @Transactional(readOnly = true)
    public MemoInfoDto read(final Long id) {
        Memo memo = memoQueryService.read(id);
        return null;
    }
}
