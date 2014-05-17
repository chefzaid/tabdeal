package ma.tabdyl.user

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.POST
import javax.ws.rs.core.Response

@Path('/api/account')
@Consumes(['application/xml','application/json'])
@Produces(['application/xml','application/json'])
class AccountCollectionResource {

    def accountResourceService

    @POST
    Response create(Account dto) {
        created accountResourceService.create(dto)
    }

    @GET
    Response readAll() {
        ok accountResourceService.readAll()
    }

    @Path('/{id}')
    AccountResource getResource(@PathParam('id') Long id) {
        new AccountResource(accountResourceService: accountResourceService, id:id)
    }
}
