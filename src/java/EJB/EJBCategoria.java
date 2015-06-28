/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import DAO.DAOCategoria;
import Pojos.Categoria;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author david13mo
 */
@Stateless
public class EJBCategoria {
    private Categoria categoria;
    private List<Categoria> listaCategorias;
    private final DAOCategoria daoCategoria;
    public EJBCategoria(){
        categoria=new Categoria();
        daoCategoria=new DAOCategoria();
    }
    public boolean insert(){
        try{
            daoCategoria.insert(categoria);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean getAll(){
        try{
            listaCategorias=daoCategoria.getAll();
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean getByID(){
        try{
            categoria=daoCategoria.getById(categoria.getIdCategoria());
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(List<Categoria> listaClientes) {
        this.listaCategorias = listaClientes;
    }
    
   
}
