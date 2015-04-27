package hibernate.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.vividsolutions.jts.geom.Geometry;

@Entity
@Table(name="strumento", schema="monitoraggio")
public class Strumento {
    
    @Id
    @Column(name="id_strumento")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private String idStrumento;
    @Column(name="nome_strumento")
private String nome;
private int lavoro;
private String posizione;
private boolean attivo;
private String note;
@Column(name="coordinate_GPS")
private Geometry coordinate;




public String getIdStrumento() {
    return idStrumento;
}

public void setIdStrumento(String idStrumento) {
    this.idStrumento = idStrumento;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getLavoro() {
    return lavoro;
}

public void setLavoro(int lavoro) {
    this.lavoro = lavoro;
}

 public String getPosizione() {
    return posizione;
}

public void setPosizione(String posizione) {
    this.posizione = posizione;
}

 public boolean getAttivo() {
    return attivo;
}

public void setAttivo(boolean attivo) {
    this.attivo = attivo;
}

public String getNote() {
    return note;
}

public void setNote(String note) {
    this.note = note;
}

public Geometry getCoordinate() {
    return coordinate;
}

public void setCoordinate(Geometry coordinate) {
    this.coordinate = coordinate;
}

}