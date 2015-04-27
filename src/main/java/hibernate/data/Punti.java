/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.vividsolutions.jts.geom.Geometry;



@Entity
@Table(name="prismi", schema="monitoraggio")
public class Punti{
    
    @Id
    @Column(name="id_prisma")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private String idPrisma;
    
    @Column(name="nome_prisma")
private String nomePrisma;
private boolean caposaldo;
private String tipo;
private String strumento;
    @Column(name="spostamento_verticale")
private float spostamentoVerticale;
    
    @Column(name="spostamento_x")
private float spostamentoX;
        
    @Column(name="spostamento_y")
private float spostamentoY;
            
    @Column(name="data_ora")
private Date dataOra;
private String note;
private boolean georeferenziato;
    @Column(name="coordinate_GPS")
private Geometry coordinateGPS;

 
public String getIdPrisma() {
    return idPrisma;
}

public void setIdPrisma(String idPrisma) {
    this.idPrisma = idPrisma;
}

public String getNomePrisma() {
    return nomePrisma;
}

public void setNomePrisma(String nomePrisma) {
    this.nomePrisma = nomePrisma;
}

public boolean getCaposaldo() {
    return caposaldo;
}

public void setCaposaldo(boolean caposaldo) {
    this.caposaldo = caposaldo;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public String getStrumento() {
    return strumento;
}

public void setStrumento(String strumento) {
    this.strumento = strumento;
}

public float getSpostamentoVerticale() {
    return spostamentoVerticale;
}

public void setSpostamentoVerticale(float spostamentoVerticale) {
    this.spostamentoVerticale = spostamentoVerticale;
}

public float getSpostamentoX() {
    return spostamentoX;
}

public void setSpostamentoX(float spostamentoX) {
    this.spostamentoX = spostamentoX;
}

public float getSpostamentoY() {
    return spostamentoY;
}

public void setSpostamentoY(float spostamentoY) {
    this.spostamentoY = spostamentoY;
}

public Date getDataOra() {
    return dataOra;
}

public void setDataOra(Date dataOra) {
    this.dataOra = dataOra;
}

public String getNote() {
    return note;
}

public void setNote(String note) {
    this.note = note;
}

public boolean getGeoregerenziato(){
    return georeferenziato;
}

public void setGeoreferenziato(boolean georeferenziato){
    this.georeferenziato=georeferenziato;
}
    
public Geometry getCoordinateGPS(){
    return coordinateGPS;
}

public void setCoordinateGPS(Geometry coordinateGPS){
    this.coordinateGPS=coordinateGPS;
}
}