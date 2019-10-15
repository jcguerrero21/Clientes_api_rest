package clientes.api.rest.model.services;

import java.util.List;

import clientes.api.rest.model.entity.Factura;
import clientes.api.rest.model.entity.Producto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import clientes.api.rest.model.entity.Cliente;
import clientes.api.rest.model.entity.Region;

public interface IClienteService {

    List<Cliente> findAll();

    Page<Cliente> findAll(Pageable pageable);

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    void delete(Long id);

    List<Region> findAllRegiones();

    Factura findFacturaById(Long id);

    Factura saveFactura(Factura factura);

    void deleteFacturaById(Long id);
    
    List<Producto> findProductoByNombre(String termino);

}
