package clientes.api.rest.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import clientes.api.rest.model.entity.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long> {
	
	//Metodos similares de distintas Formas
	@Query("select p from Producto p where p.nombre like %?1%")
	List<Producto> findByNombre(String termino);
	
	//Hace lo mismo que el de arriba utilizando spring JPA el ignore case ignora las mayusculas
	List<Producto> findByNombreContainingIgnoreCase(String termino);
	
	List<Producto> findByNombreStartingWithIgnoreCase(String termino);
}
