/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import DAO.DAOAdmin;
import Pojos.Administrador;
import Pojos.Producto;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author david13mo
 */
@Stateless
public class EJBAdmin {

    private Administrador admin;
    private List<Administrador> listaAdministrador;
    private final DAOAdmin dAOAdmin;
    public EJBAdmin(){
        admin=new Administrador();
        dAOAdmin=new DAOAdmin();
    }
    public boolean insert(){
        try{
            dAOAdmin.insert(admin);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean update(){
        try{
            dAOAdmin.udpate(admin);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean getAll(){
        try{
            listaAdministrador=dAOAdmin.getAll();
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean getByID(){
        try{
            admin=dAOAdmin.getById(admin.getIdAdmin());
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public List<Administrador> getListaAdministrador() {
        return listaAdministrador;
    }

    public void setListaAdministrador(List<Administrador> listaAdministrador) {
        this.listaAdministrador = listaAdministrador;
    }
}
