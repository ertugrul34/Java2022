package business;

import java.util.List;

import core.logging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private List<Category> categories;

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {

		for (Category categ : categories) {
			if (categ.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori adı diğerleriyle benzersiz olmalıdır");
			}
		}
		categoryDao.add(category);
		categories.add(category);

	}

}
