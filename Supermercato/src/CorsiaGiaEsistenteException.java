public class CorsiaGiaEsistenteException extends Exception{
    public CorsiaGiaEsistenteException(String nome){
        super("La corsia " + nome + " è già esistente.");
    }
    
}
