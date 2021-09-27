package com.hi5.Hi5Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hi5.Hi5Project.model.Productos;


public interface ProductosDAO extends JpaRepository<Productos, Integer> {

}
