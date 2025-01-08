**Non è necessario sviluppare il main. Non verrà corretto nel caso fosse implementato per delle proprie esigenze di testing.**
# Parte 1
Santa Claus vi chiede gentilmente, anzi urgentemente, un software così avanzato da far sembrare le app di delivery un gioco da ragazzi. Serve qualcosa che gestisca milioni di regali con la precisione di un elfo caffeinomane e la velocità di una renna turbo. Obiettivo? Consegnare i doni a tutti i bambini del mondo senza che Babbo si perda a metà strada o finisca per consegnare il trenino elettrico al signor Scrooge. 

Il software prende vita grazie alla classe principale PoloNord, un vero gioiello di programmazione festiva! Questa classe permette di tenere traccia di tutti i bambini del mondo e dei meravigliosi regali realizzati dagli elfi, trasformando la magia del Natale in pura efficienza tecnologica. 

Ogni bambino è speciale e viene identificato da un codice alfanumerico univoco, oltre al nome, all'indirizzo di residenza e al numero massimo di regali che può ricevere. Per aggiungere un bambino al sistema, si utilizza il magico metodo **aggiungiBambino()** della classe PoloNord, che accetta come parametri il codice, il nome, l'indirizzo e il numero massimo di regali. Se il bambino è già presente nel registro del Polo Nord, il metodo restituisce _false_ e non duplica l'aggiunta; altrimenti, restituisce _true_ e accoglie con successo il nuovo piccolo nel sistema natalizio!

Per recuperare le informazioni sui bambini registrati, basta utilizzare il metodo **getBambino()** della classe PoloNord. Questo metodo accetta come parametro il codice di un bambino e restituisce un riferimento al bambino corrispondente. Se però il codice non corrisponde a nessun bambino nel sistema, il metodo restituisce il valore speciale _null_, come a dire: "Ops, nessun bambino trovato con questo codice!"

Aggiungere un regalo al sistema è un gioco da ragazzi grazie al metodo **aggiungiRegalo()** della classe PoloNord! Basta fornire il codice univoco del regalo, una descrizione e il suo peso. Se il regalo è già stato inserito nel sistema, il metodo restituisce _false_ e non lo aggiunge di nuovo; altrimenti, restituisce _true_ e lo inserisce nel flusso delle preparazioni natalizie! 

Associare un regalo a un bambino è facile come una slitta che scivola sulla neve, grazie al metodo **assegnaRegalo()** della classe PoloNord! Basta fornire il codice del bambino e quello del regalo, e il metodo restituirà _true_ se l’assegnazione ha avuto successo, _false_ altrimenti. Un’assegnazione può fallire in questi casi:
- il regalo non esiste
- il bambino non esiste
- il regalo è stato già assegnato ad un altro bambino (ogni regalo ha un solo destinatario)
- il bambino ha raggiunto il numero massimo di regali

In questi casi, il sistema ci ricorda che ogni cosa deve essere perfetta per la notte di Natale! 

È possibile ottenere facilmente la lista delle richieste già evase grazie al metodo **getRichieste()** della classe PoloNord. Questo metodo restituirà una lista che raccoglie, per ogni bambino, i regali che ha ricevuto. Ogni bambino e ogni regalo sono rappresentati come stringhe, creando un vero e proprio elenco magico di sorrisi e sorprese natalizie!

Esempio:
- Regali di Marco: "Macchinina radiocomandata", "Costume da supereroe"
- Regali di Giulia: "Palla rimbalzante", "Set di pittura"
- Regali di Alice: "Bicicletta", "Pupazzo di neve"
- Regali di Luca: "Treno elettrico", "Libro di magia"

Il metodo **caricaDati()** della classe PoloNord legge un file riga per riga, interpreta i dati e li carica nel sistema, consentendo di gestire bambini, regali e assegnazioni in modo efficiente. Il metodo riceve come parametro il path di un file.

Le righe che contengono un bambino iniziano con la lettera "B" seguita da codice, nome, indirizzo e numero massimo di regali. 

Le righe che contengono un regalo iniziano con la lettera "R" seguita da codice, descrizione e peso. 

Le righe che contengono un'assegnazione iniziano con la lettera "A" seguita da codice bambino e codice regalo.

Gli elementi di ciascuna riga sono separati gli uni dagli altri tramite il carattere ";".

# Parte 2: adesso facciamo sul serio
Ogni slitta viene identificata da un codice alfanumerico univoco, dal numero di renne trainanti e dal carico massimo. Per aggiungere una slitta al sistema, si utilizza il magico metodo **aggiungiSlitta()** della classe PoloNord, che accetta come parametri il codice, il numero di renne e il carico massimo. Se la slitta è già presente nel registro del Polo Nord, il metodo restituisce _false_ e non duplica l'aggiunta; altrimenti, restituisce _true_ e parcheggia con successo il nuovo veicolo nel garage di Babbo Natale!

La classe PoloNord offre il metodo **caricaSlitta()**, che permette di caricare i regali su una slitta, identificata dal suo codice passato come parametro. Il metodo si occupa di caricare sulla slitta i regali già assegnati ai bambini, ma che non sono stati ancora caricati su altre slitte. Il metodo ritorna i chili ancora disponibili sulla slitta.

I regali vengono aggiunti alla slitta seguendo l'ordine del codice bambino, per mantenere tutto perfettamente organizzato e pronto per la grande notte!

**Attenzione1**: Per implementare il metodo caricaSlitta è necessario modificare le classi Bambino e Regalo.

**Attenzione2**: il sistema garantisce che non venga superato il peso massimo consentito per la slitta e che non possano essere caricate consegne incomplete. In altre parole, i regali di un bambino devono essere caricati tutti insieme, oppure nessuno di essi sarà caricato sulla slitta.

**Attenzione3**: Non preoccupatevi di massimizzare il carico sulla slitta (questo è un altro capitolo, che potremmo chiamare "Il problema del commesso viaggiatore", e credetemi, è una storia complessa!).

"Che la magia del Natale riempia i vostri cuori di gioia, proprio come Babbo Natale riempie la sua slitta di regali! E ricordate, anche se il Grinch ha cercato di rubare il Natale, nulla può fermare lo spirito festivo che brilla in ognuno di noi. Auguri di un Natale sereno e ricco di sorrisi, senza bug di sistema e con tanto amore… che sia una notte perfetta, senza nessun errore di codice! 🎄🎅✨"