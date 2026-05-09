package com.QuizApp.QuizApp.Repository;

import com.QuizApp.QuizApp.Entity.Question;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
    List<Question> findByIdIn(List<Long> ids);
}
