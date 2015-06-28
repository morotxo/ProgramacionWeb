/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HibernateUtil.HibernateUtil;
import Pojos.Cliente;
import Pojos.Producto;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author david13mo
 */
public class DAOCliente implements Interface.InterfaceDAOCliente{
    private Session session;

    @Override
    public boolean insert(Cliente cliente) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.save(cliente);
        transaction.commit();
        session.clear();
        return true;
        
    }

    @Override
    public List<Cliente> getAll() throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Query q=session.createQuery("From Cliente");
        List<Cliente> list=(List) q.list();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public Cliente getByID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Cliente clientes) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
