package ma.tabdyl.model.rest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path('/api/ad')
class AdResource {

    @GET
    @Produces('text/plain')
    String getAdRepresentation() {
        'Ad'
    }
}
