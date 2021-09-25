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

import com.hi5.Hi5Project.dao.UsuarioDAO;
import com.hi5.Hi5Project.model.Usuarios;


@RestController
@RequestMapping("usuarios")
public class UsuariosAPI {
	@Autowired
	private UsuarioDAO usuariosDao;
	
	@PostMapping
	public void guardar(@RequestBody Usuarios usuarios) {
		usuariosDao.save(usuarios);
	}
	
	@GetMapping("/listar")
	public List<Usuarios> listar(){
		return usuariosDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
	usuariosDao.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuarios usuarios) {
	usuariosDao.save(usuarios);
	}

}
