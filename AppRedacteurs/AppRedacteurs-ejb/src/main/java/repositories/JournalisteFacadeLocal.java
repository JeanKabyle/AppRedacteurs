/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.Journaliste;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author samir
 */
@Local
public interface JournalisteFacadeLocal {

    void create(Journaliste journaliste);

    void edit(Journaliste journaliste);

    void remove(Journaliste journaliste);

    Journaliste find(Object id);

    List<Journaliste> findAll();

    List<Journaliste> findRange(int[] range);

    int count();
    
}
