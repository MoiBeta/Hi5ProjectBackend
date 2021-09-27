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

import com.hi5.Hi5Project.dao.DetalleVentasDAO;
import com.hi5.Hi5Project.model.DetalleVentas;



@RestController
@RequestMapping("detalleven")
public class DetalleVentasApi {
	@Autowired
	private DetalleVentasDAO detallevenDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody DetalleVentas detalleven) {
		detallevenDAO.save(detalleven);
	}
	
	@GetMapping("/listar")
	public List<DetalleVentas> listar() {
		return detallevenDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		detallevenDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody DetalleVentas detalleven) {
		detallevenDAO.save(detalleven);
	}

}
