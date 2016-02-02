/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Mora;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego Cajas
 */
@Stateless
public class MoraFacade extends AbstractFacade<Mora> {
    @PersistenceContext(unitName = "FinalLibresPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MoraFacade() {
        super(Mora.class);
    }
    
}
