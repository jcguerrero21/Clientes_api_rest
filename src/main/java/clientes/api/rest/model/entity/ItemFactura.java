package clientes.api.rest.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="facturas_items")
public class ItemFactura implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Integer cantidad;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY) //muchos facturas_item pueden tener un solo producto
	@JoinColumn(name="producto_id") //lo podriamos quitar porque lo genera automáticamente
	private Producto producto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double getImporte() {
		return cantidad.doubleValue()*producto.getPrecio();
	}

}
