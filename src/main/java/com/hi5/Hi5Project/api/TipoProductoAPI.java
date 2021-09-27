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

import com.hi5.Hi5Project.dao.TipoProductoDAO;
import com.hi5.Hi5Project.model.TipoProducto;


@RestController
@RequestMapping("tipoproducto")
public class TipoProductoAPI {
	@Autowired
	private TipoProductoDAO tipoProductoDao;
	
	@PostMapping
	public void guardar(@RequestBody TipoProducto tipoProducto) {
		tipoProductoDao.save(tipoProducto);
	}
	
	@GetMapping("/listar")
	public List<TipoProducto> listar(){
		return tipoProductoDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
	tipoProductoDao.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody TipoProducto tipoProducto) {
	tipoProductoDao.save(tipoProducto);
	}

}
