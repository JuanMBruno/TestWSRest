package testwsrest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path('/api/users')
class UsersResource {

    @GET
    @Produces('text/html')
    String getUsersRepresentation() {
        '<html><body>Users</body></html>'
    }
}
