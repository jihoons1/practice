package org.example.연습.controller;

import lombok.RequiredArgsConstructor;
import org.example.연습.model.Dto.TextDto;
import org.example.연습.service.TextService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TextController {
    private final TextService textService;


    // 회원 가입
    @PostMapping("")
    public ResponseEntity<boolean> useradd(@RequestBody TextDto dto){
        System.out.println("TextController.useradd");
        boolean result = textService.useradd(dto);
        return ResponseEntity.ok().body(result);
    }

}
