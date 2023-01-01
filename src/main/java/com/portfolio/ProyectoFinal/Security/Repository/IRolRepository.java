/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ProyectoFinal.Security.Repository;

import com.portfolio.ProyectoFinal.Security.Entity.Rol;
import com.portfolio.ProyectoFinal.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristian
 */

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional <Rol> findByRolNombre (RolNombre rolNombre);
    
}
