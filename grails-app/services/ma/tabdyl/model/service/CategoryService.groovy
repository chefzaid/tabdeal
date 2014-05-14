package ma.tabdyl.model.service

import ma.tabdyl.model.beans.Category;
import grails.transaction.Transactional

@Transactional
class CategoryService {
	
	//Class not tested

	def readAll(){
		Category.list();
	}

	def findSubcategories(Category category){
		category.findAllByParent(category);
	}

	def findById(Long id){
		Category.get(id);
	}
}
