package ma.tabdyl.model.service

import ma.tabdyl.model.beans.User;
import grails.transaction.Transactional

@Transactional
class UserService {
	
	//Class not tested

	def createOrUpdate(User user){
		user.save();
	}

	def delete(User user){
		user.delete();
	}

	def findByEmail(String email){
		User.findAllByEmail(email);
	}

	def findByPhone(String phone){
		User.findAllByPhone(phone);
	}

	def findById(Long id){
		User.get(id);
	}
}
