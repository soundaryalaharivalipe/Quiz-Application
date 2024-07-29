package com.lahari.quizapp.controller;

import com.lahari.quizapp.model.Question;
import com.lahari.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService  questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

@GetMapping("category/{category}")
public ResponseEntity<List<Question>> getQuestionsByQuestionId(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
}

@PostMapping("add")
public ResponseEntity<String> addQuestion(@RequestBody Question question) {
       return questionService.addQuestion(question);

}

@DeleteMapping("/delete/{id}")
public String deleteQuestion(@PathVariable Integer id) {
        return questionService.deleteQuestion(id);
    }

    @PutMapping("/update/{id}")
    public String updateQuestion(@PathVariable Integer id, @RequestBody Question question) {
        return questionService.updateQuestion(id, question);
    }

}



