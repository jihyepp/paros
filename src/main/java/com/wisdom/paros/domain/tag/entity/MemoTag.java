package com.wisdom.paros.domain.tag.entity;

import com.wisdom.paros.domain.base.entity.BaseEntity;
import com.wisdom.paros.domain.memo.entity.Memo;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "memo_tag")
public class MemoTag extends BaseEntity {

    @Column(name = "tag")
    private String tag;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "memo_id")
    private Memo memo;
}
