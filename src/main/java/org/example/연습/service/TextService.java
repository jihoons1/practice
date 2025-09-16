package org.example.연습.service;

import lombok.RequiredArgsConstructor;
import org.example.연습.controller.TextController;
import org.example.연습.model.Dto.TextDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TextService {
    private final TextController textController;

    // 회원
    public boolean useradd(TextDto dto){
        System.out.println("TextService.useradd");
        boolean result = textController.useradd(dto);
        return result;
    }
}
