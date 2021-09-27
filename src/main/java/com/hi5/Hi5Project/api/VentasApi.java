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

import com.hi5.Hi5Project.dao.VentasDAO;
import com.hi5.Hi5Project.model.Ventas;




@RestController
@RequestMapping("ventas")
public class VentasApi {
	@Autowired
	private VentasDAO ventasDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Ventas ventas) {
		ventasDAO.save(ventas);
	}
	
	@GetMapping("/listar")
	public List<Ventas> listar() {
		return ventasDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		ventasDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Ventas ventas) {
		ventasDAO.save(ventas);
	}

}
