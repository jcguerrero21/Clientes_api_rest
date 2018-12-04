package clientes.api.rest.model.dao;

import org.springframework.data.repository.CrudRepository;

import clientes.api.rest.model.entity.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, Long>{

}
