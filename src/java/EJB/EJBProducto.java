/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import DAO.DAOProducto;
import Pojos.Producto;
import static java.lang.System.out;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author david13mo
 */
@Stateless
public class EJBProducto {

    private Producto producto;
    private List<Producto> listaProducto;
    private final DAOProducto daoProducto;
    public EJBProducto(){
        producto=new Producto();
        daoProducto=new DAOProducto();
    }
    
    public boolean insert(){
        try{
            daoProducto.insert(producto);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean update(){
        try{
            daoProducto.update(producto);
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    public boolean getByID(){
        try{
            producto=daoProducto.getByID(producto.getIdProducto());
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }
    
    public boolean getAll(){
        try{
            listaProducto = daoProducto.getAll();
            return true;
        }catch(Exception ex){
            out.println(ex.getMessage());
            return false;
        }
    }
    

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
}
