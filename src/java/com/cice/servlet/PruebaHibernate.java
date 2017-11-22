/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.servlet;

import com.cice.hibernate.pojo.Usuarios;
import com.cice.hibernate.util.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author cice
 */
public class PruebaHibernate extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //1º
        
        Usuarios usuarios = new Usuarios("agv","12345");
        SessionFactory sessionFactory =HibernateUtil.getSessionFactory();
        Session session= sessionFactory.openSession();
        
        
        
        Transaction tx = session.beginTransaction();
        
        session.save(usuarios);
        
        tx.commit();
        
        
        session.close();
                
        
    }


}
