/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author samir
 */
@Entity
public class Titre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    
    private String periode;
    
    private Journaliste redacteurEnChef;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titre)) {
            return false;
        }
        Titre other = (Titre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Titre[ id=" + id + " ]";
    }
    
    public Titre(){
        
    }

    public Titre(Long id, String nom, String periode, Journaliste redacteurEnChef) {
        this.id = id;
        this.nom = nom;
        this.periode = periode;
        this.redacteurEnChef = redacteurEnChef;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public Journaliste getRedacteurEnChef() {
        return redacteurEnChef;
    }

    public void setRedacteurEnChef(Journaliste redacteurEnChef) {
        this.redacteurEnChef = redacteurEnChef;
    }
    
    
    
}
