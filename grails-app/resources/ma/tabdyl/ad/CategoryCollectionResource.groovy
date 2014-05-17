package ma.tabdyl.ad

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.POST
import javax.ws.rs.core.Response

@Path('/api/category')
@Consumes(['application/xml','application/json'])
@Produces(['application/xml','application/json'])
class CategoryCollectionResource {

    def categoryResourceService

    @POST
    Response create(Category dto) {
        created categoryResourceService.create(dto)
    }

    @GET
    Response readAll() {
        ok categoryResourceService.readAll()
    }

    @Path('/{id}')
    CategoryResource getResource(@PathParam('id') Long id) {
        new CategoryResource(categoryResourceService: categoryResourceService, id:id)
    }
}
