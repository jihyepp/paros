package com.wisdom.paros.domain.memo.service.query;

import com.wisdom.paros.domain.memo.entity.Memo;

public interface MemoQueryService {
    Memo create(Memo memo);

    Memo read(Long id);
}
