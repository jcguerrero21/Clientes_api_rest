package clientes.api.rest.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import clientes.api.rest.model.entity.Cliente;

public interface IClienteDAO extends JpaRepository<Cliente, Long>{

}
