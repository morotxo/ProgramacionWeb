/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HibernateUtil.HibernateUtil;
import Interface.InterfaceDAOProducto;
import Pojos.Producto;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author david13mo
 */
public class DAOProducto implements InterfaceDAOProducto{
    private Session session;
    @Override
    public boolean insert(Producto producto) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction =session.beginTransaction();
        session.save(producto);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<Producto> getAll() throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Query q=session.createQuery("From Producto");
        List<Producto> list =(List) q.list();
        transaction.commit();
        session.close();
        return list;
        
    }

    @Override
    public Producto getByID(Integer id) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Producto producto=(Producto)session.get(Producto.class, id);
//        Query q=session.createQuery("From Producto TP where TP.idProducto=:id");
//        q.setParameter("id", id);
//        Producto producto1 =(Producto)q.uniqueResult();
        transaction.commit();
        session.close();
        return producto;

    }

    @Override
    public boolean delete(Producto productos) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Producto productos) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.update(productos);
        transaction.commit();
        session.close();
        return true;
    }
    
}
