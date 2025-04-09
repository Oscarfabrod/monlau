package com.example.ofabregat.demo_of.service;

import com.example.ofabregat.demo_of.model.*;
import com.example.ofabregat.demo_of.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Servicios {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private AtraccionRepository atraccionRepository;

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private SocioRepository socioRepository;

    // Servicio para Productos
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public void guardarProducto(Producto producto) {
        productoRepository.save(producto);
    }

    public Optional<Producto> obtenerProductoPorId(Integer id) {
        return productoRepository.findById(id);
    }

    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }

    // Servicio para Atracciones
    public List<Atraccion> listarAtracciones() {
        return atraccionRepository.findAll();
    }

    public void guardarAtraccion(Atraccion atraccion) {
        atraccionRepository.save(atraccion);
    }

    public Optional<Atraccion> obtenerAtraccionPorId(Integer id) {
        return atraccionRepository.findById(id);
    }

    public void eliminarAtraccion(Integer id) {
        atraccionRepository.deleteById(id);
    }

    // Servicio para Compras
    public List<Compra> listarCompras() {
        return compraRepository.findAll();
    }

    public void guardarCompra(Compra compra) {
        compraRepository.save(compra);
    }

    public Optional<Compra> obtenerCompraPorId(Integer id) {
        return compraRepository.findById(id);
    }

    public void eliminarCompra(Integer id) {
        compraRepository.deleteById(id);
    }

    // Servicio para Empleados
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    public void guardarEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    public Optional<Empleado> obtenerEmpleadoPorId(Integer id) {
        return empleadoRepository.findById(id);
    }

    public void eliminarEmpleado(Integer id) {
        empleadoRepository.deleteById(id);
    }

    // Servicio para Socios
    public List<Socio> listarSocios() {
        return socioRepository.findAll();
    }

    public void guardarSocio(Socio socio) {
        socioRepository.save(socio);
    }

    public Optional<Socio> obtenerSocioPorId(Integer id) {
        return socioRepository.findById(id);
    }

    public void eliminarSocio(Integer id) {
        socioRepository.deleteById(id);
    }
}



