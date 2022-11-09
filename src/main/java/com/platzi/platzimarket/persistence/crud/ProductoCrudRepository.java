package com.platzi.platzimarket.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.platzi.platzimarket.persistence.entity.Producto;

public interface    ProductoCrudRepository extends CrudRepository<Producto,Integer>{
    List<Producto> findByIdCategoriaOrderbyNombreAcs(Integer idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer cantidadStock, Boolean estado);
    
}
