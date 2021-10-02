package fireflies.repositories;
import java.util.List;

import fireflies.entity.College;

public interface CollegeRepo {
	   public  List<College> getCollege();
	   public College getCollege(int id);
	   public College addCollege(College k);
	   public College updateCollege(College k);
	   public  void deleteCollege(int id);	   
}

