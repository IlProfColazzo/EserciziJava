public class Collezione {
    private Capo [] collezione;
    private int numCapi;

    public Collezione(){
        this.collezione = new Capo[50];
        numCapi = 0;
    }

    public boolean addCapo(Capo capo){
        if(this.numCapi < this.collezione.length){
            this.collezione[numCapi]=capo;
            this.numCapi++;
            return true;
        }
        return false;
    }
    public String getCapiPerColore(Colore colore){
        String retValue ="";
        for(int i = 0; i<numCapi; i++){
            if(this.collezione[i].getColore()==colore){
                retValue=retValue + " " + this.collezione[i];
            }
        }
        return retValue;
    }

    public String getCapiPerMateriale(Materiale materiale){
        String retValue ="";
        for(int i = 0; i<numCapi; i++){
            if(this.collezione[i].getMateriale()==materiale){
                retValue=retValue + " " + this.collezione[i];
            }
        }
        return retValue;
    }

    public String getCapiPerModello(Modello modello){
        String retValue ="";
        for(int i = 0; i<numCapi; i++){
            if(this.collezione[i].getModello()==modello){
                retValue=retValue + " " + this.collezione[i];
            }
        }
        return retValue;
    }

    public String getCapiPerPrezzo(double min, double max){
        String retValue ="";
        for(int i = 0; i<numCapi; i++){
            if(this.collezione[i].getPrezzo() >= min &&
            this.collezione[i].getPrezzo() <= max){
                retValue=retValue + " " + this.collezione[i];
            }
        }
        return retValue;
    }
}
