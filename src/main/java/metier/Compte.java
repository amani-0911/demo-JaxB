package metier;

import com.sun.tracing.dtrace.Attributes;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    @XmlAttribute
    private Long id;
    @XmlElement
    private double solde;
    private Date dateCreation;

    public Compte() {

    }

    public Compte(Long id, double solde, Date dateCreation) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
