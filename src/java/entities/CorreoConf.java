package entities;
// Generated 18-dic-2014 10:48:44 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CorreoConf generated by hbm2java
 */
@Entity
@Table(name="correo_conf"
    ,catalog="gestordb"
)
public class CorreoConf  implements java.io.Serializable {


     private String direccion;
     private String password;
     private Short smtpPort;
     private String hostName;
     private String addTo;

    public CorreoConf() {
    }

	
    public CorreoConf(String direccion) {
        this.direccion = direccion;
    }
    public CorreoConf(String direccion, String password, Short smtpPort, String hostName, String addTo) {
       this.direccion = direccion;
       this.password = password;
       this.smtpPort = smtpPort;
       this.hostName = hostName;
       this.addTo = addTo;
    }
   
     @Id 

    
    @Column(name="direccion", unique=true, nullable=false, length=80)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="password", length=50)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="smtpPort")
    public Short getSmtpPort() {
        return this.smtpPort;
    }
    
    public void setSmtpPort(Short smtpPort) {
        this.smtpPort = smtpPort;
    }

    
    @Column(name="hostName", length=80)
    public String getHostName() {
        return this.hostName;
    }
    
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    
    @Column(name="addTo", length=80)
    public String getAddTo() {
        return this.addTo;
    }
    
    public void setAddTo(String addTo) {
        this.addTo = addTo;
    }




}


