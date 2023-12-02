package com.wisdom.paros.domain.tag.service.query;

import com.wisdom.paros.domain.tag.entity.MemoTag;
import com.wisdom.paros.domain.tag.repository.MemoTagRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemoTagQueryServiceImpl implements MemoTagQueryService{

    private final MemoTagRepository memoTagRepository;

    @Override
    @Transactional
    public void create(final List<MemoTag> memoTag) {
        memoTagRepository.saveAll(memoTag);
    }
}
