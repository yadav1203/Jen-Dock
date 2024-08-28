package QuetsionService.QuetsionService.Controller;


import QuetsionService.QuetsionService.Entiry.Question;
import QuetsionService.QuetsionService.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/get")
    public List<Question> getAll(){

        return questionService.get();
    }

    @PostMapping("/put")
    public  Question createQuestion(@RequestBody Question question){

        return questionService.create(question);
    }

    @GetMapping("/{id}")
    public Question getAll(@PathVariable  Long id){

        return questionService.getById(id);
    }
}
