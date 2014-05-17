package ma.tabdyl.model.service

import grails.transaction.Transactional
import ma.tabdyl.ad.Category

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
