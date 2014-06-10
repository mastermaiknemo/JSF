
package mein.jsf.functionality;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 * PRIMEFACES
 * @author mkwidzinski
 */

@ManagedBean
@ViewScoped
public class EditorBean implements Serializable{  
  
    private String value;  
  
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
}  
