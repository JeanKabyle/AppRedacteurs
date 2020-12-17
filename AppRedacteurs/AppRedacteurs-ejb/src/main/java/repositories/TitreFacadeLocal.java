/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.Titre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author samir
 */
@Local
public interface TitreFacadeLocal {

    void create(Titre titre);

    void edit(Titre titre);

    void remove(Titre titre);

    Titre find(Object id);

    List<Titre> findAll();

    List<Titre> findRange(int[] range);

    int count();
    
}
