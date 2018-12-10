package clientes.api.rest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import clientes.api.rest.model.entity.Cliente;
import clientes.api.rest.model.services.IClienteService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/clientes")
	public List<Cliente> index() {
		return clienteService.findAll();
	}

	@GetMapping("/clientes/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {

		Cliente cliente = null;
		Map<String, Object> response = new HashMap<>();

		try {
			cliente = clienteService.findById(id);
		} catch (DataAccessException ex) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", ex.getMessage().concat(": ").concat(ex.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (cliente == null) {
			response.put("mensaje", "El cliente Id: ".concat(id.toString().concat(" no existe en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}

	@PostMapping("/clientes")
	public ResponseEntity<?> create(@Valid @RequestBody Cliente cliente, BindingResult result) {
		
		
		Cliente clienteNuevo = null;
		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {
//			List<String> errors = new ArrayList<>();
//			for(FieldError err: result.getFieldErrors()){
//				errors.add("El campo '" + err.getField() + "' " +err.getDefaultMessage());
//			}  JAVA 7,6,5
			
			//JAVA 8
			List<String> errors = result.getFieldErrors()
					.stream()
					.map(error -> "El campo '" + error.getField() + "' " +error.getDefaultMessage())
					.collect(Collectors.toList());
			
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		try {
			clienteNuevo= clienteService.save(cliente);
		} catch (DataAccessException ex) {
			response.put("mensaje", "Error al realizar el insert en la base de datos");
			response.put("error", ex.getMessage().concat(": ").concat(ex.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("mensaje", "El cliente ha sido creado con éxito");
		response.put("cliente", clienteNuevo);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

	@PutMapping("/clientes/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody Cliente cliente, BindingResult result, @PathVariable Long id) {

		Cliente clienteActual = clienteService.findById(id);
		Cliente clienteActualizado = null;

		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {
//			List<String> errors = new ArrayList<>();
//			for(FieldError err: result.getFieldErrors()){
//				errors.add("El campo '" + err.getField() + "' " +err.getDefaultMessage());
//			}  JAVA 7,6,5
			
			//JAVA 8
			List<String> errors = result.getFieldErrors()
					.stream()
					.map(error -> "El campo '" + error.getField() + "' " +error.getDefaultMessage())
					.collect(Collectors.toList());
			
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		if (clienteActual == null) {
			response.put("mensaje", "Error: no se pudo editar, el cliente Id: "
					.concat(id.toString().concat(" no existe en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		try {
			clienteActual.setApellido(cliente.getApellido());
			clienteActual.setNombre(cliente.getNombre());
			clienteActual.setEmail(cliente.getEmail());
			clienteActual.setCreateAt(cliente.getCreateAt());

			clienteActualizado = clienteService.save(clienteActual);
		} catch (DataAccessException ex) {
			response.put("mensaje", "Error al actualizar el cliente en la base de datos");
			response.put("error", ex.getMessage().concat(": ").concat(ex.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("mensaje", "El cliente ha sido creado con éxito");
		response.put("cliente", clienteActualizado);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

	@DeleteMapping("/clientes/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {

		Map<String, Object> response = new HashMap<>();

		try {
			clienteService.delete(id);
		} catch (DataAccessException ex) {
			response.put("mensaje", "Error al eliminar el cliente en la base de datos");
			response.put("error", ex.getMessage().concat(": ").concat(ex.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("mensaje", "cliente eliminado con éxito");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}

}
