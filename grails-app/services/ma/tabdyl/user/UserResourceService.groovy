package ma.tabdyl.user

import ma.tabdyl.user.User;

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class UserResourceService {

    def create(User dto) {
        dto.save()
    }

    def read(id) {
        def obj = User.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(User.class, id)
        }
        obj
    }

	def findByEmail(String email){
		User.findAllByEmail(email);
	}

	def findByPhone(String phone){
		User.findAllByPhone(phone);
	}
	
    def readAll() {
        User.findAll()
    }

    def update(User dto) {
        def obj = User.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(User.class, dto.id)
        }
        obj.properties = dto.properties
        obj
    }

    void delete(id) {
        def obj = User.get(id)
        if (obj) {
            obj.delete()
        }
    }
}
