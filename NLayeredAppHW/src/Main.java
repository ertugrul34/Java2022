import java.util.ArrayList;
import java.util.List;
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		ILogger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };
		Category category1 = new Category(1, "Programlama");

		List<Category> categoryDb = new ArrayList<>();

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryDb);
		categoryManager.add(category1);

		System.out.println("***********************");

		Course course1 = new Course(1, "Yazılım Geliştirici Geliştirme Kampı (C# + ANGULAR)", 900);
		Course course2 = new Course(1, "Yazılım Geliştirici Geliştirme Kampı (JAVA + REACT)", 1000);
		Course course3 = new Course(1, "Yazılım Geliştirici Geliştirme Kampı (JavaScript)", 500);
		Course course4 = new Course(1, "Senior Yazılım Geliştirici Geliştirme Kampı (.NET)", 2000);
		Course course5 = new Course(1, "2022 Yazılım Geliştirici Geliştirme Kampı (JAVA)", 1500);

		List<Course> courseDb = new ArrayList<>();

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courseDb);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);

		System.out.println("***********************");

		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);

	}

}
