/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mein.jsf.functionality;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;




import org.primefaces.model.chart.PieChartModel;

/**
 * PRIMEFACES
 * @author mkwidzinski
 */
@ManagedBean
@ViewScoped
public class ChartBean implements Serializable {  
  
    private PieChartModel categoryModel;  
  

  public ChartBean() {  
   createChartBean();
    }  
  
      public PieChartModel getCategoryModel() {
        return categoryModel;
    }
  
    private void createChartBean() {  
        categoryModel = new PieChartModel();  
  

               
    }  
    
  
}  
