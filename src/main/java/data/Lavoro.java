package data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lavoro", schema="monitoraggio")
public class Lavoro {
    
    @Id
    @Column(name="id_lavoro")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private String idLavoro;
private String posizione;
private Date dataInizio;
private Date dataFine;
private String note;



public String getIdLavoro() {
    return idLavoro;
}

public void setIdLavoro(String idLavoro) {
    this.idLavoro = idLavoro;
}

public String getPosizione() {
    return posizione;
}

public void setPosizione(String posizione) {
    this.posizione = posizione;
}
public Date getDataInizio() {
    return dataInizio;
}

public void setDataInizio(Date dataInizio) {
    this.dataInizio = dataInizio;
}

 public Date getDataFine() {
    return dataFine;
}

public void setDataFine(Date dataFine) {
    this.dataFine = dataFine;
}

 public String getNote() {
    return note;
}

public void setNote(String note) {
    this.note = note;
}
}

 