package com.saitoani.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saitoani.apirest.apirest.Entities.Producto;



//el kjparepository trabaja con la la entidad en cuestion y su tipo de variable de llave primaria,
// en este caso de la clase Producto con llave primaria de tipo long
public interface ProductoRepository extends JpaRepository<Producto,Long> {

}
