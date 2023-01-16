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

import br.com.pwatraining.template.entity.PedidoVenda;
import br.com.pwatraining.template.service.IPedidoVendaService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/v1/pedidoVenda/")
@Slf4j
public class PedidoVendaController {

	@Autowired
	private IPedidoVendaService pedidoVendaService;

	@GetMapping("listar")
	public ResponseEntity<List<PedidoVenda>> listar() {
		log.info("Inicio da operação listar PedidoVendas");
		List<PedidoVenda> listaPedidoVenda = this.pedidoVendaService.listaPedidoVendas();
		log.info("Fim da operação listar PedidoVendas");
		return new ResponseEntity<>(listaPedidoVenda, HttpStatus.OK);
	} 
	
	@PostMapping("salvar")
	public ResponseEntity<PedidoVenda> salvar(@RequestBody 	PedidoVenda pedidoVenda) {
		log.info("Inicio da operação salvar PedidoVenda");
		pedidoVenda = this.pedidoVendaService.salvar(pedidoVenda);
		log.info("Fim da operação salvar Item");
		return new ResponseEntity<>(pedidoVenda, HttpStatus.OK);
	}
	
	@GetMapping("excluir/{id}")
	public ResponseEntity<String> excluir(@PathVariable Long id) {
		Optional<PedidoVenda> pedidoVenda = pedidoVendaService.findPedidoVenda(id);
		String message = "";
		if(pedidoVenda.isEmpty()) {
			message = "PedidoVenda Não Encontrado...";
		} else {
			log.info("Inicio da operação excluir PedidoVenda, id: " + id);
			this.pedidoVendaService.excluir(pedidoVenda.get());
			message = "PedidoVenda Excluído com Sucesso...";
		}
		log.info("Fim da operação excluir PedidoVenda, id: " + id);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@GetMapping("obter/{id}")
	public ResponseEntity<Optional<PedidoVenda>> obter(@PathVariable Long id) {
		log.info("Inicio da operação obter PedidoVenda, id: " + id);
		Optional<PedidoVenda> pedidoVenda = this.pedidoVendaService.findPedidoVenda(id);
		log.info("Fim da operação obter PedidoVenda, id: " + id);
		return new ResponseEntity<>(pedidoVenda, pedidoVenda.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}
	
}