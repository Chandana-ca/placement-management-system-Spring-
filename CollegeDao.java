package fireflies.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import fireflies.entity.College;



@Component
public interface CollegeDao extends JpaRepository<College, Integer>{

}