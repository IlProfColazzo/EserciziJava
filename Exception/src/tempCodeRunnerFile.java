







        

        /*int v[] = new int[20];
    
        Scanner tastiera = new Scanner(System.in);
    
    
        int indice = tastiera.nextInt();

        System.out.println(v[indice]);
        */
        //Unchecked exception sono eccezioni che possono verificarsi
        //ma che non sono obbligato (io programmatore) a gestire.

        //Checked exception sono eccezioni che possono verificarsi
        //ma che sono obbligato a gestire. Altrimenti il codice non compila!!
        //Se non gestisco le checked il compilatore me lo indica.

        //Tutto ciò che non è Runtime Exception (o figli) è checked.

        //1) posso rilanciare l'eccezione con throws
        //2) posso catturare l'eccezione
        try{
            //try: prova ad eseguire tutti il codice che c'è nel blocco.
            //se nel try si rileva un'eccezione si salta al blocco catch
            A[] v = new A[10];
            //v[0].saluta(); //nullpointer
            //v[3000].saluta(); //ArrayIndexOutOfBounds 
            //A.readFile("ciao.txt"); //filenotfound
            //writeFile("out.txt");
        }catch(NullPointerException /*| FileNotFoundException */e){
            //le catch ci metto quello che deve essere eseguito quando si cattura
            //un'eccezione
            System.out.println("Aiutoooo. Ho catturato un'eccezione");
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Aiutoooo. Ho catturato un'eccezione che va oltre i limiti");
        }
        catch (Exception e){

        }
        finally{
            System.out.println("Sono dopo il catch");
        }

