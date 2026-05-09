package com.QuizApp.QuizApp.Service;

import com.QuizApp.QuizApp.Dto.QuestionWrapper;
import com.QuizApp.QuizApp.Dto.Response;
import com.QuizApp.QuizApp.Entity.Question;
import com.QuizApp.QuizApp.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Score;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<QuestionWrapper> getAllQuestions(){

        List<Question> questions = questionRepository.findAll();

        List<QuestionWrapper> wrappers = new ArrayList<>();

        for(Question q : questions ) {

            boolean add if (wrappers.add(new QuestionWrapper(
                    q.getId(),
                    q.getQuestion(),
                    q.getOption1(),
                    q.getOption2(),
                    q.getOption3(),
                    q.getOption4()

        }

        return wrappers;
    }

    public int calculateScore(List<Response> responses){

        int score =0;

        for(Response r : responses){

            Question q = questionRepository.findById(r.getId()).orElse(null);
            if(q != null  && q.getAnswer().equals(r.getResponse())){
                score++;
            }
        }
        return score;
    }

}
