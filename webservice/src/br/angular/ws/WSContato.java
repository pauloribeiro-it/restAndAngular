package br.angular.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.angular.dao.ContatoDAO;
import br.angular.model.Contato;
import br.angular.model.Operadora;

@Path("/wsContato")
public class WSContato {

	private static ContatoDAO dao = new ContatoDAO();
	private static final List<Contato> contatos = dao.findAll();

	@GET
	@Path("/allContatos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contato> getContatos() {
		return contatos;
	}

	@GET
	@Path("/findContato/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getContato(@PathParam("id") Integer id) {
		for(Contato contato:contatos)
			if(contato.getId().equals(id))
				return Response.status(200).entity(contato).build();
		return Response.status(404).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/adicionarContato")
	public Response adicionarContato(Contato contato) {
		contatos.add(contato);
		return Response.status(200).entity("OK").build();
	}

	@GET
	@Path("/allOperadoras")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Operadora> getOperadoras() {
		List<Operadora> operadoras = new ArrayList<>();
		Operadora operadora1 = new Operadora("Oi", 14, "Celular", 2.0f);
		Operadora operadora2 = new Operadora("Vivo", 15, "Celular", 1.0f);
		Operadora operadora3 = new Operadora("Tim", 41, "Celular", 3.0f);
		Operadora operadora4 = new Operadora("GVT", 25, "Celular", 1.0f);
		Operadora operadora5 = new Operadora("Embratel", 21, "Celular", 2.0f);
		operadoras.add(operadora1);
		operadoras.add(operadora2);
		operadoras.add(operadora3);
		operadoras.add(operadora4);
		operadoras.add(operadora5);
		return operadoras;
	}

	
}
