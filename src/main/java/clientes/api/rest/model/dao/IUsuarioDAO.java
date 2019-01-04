package clientes.api.rest.model.dao;

import org.springframework.data.repository.CrudRepository;

import clientes.api.rest.model.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
