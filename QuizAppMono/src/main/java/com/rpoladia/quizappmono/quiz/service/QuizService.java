package com.rpoladia.quizappmono.quiz.service;

import com.rpoladia.quizappmono.question.dao.QuestionDao;
import com.rpoladia.quizappmono.question.model.Question;
import com.rpoladia.quizappmono.quiz.dao.QuizDao;
import com.rpoladia.quizappmono.quiz.model.QuestionWrapper;
import com.rpoladia.quizappmono.quiz.model.Quiz;
import com.rpoladia.quizappmono.quiz.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    private QuizDao quizDao;

    @Autowired
    private QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, Integer numQ, String title) {
        List<Question>  questions = questionDao.getQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);

        quizDao.save(quiz);

        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuiz(Integer id) {
        Optional<Quiz> quiz = quizDao.findById(id);
        List<Question> questionsFromDb = quiz.get().getQuestions();

        List<QuestionWrapper> questionsForUser = new ArrayList<>();
        for(Question question : questionsFromDb) {
            questionsForUser.add(new QuestionWrapper(question.getId(), question.getQuestionTitle(), question.getOption1(), question.getOption2(), question.getOption3(), question.getOption4()));
        }

        return new ResponseEntity<List<QuestionWrapper>>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int score = 0;
        int i=0;
        for(Response response : responses) {
            if(response.getResponse().equals(questions.get(i).getRightAnswer())) {
                score++;
            }
            i++;
        }

        return new ResponseEntity<Integer>(score, HttpStatus.OK);
    }
}
