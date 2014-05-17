package ma.tabdyl.model.service

import ma.tabdyl.model.enums.AccountType;
import ma.tabdyl.model.enums.Rating;
import ma.tandyl.user.Account
import grails.transaction.Transactional

@Transactional
class AccountService {
	
	//Class not tested

	def createOrUpdate(Account account){
		account.save();
	}

	def delete(Account account){
		account.delete();
	}

	def findByLogin(String login){
		Account.findAllByLogin(login);
	}

	def findByAccountType(AccountType type){
		Account.findAllByType(type);
	}

	def findByRating(Rating rating){
		Account.findAllByRating(rating);
	}

	def findById(Long id){
		Account.get(id);
	}
}
