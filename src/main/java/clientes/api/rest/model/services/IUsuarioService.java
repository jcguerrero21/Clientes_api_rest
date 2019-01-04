package clientes.api.rest.model.services;

import clientes.api.rest.model.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
}
