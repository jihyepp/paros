package com.wisdom.paros.domain.memo.repository;

import com.wisdom.paros.domain.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
