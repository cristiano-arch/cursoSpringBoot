package com.andcris.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andcris.cursomc.domain.Pedido;
import com.andcris.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new IllegalArgumentException("Objeto nao encontrado Id: " + id + ", Tipo: " + PedidoService.class.getName()));
	}
}
