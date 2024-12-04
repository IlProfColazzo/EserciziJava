import java.util.ArrayList;

public class Museo {
    private String nome;
    private ArrayList<Opera> opere;
    private int visitatori;

    public Museo(String nome, int visitatori) {
        this.nome = nome;
        this.visitatori = visitatori;
        opere = new ArrayList<Opera>();
    }

    public boolean addOpera(Opera o){
        if(opere.size()<1000){
            opere.add(o);
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getOpere(){
        String retValue = "\"";
        int i = 0;
        for (Opera o : opere) {
            i++;
            if(i != opere.size()){ 
            retValue+= o + ";";
            }
            else{
                retValue+= o;
            }
        }

        return retValue + "\"";
    }

    public String toString(){
        return nome;
    }
    public String getOpere(String nome){
        String retValue = "";
        for(Opera o: opere){
            if(o.getNomeArtista().equals(nome)){
                retValue += "- " + o + "\n";
            }
            
        }
        return retValue;
    }

}
