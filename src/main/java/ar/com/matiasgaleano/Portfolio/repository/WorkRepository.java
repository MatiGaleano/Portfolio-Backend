/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.matiasgaleano.Portfolio.repository;

import ar.com.matiasgaleano.Portfolio.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository <Work, Long> {
  
}
