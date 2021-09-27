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

import com.hi5.Hi5Project.dao.MarcaProductoDAO;
import com.hi5.Hi5Project.model.MarcaProducto;


@RestController
@RequestMapping("marcaproducto")
public class MarcaProductoAPI {
	@Autowired
	private MarcaProductoDAO marcaProductoDao;
	
	@PostMapping
	public void guardar(@RequestBody MarcaProducto marcaProducto) {
		marcaProductoDao.save(marcaProducto);
	}
	
	@GetMapping("/listar")
	public List<MarcaProducto> listar(){
		return marcaProductoDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
	marcaProductoDao.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody MarcaProducto marcaProducto) {
	marcaProductoDao.save(marcaProducto);
	}

}
