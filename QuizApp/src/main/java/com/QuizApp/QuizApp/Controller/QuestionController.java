package com.QuizApp.QuizApp.Controller;

import com.QuizApp.QuizApp.Entity.Question;
import com.QuizApp.QuizApp.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question q){
        return questionRepository.save(q);
    }
    @GetMapping("/all")
    public List<Question> getAll(){
        return questionRepository.findAll();
    }


}
