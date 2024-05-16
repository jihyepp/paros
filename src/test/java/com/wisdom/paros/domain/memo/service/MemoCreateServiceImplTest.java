package com.wisdom.paros.domain.memo.service;

import com.wisdom.paros.domain.memo.dto.request.MemoCreateDto;
import com.wisdom.paros.domain.memo.entity.enums.SizeType;
import com.wisdom.paros.global.SpringBootTestSupport;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

import java.util.List;

@Import(MemoCreateServiceImpl.class)
class MemoCreateServiceImplTest extends SpringBootTestSupport {

    @Autowired MemoCreateServiceImpl memoCreateService;

    @Test
    void create() {
        MemoCreateDto memoCreateDto = new MemoCreateDto("제목", "내용", true, SizeType.ONE, List.of("태그1", "태그2"));
        String ip = "1.1.1.1";
        memoCreateService.create(memoCreateDto, ip);
    }
}