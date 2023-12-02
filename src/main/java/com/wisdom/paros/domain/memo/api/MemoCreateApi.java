package com.wisdom.paros.domain.memo.api;

import com.wisdom.paros.domain.memo.dto.request.MemoCreateDto;
import com.wisdom.paros.domain.memo.service.MemoCreateService;
import com.wisdom.paros.global.util.IpExporter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/memo")
public class MemoCreateApi {

    private final IpExporter ipExporter;
    private final MemoCreateService memoCreateService;

    @PostMapping
    public ResponseEntity create(
            HttpServletRequest httpServletRequest,
            @RequestBody MemoCreateDto memoCreateDto) {
        memoCreateService.create(memoCreateDto, ipExporter.getClientIP(httpServletRequest));
        return ResponseEntity.ok().build();
    }
}