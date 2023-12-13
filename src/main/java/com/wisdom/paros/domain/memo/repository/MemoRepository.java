package com.wisdom.paros.domain.memo.repository;

import com.wisdom.paros.domain.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    Optional<Memo> findById(Long id);
}
