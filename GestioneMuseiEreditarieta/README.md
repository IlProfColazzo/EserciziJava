La regione Puglia vi chiede la fornitura di un software che permetta la gestione di tutti i musei presenti sul territorio regionale.

L’interazione con il sistema avviene attraverso la classe MMS (Museum Management System).

I musei sono dislocati in diverse città. Ogni città è caratterizzata da un CAP e un nome.

I musei presenti sul territorio hanno un nome, una collezione di opere d’arte e un intero che rappresenta il numero di visitatori in un anno.

Le opere d’arte sono caratterizzate da un nome, dal nome dell’artista, dall’anno in cui sono state create e da un valore di mercato (espresso in euro).

Le opere d’arte contenute in un museo possono essere quadri o statue.

I quadri sono caratterizzati dal tipo di pittura (tempera, olio, acrilici, pastello, etc…) e dalle dimensione della tela (base e altezza). 

Le statue sono caratterizzate dal materiale (oro, bronzo, gesso, argento, etc…) e dal peso espresso in Kg.

**Attenzione**: la classe Museo gestisce una sola collazione contenente tutte le opere d’arte indipendentemente dal tipo e non è possibile istanzione opere d'arte generiche.

È possibile aggiungere una nuova città al sistema utilizzando il metodo **addCitta()** della classe MMS. Tale metodo riceve come parametro un oggetto di classe Citta e restituisce un boolean: true nel caso in cui l’inserimento è andato a buon fine, false altrimenti. Un inserimento può fallire se si prova ad aggiungere una città con un CAP già inserito.

È possibile ottenere il riferimento ad una città utilizzando il metodo **getCitta()** della classe MMS. Tale metodo riceve come parametro una stringa rappresentante il CAP della città che si vuole ottenere e restituisce un riferimento alla città se è presente nel sistema, altrimenti restituisce il valore speciale _null_.

È possibile aggiungere un museo ad una città utilizzando il metodo **addMuseo()** della classe Citta. Tale metodo riceve come parametro un oggetto di classe Museo e restituisce il valore _true_.

È possibile ottenere il riferimento ad un museo utilizzando il metodo **getMuseo()** della classe Citta. Tale metodo riceve come parametro una stringa rappresentante il nome del museo che si vuole ottenere e restituisce un riferimento al museo se è presente un museo con quel nome, altrimenti restituisce il valore speciale _null_.

È possibile aggiungere un quadro ad un museo tramite il metodo **addQuadro()** della classe Museo. Tale metodo riceve come parametro un oggetto di classe Quadro e restituisce il valore _true_.

È possibile aggiungere una Statua ad un museo tramite il metodo **addStatua()** della classe Museo. Tale metodo riceve come parametro un oggetto di classe Statua e restituisce il valore _true_.

La classe Museo espone il metodo **getOpere()** che restituisce una stringa contenente tutte le Opere. La stringa inizia e termina con il carattere “ (virgolette). Ogni opera è rappresentata come una stringa formata da _nomeArtista-nomeOpera-anno_ (es. _Edvard Munch-L’urlo-1910_) ed è separata dalle altre opere tramite il carattere “;”.

La classe Citta espone anche il metodo **getMusei()** che restituisce una stringa contenente i nomi di tutti i musei presenti in quella città. I nomi dei musei sono separati dal carattere “+”.

La classe Museo espone:
- il metodo **getOpere()**: restituisce una Collection di tutte le Opere;
- il metodo **getQuadri()**: restituisce una Collection di tutti i quadri;
- il metodo **getSculture()**: restituisce una Collection di tutte le sculture.

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

Nel main le informazioni per popolare il sistema sono lette da un file di testo dove ogni riga contiene opportuni comandi.

Ogni comando può permettere l’inserimento di una città, un museo o un’opera.

I comandi per inserire una città iniziano con la lettera "C" seguita da CAP, nome.

I comandi per inserire un museo iniziano con la lettera "M" seguita dal nome e dal numero di visitatori.

I comandi per inserire un’opera iniziano con la lettera "S" per le sculture o con la lettera “Q” per i quadri seguita dal nome dell’opera, dal nome dell’artista, dall’anno e dal valore di mercato,dal materiale e dal peso oppure dal tipo di pittura e dalle dimensioni.


Gli elementi di ciascun comando sono separati gli uni dagli altri tramite il carattere ";".

ESEMPIO DI COMANDI

C;72100;Brindisi

M;La vela;12000

S;Il pappagallo;Coco Rita;1982;125000;oro;0,12

Q;La Gioconda;Da Vinci;1505;500000;olio;77;53

S;David;Michelangelo;1503;10;gesso;1000

M;Il marinaio;112358

S;Il sorriso;Clown;1814;132134;gesso;753

C;70100;Bari

M;Il polpo;11450

S;La sedia;Nato Stanco;2023;1500;bronzo;2598

Q;La bandiera;Asta;1231;350;aquerello;50;25


I comandi relativi alle opere d’arte sono sempre preceduti da un comando relativo al museo di appartenenza. I comandi che identificano un museo sono sempre preceduti dal comando relativo alla città di appartenenza (le opere “Il pappagallo”, “La Gioconda” e “David” sono conservati nel museo La vela della città di Brindisi; l’opera “Il sorriso”, è conservata nel museo Il marinaio della città di Brindisi).

Nel caso in cui viene all'interno del file è presente un comando non valido o scritto nel formato sbagliato il sistema lo ignora e continua a leggere ed eseguire i comandi successivi.

La fase di interrogazione della base di dati tramite i metodi getOpere (classe Museo) e getOpere (classe MMS) avviene nel main tramite opportuni comandi da te definiti.