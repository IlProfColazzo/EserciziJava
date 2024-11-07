public class Scuola {
    private String nome;
    private Classe[] listaClassi;
    private int numClassi;
    
    public Scuola(String nome, int maxClassi){
        this.nome = nome;
        this.numClassi = 0;
        this.listaClassi = new Classe[maxClassi];
    }

    // Ritorna vero se la classe viene aggiunta correttamente, altrimenti falso
    public boolean aggiungiClasse(Classe classe){
        if(this.listaClassi.length > this.numClassi){
            this.listaClassi[this.numClassi] = classe;
            classe.setScuolaAppartenenza(this);
            this.numClassi++;
            return true;
        }
        return false;
    }


}
