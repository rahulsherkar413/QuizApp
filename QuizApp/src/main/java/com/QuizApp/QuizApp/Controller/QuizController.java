package com.QuizApp.QuizApp.Controller;

import com.QuizApp.QuizApp.Dto.QuestionWrapper;
import com.QuizApp.QuizApp.Dto.Response;
import com.QuizApp.QuizApp.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/start")
    public List<QuestionWrapper> startQuiz() {
        return quizService.getAllQuestions();
    }

    @PostMapping("/submit")
    public int submitQuiz(@RequestBody List<Response> responses) {
        return quizService.calculateScore(responses);
    }
}