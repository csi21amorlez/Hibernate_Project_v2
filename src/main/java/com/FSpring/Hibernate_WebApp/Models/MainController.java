package com.FSpring.Hibernate_WebApp.Models;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainController {

	public static void main(String[] args) {
		
		
		//Creamos la conexion con la base de datos
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
//		Creamos la sesion		
		Session sesionPrueba = factory.openSession();
		
		try {
			Clientes c = new Clientes("Ángel", "Mora", "MiCasa");
			sesionPrueba.beginTransaction();
			sesionPrueba.persist(c);
			sesionPrueba.save(c);
			sesionPrueba.getTransaction().commit();
			System.out.println("Registro insertado correctamente");
		}catch (Exception e) {
			System.out.println(String.format("[ERROR] -- com.FSpring.Hibernate_WebApp.Models.MainController -- %s", e.toString()));
		}finally {
			factory.close();
			sesionPrueba.close();
		}

	}

}
