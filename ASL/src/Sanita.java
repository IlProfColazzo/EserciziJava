import java.util.HashMap;

public class Sanita {
    private HashMap<String, Paziente> listaPazienti;
    private HashMap<String, Medico> listaMedici;

    public Sanita(){
        this.listaMedici= new HashMap<>();
        this.listaPazienti=new HashMap<>();
    }

    public boolean aggiungiPaziente(String cf, String nome, String cognome){
        if(listaPazienti.containsKey(cf)){
            return false;
        }else{
            Paziente ptmp= new Paziente(nome, cognome, cf);
            listaPazienti.put(cf, ptmp);
            return true;    
        }

    }

    public Paziente getPaziente(String cf){
        if(listaPazienti.containsKey(cf)){
            return listaPazienti.get(cf);
        }
        else
        return null;
    }

    public boolean aggiungiMedico(String nome, String cognome, String cf,String matricola){
        if(listaMedici.containsKey(matricola)){
            return false;
        }else{
            Medico mtmp= new Medico(nome, cognome, cf, matricola);
            listaMedici.put(matricola, mtmp);
            return true;    
        }

    }

    public Medico getMedico(String matricola){
       return listaMedici.get(matricola);
    }


    public boolean assegnaMedico(String matricola, String cf){
        if(!listaMedici.containsKey(matricola)||!listaPazienti.containsKey(cf)||listaPazienti.get(cf).getMedicoAssegnato()!=null){
            return false;
        }else{
            Medico m= listaMedici.get(matricola);
            Paziente p=listaPazienti.get(cf); 
            p.setMedicoAssegnato(m);
            m.addPaziente(p);
            return true;
        } 
    }

    
    public String getMediciDeiMedici(){
        String retValue = "";
        for (Medico m : listaMedici.values()) { //itero su tutti i medici
            Medico medicoDelMedico=null;
            boolean devoUscire = false;
            do{
                if(listaPazienti.containsKey(m.getCf())){ //controllo se il medico m
                    //è anche un paziente. Se vero:
                    retValue += m.getMatricola() + "-"; //aggiungo la prima matricola 
                    Paziente p = listaPazienti.get(m.getCf()); //prendo la "versione"
                    //paziente del medico m
                    medicoDelMedico = p.getMedicoAssegnato(); //prendo il medico 
                    //assegnato al paziente (cioè il medico del medico)
                    if(medicoDelMedico!=null){ //controllo che
                        //al paziente sia associato un medico
                        if(retValue.contains(medicoDelMedico.getMatricola()+"-")){
                            //controllo che non stia andando il loop
                            devoUscire = true;
                        }
                        retValue = retValue + medicoDelMedico.getMatricola() + "-->"; 
                    }
                }
                m = medicoDelMedico; //salto al medico successivo
            }while(medicoDelMedico!=null && devoUscire==false);
            retValue+="\n";
        }
        return retValue;
    }

    public static int fnzRicorsiva(int k){
        if(k == 100){
            return k;
        }
        return fnzRicorsiva(k+1);
    }
    







}
