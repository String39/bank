package com.example.spring.repositorio;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spring.entidades.Pedido;

@Repository
public interface PedidoJPARepository  extends JpaRepository<Pedido, Integer>{

	public static Logger Log = LoggerFactory.getLogger(PedidoJPARepository.class);
	//añadiriamos mas metodos si los necesito
	
	@Query("SELECT p FROM Pedido p WHERE p.user = ?1")
	public Collection<Pedido> getAllByUser(String userName);
	
	List<Pedido> findByUser(String user);
//
//	@Query("INSERT INTO Pedido p VALUES (?1)")
//	public Pedido addPedido(Pedido p);
}
