package com.cmc.udc.tcc.servicios;

import com.cmc.udc.tcc.modelos.vehiculos.ProductoRepository;
import com.cmc.udc.tcc.modelos.vehiculos.Vehiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//capa de servicios donde se encuentra las operaciones del crud
@Service
public class ProductoServices {
    
    @Autowired
    private ProductoRepository repository;
    
    
    //operacion listar objetos
    public List<Vehiculo>getVehiculos(){
        return repository.findAll();
    }
    
    //operacion guardar objetos
    public Vehiculo saveVehiculo(Vehiculo vehiculo){
        return repository.save(vehiculo);
    }
     
    //operacion para mostrar por id
    
    public Vehiculo getVehiculoById(int id_vehiculo){
        return repository.findById(id_vehiculo).orElse(null);
        
    }
    
    //operacion para actualizar producto
    
    public Vehiculo updateVehiculo(Vehiculo vehiculo){
        Vehiculo existe=getVehiculoById(vehiculo.getId_vehiculo());
        existe.setModelo(vehiculo.getModelo());
        existe.setAno_fabricacion(vehiculo.getAno_fabricacion());
        existe.setCilindraje(vehiculo.getCilindraje());
        existe.setMarca(vehiculo.getMarca());
        
        return repository.save(existe);
    }
    
    //operacion para eliminar
    public void deleteVehiculos(int id_vehiculo){
       repository.deleteById(id_vehiculo);
        
        
    }
    
    
    
    
    
}
