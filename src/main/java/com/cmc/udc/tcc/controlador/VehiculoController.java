
package com.cmc.udc.tcc.controlador;

import com.cmc.udc.tcc.modelos.vehiculos.Vehiculo;
import com.cmc.udc.tcc.servicios.ProductoServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehiculos")
//conexión de nuestro backend con nuestro frontend 
@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
public class VehiculoController {
    @Autowired
    private ProductoServices service;
    
    //metodo listar vehiculos con Get
    @GetMapping
    public List<Vehiculo>findAllVehiculos(){
       return service.getVehiculos();
    }

    //metodo agregar vehiculos 
    @PostMapping
    public Vehiculo addVehiculos(@RequestBody Vehiculo vehiculo){
        
        return service.saveVehiculo(vehiculo);
         
    }
    //metodo buscar vehiculos por id 
    @GetMapping("/{id_vehiculo}")
    public Vehiculo findVehiculoId(@PathVariable int id_vehiculo){
        return service.getVehiculoById(id_vehiculo);
    }
   
    //metodo actualizar vehiculos 
    
    @PutMapping("/{id_vehiculo}")
    public Vehiculo updateVehiculos(@RequestBody Vehiculo vehiculo,@PathVariable int id_vehiculo){
        vehiculo.setId_vehiculo(id_vehiculo);
        return service.updateVehiculo(vehiculo);
         
    }
    
    
    
     //metodo eliminar vehiculo
    
    @DeleteMapping("/{id_vehiculo}")
    public void deleteVehiculoId(@PathVariable int id_vehiculo){
        service.deleteVehiculos(id_vehiculo);
        
    }

}
