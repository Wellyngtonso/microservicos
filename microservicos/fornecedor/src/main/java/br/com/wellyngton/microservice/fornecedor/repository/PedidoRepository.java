package br.com.wellyngton.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.wellyngton.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}