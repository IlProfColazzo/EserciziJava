import java.util.ArrayList;

public class MMS{
    private ArrayList<Citta> citta;

    public MMS(){
        citta = new ArrayList<Citta>();
    }
    /*Il CAP delle città inserite nel sistema deve essere univoco. Il metodo **addCitta()** restituisce 
    false anche nel caso si prova ad inserire una città con un CAP già inserito e 
    l’inserimento non deve avvenire.
    */
    public boolean addCitta(Citta c){
        if(citta.size()<1000){
           /*  for(Citta p : citta){
                if(p.getCap().equals(c.getCap())){
                    return false;
                } 
            }
                */
            if(getCitta(c.getCap())!=null){
                return false;
            }
            citta.add(c);
            return true;
        }
        return false;
    }

    public Citta getCitta(String cap){
        for (Citta c : citta) {
            if(c.getCap().equals(cap)){
                return c;
            }

        } 
        return null;
    }
   
    public String getOpere(String nome){
        String retValue = "";
        for(Citta n: citta){
            retValue += n.getOpere(nome);
        }
        if(retValue.length()!=0)
            return retValue;
        else
            return "Nessuna opera trovata";
    }

}