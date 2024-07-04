package com.saitoani.apirest.apirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//decorador que nos indica que sera una clase que importa de una entidad.
@Entity
public class Producto {
        //decorador usado para hacer una llave primaria y con un id autoincrementable
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        private Long id;
        private String nombre;
        private Double precio;

        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public double getPrecio() {
            return precio;
        }
        public void setPrecio(double precio) {
            this.precio = precio;
        }
        
        

}
