package com.hi5.Hi5Project.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hi5.Hi5Project.dao.ClientesDAO;
import com.hi5.Hi5Project.model.Clientes;


@RestController
@RequestMapping("clientes")
public class ClientesAPI {
	@Autowired
	private ClientesDAO clientesDao;
	
	@PostMapping
	public void guardar(@RequestBody Clientes clientes) {
		clientesDao.save(clientes);
	}
	
	@GetMapping("/listar")
	public List<Clientes> listar(){
		return clientesDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
	clientesDao.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
	clientesDao.save(clientes);
	}

}

