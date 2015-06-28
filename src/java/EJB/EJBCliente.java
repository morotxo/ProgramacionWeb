/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import DAO.DAOCliente;
import Pojos.Cliente;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author david13mo
 */
@Stateless
public class EJBCliente {
    private Cliente cliente;
    private List<Cliente> listaCliente;
    private final DAOCliente daoCliente;

   
    
    
    public EJBCliente(){
        cliente=new Cliente();
        daoCliente=new DAOCliente();
    }
    public boolean insert(){
        try{
            daoCliente.insert(cliente);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public Cliente getCliente() {
        return cliente;
    }
    public boolean getALl(){
        try{
            listaCliente=daoCliente.getAll();
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

  
    
    

}
