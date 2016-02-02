/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.UsuarioUnidadNegocio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego Cajas
 */
@Stateless
public class UsuarioUnidadNegocioFacade extends AbstractFacade<UsuarioUnidadNegocio> {
    @PersistenceContext(unitName = "FinalLibresPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioUnidadNegocioFacade() {
        super(UsuarioUnidadNegocio.class);
    }
    
}
