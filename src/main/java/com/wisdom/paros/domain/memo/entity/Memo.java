package com.wisdom.paros.domain.memo.entity;

import com.wisdom.paros.domain.base.entity.BaseEntity;
import com.wisdom.paros.domain.memo.entity.enums.SizeType;
import com.wisdom.paros.domain.tag.entity.MemoTag;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.CreatedBy;

import java.util.ArrayList;
import java.util.List;

@Builder
@Entity
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "memo")
public class Memo extends BaseEntity{

    //생성자 ip
    @CreatedBy
    @Column(name = "created_ip")
    private String createdIp;

    @Column(name = "is_background")
    private Boolean isBackground;

    @Enumerated(EnumType.STRING)
    @Column(name = "size_type")
    private SizeType sizeType;

    @Column(name = "title", length = 1000)
    private String title;

    @Column(name = "content", columnDefinition = "LONGTEXT")
    private String content;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MemoTag> memoTags;
}
