package com.platzi.platzimarket.persistence;

import java.util.List;
import java.util.Optional;

import com.platzi.platzimarket.persistence.crud.ProductoCrudRepository;
import com.platzi.platzimarket.persistence.entity.Producto;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getall(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(Integer idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderbyNombreAcs(idCategoria); 
    }

    //el estado puede cambiarse getLimitados(Integer cantidadStock, Boolean estado)
    public Optional<List<Producto>> getLimitados(Integer cantidadStock){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock, true);
    }
}
