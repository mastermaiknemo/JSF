package mein.jsf;

import java.io.Serializable;
import java.util.ArrayList;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@ManagedBean
@SessionScoped
public class CompanyCompany  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Integer id;
        
	@Column(nullable = false)
	private String name;


	@Column(nullable = false)
	private String legalform;

	@Column(nullable = false)
	private String ceo;
	
	@Column(nullable = false)
	public String headquater;
	
	@Column(nullable = false)
	public String industry;
   
        @Column (nullable = false)
        public String website;
        
 



    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getHeadquater() {
        return headquater;
    }

    public void setHeadquater(String headquater) {
        this.headquater = headquater;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLegalform() {
        return legalform;
    }

    public void setLegalform(String legalform) {
        this.legalform = legalform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

  
        
        
       
	}
     
     
     
   
          

      
     
          


