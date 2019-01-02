package clientes.api.rest.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import clientes.api.rest.model.entity.Cliente;
import clientes.api.rest.model.entity.Region;

public interface IClienteDAO extends JpaRepository<Cliente, Long>{
	

	@Query("from Region")
	public List<Region> findAllRegiones();
	
}
