package business;

import java.lang.System.Logger;
import java.util.List;
import core.logging.ILogger;
import dataAccess.HibernateCourseDao;
import dataAccess.ICourseDao;
import dataAccess.JdbcCourseDao;
import entities.Course;

public class CourseManager {

	private List<Course> courses;

	public CourseManager(ICourseDao courseDao, ILogger[] loggers, List<Course> courses) {
		this.courses = courses;
	}

	public CourseManager(HibernateCourseDao hibernateCourseDao, List<Logger> loggers2) {

	}

	public void add(Course course) throws Exception {
		if (course.getUnitPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");

		}
		for (Course cours : courses) {
			if (cours.getCoursename().equals(course.getCoursename())) {
				throw new Exception("Kurs adı diğerleriyle aynı olamaz");
			}
		}

		ICourseDao courseDao = new JdbcCourseDao();
		courseDao.add(course);

	}

}
