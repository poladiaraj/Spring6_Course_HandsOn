package com.rpoladia.quizservice.feign;

import com.rpoladia.quizservice.model.QuestionWrapper;
import com.rpoladia.quizservice.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("QUESTIONSERVICE")
public interface QuizInterface {
    @GetMapping("question/generate")
    public ResponseEntity<List<Integer>> generateQuestionsForQuiz(@RequestParam String categoryName, @RequestParam Integer numQuestions);

    @PostMapping("question/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@RequestBody List<Integer> questionIds);

    @PostMapping("question/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
}
