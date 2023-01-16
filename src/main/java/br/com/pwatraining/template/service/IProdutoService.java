package br.com.pwatraining.template.service;

import java.util.List;
import java.util.Optional;

import br.com.pwatraining.template.entity.Produto;

public interface IProdutoService {

	public Produto salvar(Produto Produto);
	public void excluir(Produto Produto);
	public Optional<Produto> findProduto(Long id);
	public List<Produto> listaProdutos();
	public List<Produto> findByPartialName(String partialName);


}


