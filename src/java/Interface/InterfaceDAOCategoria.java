/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Pojos.Categoria;
import java.util.List;

/**
 *
 * @author david13mo
 */
public interface InterfaceDAOCategoria {
    public boolean insert(Categoria categoria) throws Exception;
    public List<Categoria> getAll() throws Exception;
    public Categoria getById(Integer id) throws Exception;
    public boolean delete(Categoria categoria) throws Exception;
    public boolean udpate(Categoria categoria) throws Exception;
}
