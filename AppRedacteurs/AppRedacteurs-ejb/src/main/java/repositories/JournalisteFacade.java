/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import entities.Journaliste;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author samir
 */
@Stateless
public class JournalisteFacade extends AbstractFacade<Journaliste> implements JournalisteFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_AppRedacteurs-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JournalisteFacade() {
        super(Journaliste.class);
    }
    
}
