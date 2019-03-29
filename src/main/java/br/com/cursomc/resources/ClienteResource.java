package br.com.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursomc.domain.Cliente;
import br.com.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "/clientess")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> buscar(@PathVariable("id")   Integer id) {
		Cliente cliente = clienteService.buscar(id);
		return ResponseEntity.ok().body(cliente);
	}
	
	
}
