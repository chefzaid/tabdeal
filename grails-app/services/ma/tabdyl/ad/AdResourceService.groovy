package ma.tabdyl.ad

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class AdResourceService {

    def create(Ad dto) {
        dto.save()
    }

    def read(id) {
        def obj = Ad.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Ad.class, id)
        }
        obj
    }

	def findByCategory(Category category){
		Ad.findAllByCategory(category);
	}
	
    def readAll() {
        Ad.findAll()
    }

    def update(Ad dto) {
        def obj = Ad.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Ad.class, dto.id)
        }
        obj.properties = dto.properties
        obj
    }

    void delete(id) {
        def obj = Ad.get(id)
        if (obj) {
            obj.delete()
        }
    }
}
