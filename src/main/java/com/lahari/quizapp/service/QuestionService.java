package com.lahari.quizapp.service;

import com.lahari.quizapp.model.Question;
import com.lahari.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public ResponseEntity<List<Question>> getAllQuestions()
    {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        try {
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
        questionDao.save(question);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public String deleteQuestion(Integer id) {
        if (questionDao.existsById(id)) {
            questionDao.deleteById(id);
            return "Question deleted successfully";
        } else {
            return "Question not found";
        }
    }

    public String updateQuestion(Integer id, Question newQuestion) {
        Optional<Question> foundQuestion = questionDao.findById(id);
        if (foundQuestion.isPresent()) {
            Question existingQuestion = foundQuestion.get();
            existingQuestion.setQuestionTitle(newQuestion.getQuestionTitle());
            existingQuestion.setOption1(newQuestion.getOption1());
            existingQuestion.setOption2(newQuestion.getOption2());
            existingQuestion.setOption3(newQuestion.getOption3());
            existingQuestion.setOption4(newQuestion.getOption4());
            existingQuestion.setRightAnswer(newQuestion.getRightAnswer());
            existingQuestion.setDifficultyLevel(newQuestion.getDifficultyLevel());
            existingQuestion.setCategory(newQuestion.getCategory());
            questionDao.save(existingQuestion);
            return "Question updated successfully";
        } else {
            return "Question not found";
        }
    }

}

