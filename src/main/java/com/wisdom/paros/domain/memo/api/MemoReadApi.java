package com.wisdom.paros.domain.memo.api;

import com.wisdom.paros.domain.memo.dto.response.MemoInfoDto;
import com.wisdom.paros.domain.memo.service.MemoReadService;
import com.wisdom.paros.global.util.IpExporter;
import jakarta.servlet.http.HttpServletRequest;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/memo")
public class MemoReadApi {

    private final IpExporter ipExporter;
    private final MemoReadService memoReadService;

    @GetMapping
    public ResponseEntity<MemoInfoDto> read(
            HttpServletRequest httpServletRequest,
            @RequestParam @NonNull Long id) {
        log.info(ipExporter.getClientIP(httpServletRequest));
        return ResponseEntity.ok().body(memoReadService.read(id));
    }
}