package ma.tabdyl.ad

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class CategoryResourceService {

    def create(Category dto) {
        dto.save()
    }

    def read(id) {
        def obj = Category.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Category.class, id)
        }
        obj
    }

    def update(Category dto) {
        def obj = Category.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Category.class, dto.id)
        }
        obj.properties = dto.properties
        obj
    }

    void delete(id) {
        def obj = Category.get(id)
        if (obj) {
            obj.delete()
        }
    }
	
	def findSubcategories(Category category){
		category.findAllByParent(category);
	}
	
	def readAll() {
		Category.findAll()
	}
}
