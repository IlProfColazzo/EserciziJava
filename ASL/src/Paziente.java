public class Paziente {
private String nome;
private String cognome;
private String cf;
private Medico medicoAssegnato;

public Paziente(String nome, String cognome, String cf) {
    this.nome = nome;
    this.cognome = cognome;
    this.cf = cf;

}

public Medico getMedicoAssegnato() {
    return medicoAssegnato;
}

public void setMedicoAssegnato(Medico medicoAssegnato) {
    this.medicoAssegnato = medicoAssegnato;
}

@Override
public String toString() {
    return nome+" "+cognome+" "+cf;
}

public String getCf() {
    return cf;
}

}
