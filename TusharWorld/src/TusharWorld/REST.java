package TusharWorld;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value="restful path")
public class REST {

	
	public void REST(){}//xygxygx
	//vbxgg
	@GET
    @Produces("text/xml")
	public Object get(){
		return "Tushar World";
	}
	
	@PUT
	@Consumes("text/xml")
	public void put(String s){
		// only for create
	}
}
