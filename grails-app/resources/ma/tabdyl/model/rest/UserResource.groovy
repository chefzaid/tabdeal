package ma.tabdyl.model.rest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path('/api/user')
class UserResource {

    @GET
    @Produces('text/plain')
    String getUserRepresentation() {
        'User'
    }
}
