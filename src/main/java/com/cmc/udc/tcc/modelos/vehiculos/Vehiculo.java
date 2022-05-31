package com.cmc.udc.tcc.modelos.vehiculos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//clase entidad de la tabla Vehiculo
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Vehiculo")
public class Vehiculo {

    //Primary Key
    @Id
   
    private int id_vehiculo;
  
    private String marca;
    
    private String modelo;
  
    private int cilindraje;
   
    private int ano_fabricacion;

}
