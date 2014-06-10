/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mein.jsf.dao;

import java.util.ArrayList;
import java.util.List;
import mein.jsf.CompanyCompany;
import mein.jsf.Department;
import mein.jsf.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author widzard
 */
public class DepartmentDao {
    
    	// Diese Methode fügt ein neues Objekt zur Datenbank hinzu.
          public void save(DepartmentDao dao) {
		Session session = null;
                         
		try{	
			 session = HibernateUtil.getSessionFactory().openSession();
                          Transaction transaction = session.beginTransaction(); 
			
				session.save(dao);
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
    public static List<Department> showDeps(){
         List<Department> numberranges = new ArrayList<Department> ();

         try {
            Session session = HibernateUtil.getSessionFactory().openSession();
                  Transaction transaction = session.beginTransaction();

                 numberranges = session.createQuery("From Department").list();

                   session.close();

                  } catch (Exception e) {
              e.printStackTrace();
                      }
return numberranges;
         }
    

//Diese Methode entfernt ein Objekt aus der Datenbank.    
    public void delete(Department dao) {

try {
            Session session = HibernateUtil.getSessionFactory().openSession();
                  Transaction transaction = session.beginTransaction();
                  
         
            
                session.delete(dao);
            transaction.commit();
                session.close();         
}
                catch(Exception ex){
                ex.printStackTrace();
            }

	}

    //Diese Methode aktualisiert ein Objekt, das durch den Benutzer geändert werden kann.        
     public void update(Department dao) {

        
try {
    Session session = HibernateUtil.getSessionFactory().openSession();
                  Transaction transaction = session.beginTransaction();
           
                session.update(dao);
            transaction.commit();
                session.close();        
               
}
                catch(Exception ex){
                ex.printStackTrace();
            }

    
}
}