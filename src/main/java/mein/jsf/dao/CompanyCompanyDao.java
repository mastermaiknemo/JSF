/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mein.jsf.dao;


import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import mein.jsf.CompanyCompany;
import mein.jsf.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author mkwidzinski
 */


@ManagedBean
@SessionScoped
public class CompanyCompanyDao {
    
    
    	// Diese Methode fügt ein neues Objekt zur Datenbank hinzu.
          public void save(CompanyCompany companyCompany) {
		Session session = null;
                         
		try{	
			 session = HibernateUtil.getSessionFactory().openSession();
                          Transaction transaction = session.beginTransaction(); 
			
				session.save(companyCompany);
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
    public static List<CompanyCompany> showRange(){
         List<CompanyCompany> numberranges = new ArrayList<CompanyCompany> ();

         try {
            Session session = HibernateUtil.getSessionFactory().openSession();
                  Transaction transaction = session.beginTransaction();

                 numberranges = session.createQuery("From CompanyCompany").list();

                   session.close();

                  } catch (Exception e) {
              e.printStackTrace();
                      }
return numberranges;
         }
    

//Diese Methode entfernt ein Objekt aus der Datenbank.    
    public void delete(CompanyCompany cc) {

try {
            Session session = HibernateUtil.getSessionFactory().openSession();
                  Transaction transaction = session.beginTransaction();
                  
         
            
                session.delete(cc);
            transaction.commit();
                session.close();         
}
                catch(Exception ex){
                ex.printStackTrace();
            }

	}

    //Diese Methode aktualisiert ein Objekt, das durch den Benutzer geändert werden kann.        
     public void update(CompanyCompany cc) {

        
try {
    Session session = HibernateUtil.getSessionFactory().openSession();
                  Transaction transaction = session.beginTransaction();
           
                session.update(cc);
            transaction.commit();
                session.close();        
               
}
                catch(Exception ex){
                ex.printStackTrace();
            }


    
     }
     

     
    
    
    

       

     
}
