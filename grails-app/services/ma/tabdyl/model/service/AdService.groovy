package ma.tabdyl.model.service

import grails.transaction.Transactional
import ma.tabdyl.ad.Ad
import ma.tabdyl.ad.Category

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
