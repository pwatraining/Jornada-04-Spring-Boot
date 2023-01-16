package br.com.pwatraining.template.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pwatraining.template.entity.Cliente;
import br.com.pwatraining.template.service.IClienteService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/v1/cliente/")
@Slf4j
//@EnableResourceServer
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("listar")
	public ResponseEntity<List<Cliente>> listar() {
		log.info("Inicio da operação listar Clientes");
		List<Cliente> listaCliente = this.clienteService.listaClientes();
		log.info("Fim da operação listar Clientes");
		return new ResponseEntity<>(listaCliente, HttpStatus.OK);
	} 
	
	@PostMapping("salvar")
	public ResponseEntity<Cliente> salvar(@RequestBody 	Cliente cliente) {
		log.info("Inicio da operação salvar Cliente");
		cliente = this.clienteService.salvar(cliente);
		log.info("Fim da operação salvar Item");
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	@GetMapping("findPartialName/{partialName}")
	public List<Cliente> findByPartialName(@PathVariable String partialName) {
		log.info("Início da Busca Por Nome Parcial");
		return clienteService.findByPartialName(partialName);
	}
	
	@GetMapping("excluir/{id}")
	public ResponseEntity<String> excluir(@PathVariable Long id) {
		Optional<Cliente> cliente = clienteService.findCliente(id);
		String message = "";
		if(cliente.isEmpty()) {
			message = "Cliente Não Encontrado...";
		} else {
			log.info("Inicio da operação excluir Cliente, id: " + id);
			this.clienteService.excluir(cliente.get());
			message = "Cliente Excluído com Sucesso...";
		}
		log.info("Fim da operação excluir Cliente, id: " + id);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@GetMapping("obter/{id}")
	public ResponseEntity<Optional<Cliente>> obter(@PathVariable Long id) {
		log.info("Inicio da operação obter Cliente, id: " + id);
		Optional<Cliente> cliente = this.clienteService.findCliente(id);
		log.info("Fim da operação obter Cliente, id: " + id);
		return new ResponseEntity<>(cliente, cliente.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}
	
}