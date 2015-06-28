/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Pojos.Cliente;
import java.util.List;


/**
 *
 * @author david13mo
 */
public interface InterfaceDAOCliente {
    public boolean insert(Cliente cliente) throws Exception;
    public List<Cliente> getAll() throws Exception;
    public Cliente getByID(String id) throws Exception;
    public boolean delete(Cliente cliente) throws Exception;
    
}
