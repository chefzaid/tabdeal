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
class AdResource {

    def adResourceService
    def id

    @GET
    Response read() {
        ok adResourceService.read(id)
    }

    @PUT
    Response update(Ad dto) {
        dto.id = id
        ok adResourceService.update(dto)
    }

    @DELETE
    void delete() {
        adResourceService.delete(id)
    }
}
