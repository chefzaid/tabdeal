package ma.tabdyl.ad

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.PUT
import javax.ws.rs.core.Response

import org.grails.jaxrs.provider.DomainObjectNotFoundException

@Consumes(['application/xml','application/json'])
@Produces(['application/xml','application/json'])
class CategoryResource {

    def categoryResourceService
    def id

    @GET
    Response read() {
        ok categoryResourceService.read(id)
    }

    @PUT
    Response update(Category dto) {
        dto.id = id
        ok categoryResourceService.update(dto)
    }

    @DELETE
    void delete() {
        categoryResourceService.delete(id)
    }
}
