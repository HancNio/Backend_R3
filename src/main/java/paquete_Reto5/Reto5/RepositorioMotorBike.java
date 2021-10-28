/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_Reto5.Reto5;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioMotorBike {
    
    @Autowired
    private InterfaceMotorBike crud;

    public List<MotorBike> getAll(){
        return (List<MotorBike>) crud.findAll();
    }

    public Optional<MotorBike> getmotorbike(int id){
        return crud.findById(id);
    }

    public MotorBike save(MotorBike motorbike){
        return crud.save(motorbike);
    }
    public void delete(MotorBike motorbike){
        crud.delete(motorbike);
    }
    
}
