/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HibernateUtil.HibernateUtil;
import Pojos.Categoria;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author david13mo
 */
public class DAOCategoria implements Interface.InterfaceDAOCategoria{
    private Session session;
    @Override
    public boolean insert(Categoria categoria) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.save(categoria);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<Categoria> getAll() throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction =session.beginTransaction();
        Query q=session.createQuery("From Categoria");
        List<Categoria> list=(List) q.list();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public Categoria getById(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Categoria categoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean udpate(Categoria categoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
