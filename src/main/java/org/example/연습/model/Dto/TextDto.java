package org.example.연습.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TextDto {
    private int sno; // 회원
    private int textbno; // 게시글 번호
    private String userid; // 회원 id
    private String userpass; // 회원 pass
    private String userphone; // 회원 휴대폰
    private String useremail; // 회원 이메일
    private String title; // 제목
    private String content; // 내용
    private String uimg; // 이미지
}
