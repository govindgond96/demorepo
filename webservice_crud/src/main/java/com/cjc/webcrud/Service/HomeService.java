package com.cjc.webcrud.Service;

import com.cjc.webcrud.Model.Student;

public interface HomeService {

	void savestu(Student s);

	Iterable<Student> getstu();

	Student getsinglest(int id);

	void updatest(Student st);

	void deletestu(int id);

}
