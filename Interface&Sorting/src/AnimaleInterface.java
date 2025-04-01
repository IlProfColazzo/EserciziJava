//Interface: è una classe astratta che contiene solo metodi astratti e costanti.

public interface AnimaleInterface{

    public final int costante = 42;
    
    public abstract String faiVerso();
    public abstract void cammina();


    //Una classe può implementare interface ed estendere altre classi
    //Un'interface puà esterndere altre interface ma non implementare altre interface
    //NO: un'interface implementa un'altra interface
    

}
