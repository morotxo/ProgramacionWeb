/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HibernateUtil.HibernateUtil;
import Pojos.Administrador;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author david13mo
 */
public class DAOAdmin implements Interface.InterfaceDAOAdmin{
    private Session session;

    @Override
    public boolean insert(Administrador admin) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.save(admin);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<Administrador> getAll() throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction =session.beginTransaction();
        Query q=session.createQuery("From Administrador");
        List<Administrador> list=(List) q.list();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public Administrador getById(Integer id) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Administrador admin=(Administrador)session.get(Administrador.class, id);
        transaction.commit();
        session.close();
        return admin;

    }

    @Override
    public boolean delete(Administrador admin) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean udpate(Administrador admin) throws Exception {
        session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.update(admin);
        transaction.commit();
        session.close();
        return true;    }
    
}
