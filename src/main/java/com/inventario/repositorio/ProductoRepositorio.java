package com.inventario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{

}
