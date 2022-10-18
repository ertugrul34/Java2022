package dataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course courses) {
		System.out.println("Hibernate ile Veritabanına eklendi");

	}

}
