public class MainClass {
    public static void main(String[] args) {
        Modello modello = new Modello("Nike", 15, 10);
        Colore c1 = new Colore("rosso");
        Materiale m1 = new Materiale ("Lana",50.0);
        Capo capo = new Capo (modello, c1, m1);
        Collezione collezione = new Collezione();
        collezione.addCapo(capo);
        System.out.println(capo);
        System.out.println(collezione.getCapiPerColore(c1));
        System.out.println(collezione.getCapiPerMateriale(m1));
        System.out.println(collezione.getCapiPerModello(modello));
        System.out.println(collezione.getCapiPerPrezzo(0,100));



    }
}
