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

import br.com.pwatraining.template.entity.ItensPedidoVenda;
import br.com.pwatraining.template.service.IItensPedidoVendaService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/v1/itensPedidoVenda/")
@Slf4j
public class ItensPedidoVendaController {

	@Autowired
	private IItensPedidoVendaService itensPedidoVendaService;

	@GetMapping("listar")
	public ResponseEntity<List<ItensPedidoVenda>> listar() {
		log.info("Inicio da operação listar ItensPedidoVendas");
		List<ItensPedidoVenda> listaItensPedidoVenda = this.itensPedidoVendaService.listaItensPedidoVendas();
		log.info("Fim da operação listar ItensPedidoVendas");
		return new ResponseEntity<>(listaItensPedidoVenda, HttpStatus.OK);
	} 
	
	@PostMapping("salvar")
	public ResponseEntity<ItensPedidoVenda> salvar(@RequestBody 	ItensPedidoVenda itensPedidoVenda) {
		log.info("Inicio da operação salvar ItensPedidoVenda");
		itensPedidoVenda = this.itensPedidoVendaService.salvar(itensPedidoVenda);
		log.info("Fim da operação salvar Item");
		return new ResponseEntity<>(itensPedidoVenda, HttpStatus.OK);
	}
	
	@GetMapping("excluir/{id}")
	public ResponseEntity<String> excluir(@PathVariable Long id) {
		Optional<ItensPedidoVenda> itensPedidoVenda = itensPedidoVendaService.findItensPedidoVenda(id);
		String message = "";
		if(itensPedidoVenda.isEmpty()) {
			message = "ItensPedidoVenda Não Encontrado...";
		} else {
			log.info("Inicio da operação excluir ItensPedidoVenda, id: " + id);
			this.itensPedidoVendaService.excluir(itensPedidoVenda.get());
			message = "ItensPedidoVenda Excluído com Sucesso...";
		}
		log.info("Fim da operação excluir ItensPedidoVenda, id: " + id);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@GetMapping("obter/{id}")
	public ResponseEntity<Optional<ItensPedidoVenda>> obter(@PathVariable Long id) {
		log.info("Inicio da operação obter ItensPedidoVenda, id: " + id);
		Optional<ItensPedidoVenda> itensPedidoVenda = this.itensPedidoVendaService.findItensPedidoVenda(id);
		log.info("Fim da operação obter ItensPedidoVenda, id: " + id);
		return new ResponseEntity<>(itensPedidoVenda, itensPedidoVenda.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}
	
}