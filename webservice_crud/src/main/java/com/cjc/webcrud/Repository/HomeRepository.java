package com.cjc.webcrud.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webcrud.Model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer> {

	Student findBySid(int id);

}
