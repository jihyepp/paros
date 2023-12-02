package com.wisdom.paros.domain.tag.repository;

import com.wisdom.paros.domain.tag.entity.MemoTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoTagRepository extends JpaRepository<MemoTag, Long> {
}
