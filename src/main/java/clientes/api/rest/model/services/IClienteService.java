package clientes.api.rest.model.services;

import java.util.List;

import clientes.api.rest.model.entity.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import clientes.api.rest.model.entity.Cliente;
import clientes.api.rest.model.entity.Region;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();

	public Factura findFacturaById(Long id);

	public Factura saveFactura(Factura factura);

	public void deleteFacturaById(Long id);
	
}
