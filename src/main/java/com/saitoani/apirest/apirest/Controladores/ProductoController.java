package com.saitoani.apirest.apirest.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saitoani.apirest.apirest.Repositories.ProductoRepository;

import com.saitoani.apirest.apirest.Entities.Producto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


//el decorador que n os permitira hacerr esto son
@RestController
@RequestMapping("/product")
public class ProductoController { 

    //a continuacion las funciones CRUD
     
    //En spring con esta estiqueta sabe a que repositorio sabe cual se va a representar
    @Autowired
    private ProductoRepository productoRepository;

    

    @GetMapping 
    public List<Producto> getAlllProductos(){

        return productoRepository.findAll();
    }


    @GetMapping("/{id}")
    public Producto getProducbyId(@PathVariable Long id){
        return productoRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("no se encontro el producto con ID: "+id));
    }

    @PostMapping 
    public Producto createProducto(@RequestBody Producto producto){

        return productoRepository.save(producto);
    }
    

    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto detallesProducto) {
        
        Producto producto = productoRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("no se encontro el producto con Id: "+ id));
        producto.setNombre(detallesProducto.getNombre());
        producto.setPrecio(detallesProducto.getPrecio());
        return  productoRepository.save(producto);
    }

    @DeleteMapping("/{id}")
    public String borrarProducto( @PathVariable Long id){
        Producto producto = productoRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("no se encontro el producto con Id: "+ id));

        productoRepository.delete(producto);
        return "El producto con Id: " + id + "fue borrado";

    }
}
