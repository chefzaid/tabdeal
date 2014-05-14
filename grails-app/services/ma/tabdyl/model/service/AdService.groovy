package ma.tabdyl.model.service

import ma.tabdyl.model.beans.Ad;
import ma.tabdyl.model.beans.Category;
import grails.transaction.Transactional

@Transactional
class AdService {

	//Class not tested
	
	def createOrUpdate(Ad ad){
		ad.save();
	}

	def readAll(){
		Ad.list();
	}

	def delete(Ad ad){
		ad.delete();
	}

	def findByCategory(Category category){
		Ad.findAllByCategory(category);
	}

	def findById(Long id){
		Ad.get(id);
	}
}
