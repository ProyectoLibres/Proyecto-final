/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.AbonoDeuda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego Cajas
 */
@Stateless
public class AbonoDeudaFacade extends AbstractFacade<AbonoDeuda> {
    @PersistenceContext(unitName = "FinalLibresPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AbonoDeudaFacade() {
        super(AbonoDeuda.class);
    }
    
}
