package com.cmc.udc.tcc.modelos.vehiculos;

import org.springframework.data.jpa.repository.JpaRepository;

//interface donde se encuentran las operaciones crud de la tabla producto
public interface ProductoRepository extends JpaRepository<Vehiculo, Integer> {

}
