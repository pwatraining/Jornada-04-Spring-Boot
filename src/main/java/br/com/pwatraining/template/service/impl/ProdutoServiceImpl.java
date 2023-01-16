package br.com.pwatraining.template.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pwatraining.template.DAO.IProdutoDao;
import br.com.pwatraining.template.entity.Produto;
import br.com.pwatraining.template.service.IProdutoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired
	IProdutoDao produtoDao;

	@Override
	public Produto salvar(Produto produto) {
		produto = produtoDao.save(produto);
		log.info("Persistindo Item id: " + produto.getId());
		return produto;
	}

	@Override
	public void excluir(Produto produto) {
		produtoDao.delete(produto);
		log.info("Excluindo Item id: " + produto.getId());
	}
	
	public List<Produto> listaProdutos() {
		log.info("Listando Todos os Produtos");
		return produtoDao.findAll();
	}

	public Optional<Produto> findProduto(Long id) {
		log.info("Buscando Produto Por Id");
		Optional<Produto> produto = produtoDao.findById(id);
		return produto;
	}

	public List<Produto> findByPartialName(String partialDescricao) {
		log.info("Buscando por Nome Parcial");
		return produtoDao.findByPartialDescricao("%" + partialDescricao + "%");
	}


}
