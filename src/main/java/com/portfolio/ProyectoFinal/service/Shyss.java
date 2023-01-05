/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ProyectoFinal.service;

import com.portfolio.ProyectoFinal.entity.Hys;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.ProyectoFinal.repository.RHys;

@Transactional
@Service
public class Shyss {
    @Autowired
    RHys rhys;
    
    public List<Hys> list(){
        return rhys.findAll();
    }
    
    public Optional<Hys> getOne(int id){
        return rhys.findById(id);
    }
    
    public Optional<Hys> getByNombre(String nombre){
        return rhys.findByNombre(nombre);
    }
    
    public void save(Hys skill){
        rhys.save(skill);
    }
    
    public void delete(int id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rhys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhys.existsByNombre(nombre);
    }
}