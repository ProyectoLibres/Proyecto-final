/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.FormaDePago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego Cajas
 */
@Stateless
public class FormaDePagoFacade extends AbstractFacade<FormaDePago> {
    @PersistenceContext(unitName = "FinalLibresPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormaDePagoFacade() {
        super(FormaDePago.class);
    }
    
}
