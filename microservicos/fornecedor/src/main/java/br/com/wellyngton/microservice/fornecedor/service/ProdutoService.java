package br.com.wellyngton.microservice.fornecedor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.wellyngton.microservice.fornecedor.model.Produto;
import br.com.wellyngton.microservice.fornecedor.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

	
}
