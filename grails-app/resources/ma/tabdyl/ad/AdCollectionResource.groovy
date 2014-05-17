package ma.tabdyl.ad

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.POST
import javax.ws.rs.core.Response

@Path('/api/ad')
@Consumes(['application/xml','application/json'])
@Produces(['application/xml','application/json'])
class AdCollectionResource {

    def adResourceService

    @POST
    Response create(Ad dto) {
        created adResourceService.create(dto)
    }

    @GET
    Response readAll() {
        ok adResourceService.readAll()
    }

    @Path('/{id}')
    AdResource getResource(@PathParam('id') Long id) {
        new AdResource(adResourceService: adResourceService, id:id)
    }
}
