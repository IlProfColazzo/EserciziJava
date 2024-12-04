import java.util.ArrayList;

public class Citta {
    private String cap;
    private String nome;
    private ArrayList<Museo> musei;

    public Citta(String cap, String nome) {
        this.cap = cap;
        this.nome = nome;
        musei = new ArrayList<Museo>();
    }

    public String getCap() {
        return cap;
    }

    public boolean addMuseo(Museo m){
        if(musei.size()<1000){
            musei.add(m);
            return true;
        }
        return false;
    }
    public Museo getMuseo(String nome){
        for (Museo m : musei) {
            if(m.getNome().equals(nome)){
                return m;
            }
        } 
        return null;
    }
    public String getMusei(){
        String retValue = "\"";
        int i = 0;
        for (Museo m : musei) {
            i++;
            if(i != musei.size()){ 
            retValue+= m + "+";
            }
            else{
                retValue+= m;
            }
        }

        return retValue + "\"";
    }
    public String getOpere(String nome){
        String retValue = "";
        for(Museo m: musei){
            String opereInMuseo = m.getOpere(nome);
            if(opereInMuseo.length()!=0){
                retValue += this.nome + "-" + m.getNome() + "\n"; 
                retValue += opereInMuseo + "\n";            
            } 
        }
        return retValue;
    }




    
    
}
