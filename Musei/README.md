La regione Puglia vi chiede la fornitura di un software che permetta la gestione di tutti i musei presenti sul territorio regionale.

L’interazione con il sistema avviene attraverso la classe MMS (Museum Management System).

I musei sono dislocati in diverse città (massimo 1000 città e 1000 musei per città). Ogni città è caratterizzata da un CAP e un nome.

I musei presenti sul territorio hanno un nome, una collezione di opere d’arte (al massimo 1000) e un intero che rappresenta il numero di visitatori in un anno.

Le opere d’arte sono caratterizzate da un nome, dal nome dell’artista, dall’anno in cui sono state create e da un valore di mercato (espresso in euro).

È possibile aggiungere una nuova città al sistema utilizzando il metodo **addCitta()** della classe MMS. Tale metodo riceve come parametro un oggetto di classe Citta e restituisce un boolean: true nel caso in cui l’inserimento è andato a buon fine, false altrimenti. Un inserimento può fallire se si è raggiunto il numero massimo di città.

È possibile ottenere il riferimento ad una città utilizzando il metodo **getCitta()** della classe MMS. Tale metodo riceve come parametro una stringa rappresentante il CAP della città che si vuole ottenere e restituisce un riferimento alla città se è presente nel sistema, altrimenti restituisce il valore speciale null.

È possibile aggiungere un museo ad una città utilizzando il metodo **addMuseo()** della classe Citta. Tale metodo riceve come parametro un oggetto di classe Museo e restituisce un boolean: true nel caso in cui l’inserimento è andato a buon fine, false altrimenti. Un inserimento può fallire se si è raggiunto il numero massimo di musei.

È possibile ottenere il riferimento ad un museo utilizzando il metodo **getMuseo()** della classe Citta. Tale metodo riceve come parametro una stringa rappresentante il nome del museo che si vuole ottenere e restituisce un riferimento al museo se è presente un museo con quel nome, altrimenti restituisce il valore speciale null.

È possibile aggiungere un’opera d’arte ad un museo tramite il metodo **addOpera()** della classe Museo. Tale metodo riceve come parametro un oggetto di classe Opera e restituisce un boolean: true nel caso in cui l’inserimento è andato a buon fine, false altrimenti. Un inserimento può fallire se si è raggiunto il numero massimo di opere.

La classe Museo espone il metodo **getOpere()** che restituisce una stringa contenente tutte le Opere. La stringa inizia e termina con il carattere “ (virgolette). Ogni opera è rappresentata come una stringa formata da _nomeArtista-nomeOpera-anno_ (es. _Edvard Munch-L’urlo-1910_) ed è separata dalle altre opere tramite il carattere “;”.

È possibile ricercare tutte le opere di un artista tramite il metodo **getOpere()** della classe  MMS. Il metodo riceve come parametro il nome di un artista e ricerca in tutti i musei di tutte le città le opere dell’artista passato come parametro. Tale metodo ritorna una stringa così formata:

_nomeCitta - nomeMuseo_

 - elencoOpere

----------------------------------------------------

esempio: _getOpere(“Michelangelo”)_

Brindisi – La vela
- Schiavo che si ridesta
- Madonna Medici

Brindisi – Il veliero
- Notte
- Giorno

Bari – Il polpo
- Lia
- Rachele
- Epifania
-----------------------------------------------------

Se in nessun museo di tutte le città non esistono opere dell’artista passato come parametro, viene restituita la stringa “Nessuna opera trovata”. 

Ulteriori richieste:
Il CAP delle città inserite nel sistema deve essere univoco. Il metodo **addCitta()** restituisce false anche nel caso si prova ad inserire una città con un CAP già inserito e l’inserimento non deve avvenire.

La classe Citta espone anche il metodo **getMusei()** che restituisce una stringa contenente i nomi di tutti i musei presenti in quella città. I nomi dei musei sono separati dal carattere “+”.

Nel main le informazioni per popolare il sistema sono lette da un file di testo dove ogni riga contiene opportuni comandi.

Ogni comando può permettere l’inserimento di una città, un museo o un’opera.

I comandi per inserire una città iniziano con la lettera "C" seguita da CAP, nome.

I comandi per inserire un museo iniziano con la lettera "M" seguita dal nome e dal numero di visitatori.

I comandi per inserire un’opera iniziano con la lettera "O" seguita dal nome dell’opera, dal nome dell’artista, dall’anno e dal valore di mercato.

Gli elementi di ciascun comando sono separati gli uni dagli altri tramite il carattere ";".

ESEMPIO DI COMANDI

C;72100;Brindisi
M;La vela;12000
O;Il pappagallo;Coco Rita;1982;125000
O;La Gioconda;Da Vinci;1505;500000
O;David;Michelangelo;1503;10
M;Il marinaio;112358
O;Il sorriso;Clown;1814;132134
C;70100;Bari
M;Il polpo;11450
O;La sedia;Nato Stanco;2023;1500
O;La bandiera;Asta;1231;350

I comandi relativi alle opere d’arte sono sempre preceduti da un comando relativo al museo di appartenenza. I comandi che identificano un museo sono sempre preceduti dal comando relativo alla città di appartenenza (le opere “Il pappagallo”, “La Gioconda” e “David” sono conservati nel museo La vela della città di Brindisi; l’opera “Il sorriso”, è conservata nel museo Il marinaio della città di Brindisi).

Nel caso in cui viene all'interno del file è presente un comando non valido o scritto nel formato sbagliato il sistema lo ignora e continua a leggere ed eseguire i comandi successivi.

La fase di interrogazione della base di dati tramite i metodi getOpere (classe Museo) e getOpere (classe MMS) avviene nel main tramite opportuni comandi da te definiti.