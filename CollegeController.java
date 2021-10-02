package fireflies.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fireflies.entity.College;
import fireflies.repositories.CollegeRepo;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;



@RestController
public class CollegeController {
	@Autowired
	CollegeRepo col;
	@GetMapping("/getCollege")
		
		public List<College> getCollege()
		{
			return col.getCollege();

		}
	   @GetMapping("/getCollege/{id}")
	     public College getCollege(@PathVariable String id)
	     {
	    	 return col.getCollege(Integer.parseInt(id));
	     }
	   @PostMapping("/addCollege")
	    public College addCollege(@RequestBody College c)
	    {
	    	return col.addCollege(c);
	    }
	   @PutMapping("/updateCollege")
	   public College updateCollege(@RequestBody College c)
	   {
	   	return col.updateCollege(c);
	   }
	   @DeleteMapping("/deleteCollege/{id}")
	   public void delete(@PathVariable int id)
	   {
		  col.deleteCollege(id);

	   }
}

