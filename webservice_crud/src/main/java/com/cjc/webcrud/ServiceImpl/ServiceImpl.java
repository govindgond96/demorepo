package com.cjc.webcrud.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webcrud.Model.Student;
import com.cjc.webcrud.Repository.HomeRepository;
import com.cjc.webcrud.Service.HomeService;

@Service
public class ServiceImpl implements HomeService{

	@Autowired
	
	HomeRepository hr;
	
	@Override
	public void savestu(Student s) {
		
		hr.save(s);
		
	}

	@Override
	public Iterable<Student> getstu() {
		
		return hr.findAll();
	}

	@Override
	public Student getsinglest(int id) {
		
		return hr.findBySid(id);
	}

	@Override
	public void updatest(Student st) {
		hr.save(st);
		
	}

	@Override
	public void deletestu(int id) {
		hr.deleteById(id);
		
	}

}
