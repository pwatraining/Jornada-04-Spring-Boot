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

import br.com.pwatraining.template.entity.Produto;
import br.com.pwatraining.template.service.IProdutoService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/v1/produto/")
@Slf4j
public class ProdutoController {

	@Autowired
	private IProdutoService produtoService;

	@GetMapping("listar")
	public ResponseEntity<List<Produto>> listar() {
		log.info("Inicio da operação listar Produtos");
		List<Produto> listaProduto = this.produtoService.listaProdutos();
		log.info("Fim da operação listar Produtos");
		return new ResponseEntity<>(listaProduto, HttpStatus.OK);
	} 
	
	@PostMapping("salvar")
	public ResponseEntity<Produto> salvar(@RequestBody 	Produto produto) {
		log.info("Inicio da operação salvar Produto");
		produto = this.produtoService.salvar(produto);
		log.info("Fim da operação salvar Item");
		return new ResponseEntity<>(produto, HttpStatus.OK);
	}
	
	@GetMapping("findPartialName/{partialName}")
	public List<Produto> findByPartialName(@PathVariable String partialName) {
		log.info("Início da Busca Por Nome Parcial");
		return produtoService.findByPartialName(partialName);
	}
	
	@GetMapping("excluir/{id}")
	public ResponseEntity<String> excluir(@PathVariable Long id) {
		Optional<Produto> produto = produtoService.findProduto(id);
		String message = "";
		if(produto.isEmpty()) {
			message = "Produto Não Encontrado...";
		} else {
			log.info("Inicio da operação excluir Produto, id: " + id);
			this.produtoService.excluir(produto.get());
			message = "Produto Excluído com Sucesso...";
		}
		log.info("Fim da operação excluir Produto, id: " + id);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@GetMapping("obter/{id}")
	public ResponseEntity<Optional<Produto>> obter(@PathVariable Long id) {
		log.info("Inicio da operação obter Produto, id: " + id);
		Optional<Produto> produto = this.produtoService.findProduto(id);
		log.info("Fim da operação obter Produto, id: " + id);
		return new ResponseEntity<>(produto, produto.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}
	
}