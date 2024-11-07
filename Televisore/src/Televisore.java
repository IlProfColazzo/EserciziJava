public class Televisore {
    private boolean isAccesa;
    private boolean isSilenzioso;
    private int volume;
    private int canale;

    public Televisore (int volume, int canale){

        this.isAccesa = false;
        this.isSilenzioso = false;
        if(volume >=1 && volume <=10){
            this.volume = volume;
        }
        else{
            this.volume = 0;
        }

        if(canale >= 1 && canale <= 99){
            this.canale = canale;
        }
        else{
            this.canale = 1;
        }
    }
    

    public void  pulsanteRosso( ){
       this.isAccesa=!this.isAccesa;
    }

    public void impostaCanale(int nuovoCanale){
        if(!this.isAccesa){
            System.out.println("accendi tv");
            return;
        }

        if( nuovoCanale >= 1 && nuovoCanale <= 99){
            this.canale = nuovoCanale; 
        }
    }


    public void canaleSuccessivo(){
        if(!this.isAccesa){
            System.out.println("accendi tv");
            return;
        }
        if(this.canale == 99){
            this.canale = 1;
            return;
        }
        this.canale ++;
    }
    public void canalePrecedente(){
        if(!this.isAccesa){
            System.out.println("accendi tv");
            return;
        }
        if(this.canale == 1){
            this.canale = 99;
            return;
        }
        this.canale --;
    }
    public void pulsanteSilenzioso(){
        if(!this.isAccesa){
            System.out.println("accendi tv");
            return;
        }
        this.isSilenzioso=!this.isSilenzioso;
    }
    public void aumentaVolume(){
        if(!this.isAccesa){
            System.out.println("accendi tv");
            return;
        }
        if(this.volume==10||this.isSilenzioso){
            return;
        }
        this.volume++;
    }
    public void diminuisciVolume(){
        if(!this.isAccesa){
            System.out.println("accendi tv");
            return;
        }
        if(this.volume==0||this.isSilenzioso){
            return;
        }
        this.volume--;
    }
    public void stato(){
        System.out.println("STATO DELLA TV");
        if(this.isAccesa){
        System.out.println("Accesa: ON");

        } else {
        System.out.println("Accesa: OFF");

        }
        if(this.isSilenzioso){
            System.out.println("Silenzioso: ON");
    
        } else {
            System.out.println("Silenzioso: OFF");
    
        }
        System.out.println("Canale: "+this.canale);
        System.out.println("Volume: "+this.volume);




    }
}
