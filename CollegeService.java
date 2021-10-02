package fireflies.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fireflies.Dao.CollegeDao;
import fireflies.entity.College;
import fireflies.repositories.CollegeRepo;

@Service
public class CollegeService implements CollegeRepo {
	@Autowired
	private CollegeDao co;
     @Override
     
	public List<College> getCollege() {
		
		return co.findAll();
	}

	@Override
	public College getCollege(int id) 
	{   return co.findById(id).get();
		
	}

	@Override
	public College addCollege(College c) {
	return co.save(c);
	
	}

	@Override
	public College updateCollege(College c) {
	return co.save(c);

	}

	@Override
	public void deleteCollege(int id) {
		College c=co.getById(id);
		co.delete(c);
	}
}

