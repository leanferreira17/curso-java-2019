package com.vates.modulo.IV.hibernate.aplicacion;

import com.vates.modulo.IV.hibernate.entidades.Producto;
import com.vates.modulo.IV.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateController {
    public static void main(String[] args) {

        Producto producto = new Producto("Tv", "Televisor led 55", 7899.09f);

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // comenzamos la transacción
            transaction = session.beginTransaction();
            // guardamos el objeto
            session.save(producto);

            // realizamos el commit sobre la transacción
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Producto> productos = session.createQuery("from Producto", Producto.class).list();

            for (Producto p : productos) {
                System.out.println(p.toString());
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        // comenzamos la transacción
        transaction = session.beginTransaction();
        // eliminamos el objeto
        session.remove(producto);
        // realizamos el commit sobre la transacción
        transaction.commit();
        session.close();
    }
}
