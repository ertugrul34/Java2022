package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructors) {
		System.out.println("JDBC ile veri tabanına eklendi");

	}

}
