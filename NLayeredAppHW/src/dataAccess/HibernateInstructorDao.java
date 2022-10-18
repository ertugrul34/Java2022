package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructors) {
		System.out.println("Hibernate ile Veritabanına eklendi");

	}

}
