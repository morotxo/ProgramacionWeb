/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Pojos.Producto;
import java.util.List;

/**
 *
 * @author david13mo
 */
public interface InterfaceDAOProducto {
    public boolean insert(Producto producto) throws Exception;
    public List<Producto> getAll() throws Exception;
    public Producto getByID(Integer id) throws Exception;
    public boolean delete(Producto productos) throws Exception;
    public boolean update(Producto productos) throws Exception;
}
