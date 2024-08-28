package QuetsionService.QuetsionService.Service;

import QuetsionService.QuetsionService.Entiry.Question;
import QuetsionService.QuetsionService.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;



    public Question create( Question question){

        return questionRepo.save(question);
    }

    public List<Question> get(){

        return questionRepo.findAll();
    }
    public Question getById(Long id) {

        return questionRepo.findById(id).orElseThrow(() -> new RuntimeException("NOT FOUND +"));
    }
}
