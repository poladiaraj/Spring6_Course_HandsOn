package com.rpoladia.quizappmono.quiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Response {
    private Integer id;
    private String response;
}
