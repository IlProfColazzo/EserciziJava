import java.util.Comparator;

public class ConfrontaPersonePerNome implements Comparator<Persona>{
    @Override
    public int compare(Persona o1, Persona o2) {
        //ritorna > 0 se o1>o2
        //ritorna < 0 se o1<o2
        //ritorna = 0 se o1==o2
        /*
        if(o1.getNome().compareTo(o2.getNome())>0){
            return 1;
        }
        else if(o1.getNome().compareTo(o2.getNome())<0){
            return -1;
        }
        return 0;
         */
        return o1.getNome().compareTo(o2.getNome());
    }    
}
