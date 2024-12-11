Il Dott. Ignazio Buonsanto, direttore amministrativo del Presidio di Brindisi “Di Summa - Perrino” vi chiede la fornitura di un software che permetta la gestione dei medici e dei pazienti dell’ospedale.

Il programma funzione attraverso la classe principale Sanita e permette di inserire medici e pazienti all’interno del sistema.

I pazienti sono caratterizzati da nome, cognome e codice fiscale e possono essere registrati presso il sistema tramite il metodo **aggiungiPaziente()** che riceve come parametri nome, cognome e codice fiscale.

Per recuperare le informazioni sui pazienti inseriti si può utilizzare il metodo **getPaziente()** della classe Sanita che riceve come parametro il codice fiscale e restituisce un riferimento al paziente. Se non esiste nessun paziente con il codice fiscale specificato, viene restituito il valore speciale _null_.

I medici hanno le stesse caratteristiche dei pazienti ed inoltre sono caratterizzati da una matricola (codice alfanumerico). È possibile aggiungere un medico presso il sistema tramite il metodo **aggiungiMedico()** della classe Sanita che riceve come parametri matricola, nome, cognome e codice fiscale.

Per recuperare le informazioni sui medici si può utilizzare il metodo **getMedico()** che riceve come parametro la matricola e restituisce un riferimento al medico. Se non esiste nessun medico con la matricola specificata, viene restituito il valore speciale _null_.

È possibile assegnare un medico ad un paziente tramite il metodo **assegnaMedico()** della classe Sanita che riceve come parametri la matricola del medico e il codice fiscale del paziente. Tale metodo restituisce _true_ nel caso in cui l’assegnazione va a buon fine, _false_ altrimenti. Un’assegnazione può fallire se il medico e/o il paziente non esiste oppure se il paziente ha già un medico assegnato.

**N.B. I medici possono essere a loro volta pazienti di un altro medico.**

Dato un medico, deve essere possibile ottenere la lista dei pazienti tramite il metodo **getPazienti()** della classe medico. La lista sarà formata da una stringa di pazienti. La stringa inizia e termina con il carattere “ (virgolette). Ogni paziente è rappresentato come una stringa formata da _nome cognome cf_ (es. _Mario Rossi MRORSS99S896V_) ed è separato dagli altri tramite un a capo.

Per ogni medico presente all’interno del sistema è possibile ottenere un “albero dei medici” utilizzando il metodo **getMediciDeiMedici()** della classe Sanita. Un albero dei medici è la lista dei medici dei medici dei medici dei medici dei medici (😊).

Esempio:

C099 - C001 -->C002-->C003-->C004

Vuol dire che il medico C099 è paziente del medico C001, che a sua volta è paziente del medico C002, che a sua volta è paziente del medico C003, che a sua volta è paziente del medico C004. La lista termina quando:
- un medico non ha un medico (nell’esempio precedente il medico C004 non è paziente di nessuno);
- un medico non è un paziente;
- si incontra un medico già presente all’interno della lista.

Esempio:

C099 - C001-->C002-->C003-->C004-->C002

Vuol dire che il medico C099 è paziente del medico C001, che a sua volta è paziente del medico C002, che a sua volta è paziente del medico C003, che a sua volta è paziente del medico C004 , che a sua volta è paziente del medico C002.

Tramite il metodo **caricaDati()**, che riceve come parametro il path di un file, deve essere possibile leggere da file i pazienti ed i medici.

Il file è organizzato a righe, ogni riga può contenere un medico o una persona o un comando di assegnazione.

Le righe che contengono una persona iniziano con la lettera "P" seguita da nome, cognome e codice fiscale. 

Le righe che contengono un medico iniziano con la lettera "M" seguita da matricola, nome, cognome e codice fiscale. 

Le righe che contengono un comando di assegnazione iniziano con la lettera “A” seguita da matricola e codice fiscale.
Gli elementi di ciascuna riga sono separati gli uni dagli altri tramite il carattere ";".

In caso di errore dei dati presenti su una linea (meno attributi o più attributi), il metodo deve essere in grado di ignorarla e passare a quella successiva.

Il main deve permettere il testing di tutte le funzionalità del programma sviluppato.