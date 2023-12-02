package com.wisdom.paros.domain.memo.service.query;

import com.wisdom.paros.domain.memo.entity.Memo;
import com.wisdom.paros.domain.memo.repository.MemoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemoQueryServiceImpl implements MemoQueryService {

    private final MemoRepository memoRepository;

    @Override
    @Transactional
    public Memo create(final Memo memo) {
        return memoRepository.save(memo);
    }
}
