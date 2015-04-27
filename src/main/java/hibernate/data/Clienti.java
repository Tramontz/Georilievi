package hibernate.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lavoro", schema="monitoraggio")
public class Clienti {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private String idCliente;
private String nome;
private String cognome;
private String permesso;
private String mail;
private int telefono;
private int commessa;
private String password;



public String getIdCliente() {
    return idCliente;
}

public void setIdCliente(String idCliente) {
    this.idCliente = idCliente;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
public String getCognome() {
    return cognome;
}

public void setCognome(String cognome) {
    this.cognome = cognome;
}

 public String getPermesso() {
    return permesso;
}

public void setPermesso(String permesso) {
    this.permesso = permesso;
}

 public String getMail() {
    return mail;
}

public void setMail(String mail) {
    this.mail = mail;
}

public int getTelefono() {
    return telefono;
}

public void setTelefono(int telefono) {
    this.telefono = telefono;
}

public int getCommessa() {
    return commessa;
}

public void setCommessa(int commessa) {
    this.commessa = commessa;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}
}

 