package ma.tabdyl.user

import ma.tabdyl.user.Account;

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class AccountResourceService {

    def create(Account dto) {
        dto.save()
    }

    def read(id) {
        def obj = Account.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Account.class, id)
        }
        obj
    }

    def update(Account dto) {
        def obj = Account.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Account.class, dto.id)
        }
        obj.properties = dto.properties
        obj
    }

    void delete(id) {
        def obj = Account.get(id)
        if (obj) {
            obj.delete()
        }
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
	
	def readAll() {
		Account.findAll()
	}
}
