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

import com.hi5.Hi5Project.dao.EstadosDAO;
import com.hi5.Hi5Project.model.Estados;


@RestController
@RequestMapping("estadosAPI")
public class EstadosAPI {
	@Autowired
	private EstadosDAO estadosDao;
	
	@PostMapping
	public void guardar(@RequestBody Estados estados) {
		estadosDao.save(estados);
	}
	
	@GetMapping("/listar")
	public List<Estados> listar(){
		return estadosDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
	estadosDao.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Estados estados) {
	estadosDao.save(estados);
	}

}
