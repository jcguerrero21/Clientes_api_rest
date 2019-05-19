package clientes.api.rest.model.dao;

import clientes.api.rest.model.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDAO extends CrudRepository<Factura, Long> {
}
