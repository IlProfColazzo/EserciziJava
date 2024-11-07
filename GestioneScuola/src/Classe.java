public class Classe {
    private String nome;
    private Studente[] listaStudenti;
    private int nStudenti;
   
    public Classe(String nome){
        this.nome = nome;
        this.listaStudenti = new Studente[30];
        this.nStudenti = 0;
    }

    //metodo aggiungiStudente ritorna vero se ha aggiunto con successo, falso altrimenti.
    //N.B. Fallisce quanto si è raggiunto il limite massimo di studenti.
    public boolean aggiungiStudente(Studente s){
        if(this.nStudenti<this.listaStudenti.length){
            //posso aggiungere
            this.listaStudenti[this.nStudenti]=s;
            s.aggiungiClasse(this);
            this.nStudenti++;
            return true;
        }
        return false;
    }

    public void setScuolaAppartenenza(Scuola scuolaAppartenenza) {
        this.scuolaAppartenenza = scuolaAppartenenza;
    }
    
    public String visualizzaStudenti(){
        String retValue = "";
        for (int i = 0; i < this.nStudenti; i++) {
            Studente tmp = this.listaStudenti[i];
            //System.out.println(tmp.getDescrizioneStudente()); //SOL1
            //System.out.println(this.listaStudenti[i].getNome() + " " + this.listaStudenti[i].getCognome() + " " + this.listaStudenti[i].getCodiceFiscale()); //SOL2
            //tmp.visualizzaStudente();//SOL3

            //retValue = retValue + "\n" + tmp.getDescrizioneStudente();//SOL4
            retValue = retValue + "\n" + tmp; //SOL5 WINNER!!!
        }
        return retValue;
    }

    public String toString(){
        return this.nome + " " + this.nStudenti;
    }

    //il toString converte un oggetto in stringa!
    //è un metodo che può essere chiamato implicitamente ed esplicitamente.
}
