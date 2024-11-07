public class Capo {
    private Modello modello;
    private Colore colore;
    private Materiale materiale;
    
    public Capo(Modello modello, Colore colore, Materiale materiale) {
        this.modello = modello;
        this.colore = colore;
        this.materiale = materiale;
    }
    public double getPrezzo(){
        return modello.getCostoFisso() + modello.getNumMateriale()*materiale.getPrezzo();
    }

    
    public String toString() {
        return modello.toString() +" " +colore.toString()+" di "+ materiale.toString();
    }
    
    public Colore getColore() {
        return colore;
    }

    public Materiale getMateriale() {
        return materiale;
    }

    public Modello getModello() {
        return modello;
    }

    

}
