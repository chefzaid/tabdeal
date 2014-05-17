package ma.tabdyl.user

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
class AccountResource {

    def accountResourceService
    def id

    @GET
    Response read() {
        ok accountResourceService.read(id)
    }

    @PUT
    Response update(Account dto) {
        dto.id = id
        ok accountResourceService.update(dto)
    }

    @DELETE
    void delete() {
        accountResourceService.delete(id)
    }
}
