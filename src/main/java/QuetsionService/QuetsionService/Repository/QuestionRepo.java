package QuetsionService.QuetsionService.Repository;

import QuetsionService.QuetsionService.Entiry.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,Long> {
}
