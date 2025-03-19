package com.example.service.ProductService;

import com.example.ofabregat.demo_of.model.Producto;
import com.example.ofabregat.demo_of.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class ProductService {
    private ProductRepository productRepository;

    public List<Producto> listProductos{
        return productRepository.findAll();
    }
    public void guardarProducto (Producto producto){
        repositorio.save(producto);
    }
    public Producto obtenerProducvtoPorId(Integer id){
        return repositorio.findById(id).get();
    }
    public void eliminarProducto (Integer id) {
        repositorio.deleteById(id);
    }



}


