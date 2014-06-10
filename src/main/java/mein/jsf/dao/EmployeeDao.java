/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mein.jsf.dao;

import java.util.ArrayList;
import java.util.List;
import mein.jsf.CompanyCompany;
import mein.jsf.Employee;
import mein.jsf.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author widzard
 */
public class EmployeeDao {
    
    	// Diese Methode fügt ein neues Objekt zur Datenbank hinzu.
          public void save(Employee emp) {
		Session session = null;
                         
		try{	
			 session = HibernateUtil.getSessionFactory().openSession();
                          Transaction transaction = session.beginTransaction(); 
			
				session.save(emp);
                                transaction.commit();
				System.out.println("Done");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{			
			session.close();

                }
          }

          
//Diese Methode gibt alle objektspezifischen Daten aus der Datentabelle aus.
    // Die Sortierung und die Ausgabe der Daten erfolgt in der jeweiligen .jsf-Datei 
    public static List<Employee> showEmps(){
         List<Employee> numberranges = new ArrayList<Employee> ();

         try {
            Session session = HibernateUtil.getSessionFactory().openSession();
                  Transaction transaction = session.beginTransaction();

                 numberranges = session.createQuery("From Employee").list();

                   session.close();

                  } catch (Exception e) {
              e.printStackTrace();
                      }
return numberranges;
         }
    

//Diese Methode entfernt ein Objekt aus der Datenbank.    
    public void delete(Employee emp) {

try {
            Session session = HibernateUtil.getSessionFactory().openSession();
                  Transaction transaction = session.beginTransaction();
                  
         
            
                session.delete(emp);
            transaction.commit();
                session.close();         
}
                catch(Exception ex){
                ex.printStackTrace();
            }

	}

    //Diese Methode aktualisiert ein Objekt, das durch den Benutzer geändert werden kann.        
     public void update(Employee emp) {

        
try {
    Session session = HibernateUtil.getSessionFactory().openSession();
                  Transaction transaction = session.beginTransaction();
           
                session.update(emp);
            transaction.commit();
                session.close();        
               
}
                catch(Exception ex){
                ex.printStackTrace();
            }

    
}
}