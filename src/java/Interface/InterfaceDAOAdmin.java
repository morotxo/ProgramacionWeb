/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Pojos.Administrador;
import java.util.List;

/**
 *
 * @author david13mo
 */
public interface InterfaceDAOAdmin {
    public boolean insert(Administrador admin) throws Exception;
    public List<Administrador> getAll() throws Exception;
    public Administrador getById(Integer id) throws Exception;
    public boolean delete(Administrador admin) throws Exception;
    public boolean udpate(Administrador admin) throws Exception;
}
