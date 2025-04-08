Sviluppare un'applicazione che consenta di gestire le informazioni relative al funzionamento di un supermercato. 

# R1. Corsie e catalogo prodotti trattati

L'applicazione viene gestita mediante un'istanza della classe Supermercato. 

Il supermercato e' organizzato in corsie. Le corsie vengono aggiunte mediante il metodo aggiungiCorsia della classe Supermercato. Il metodo riceve come parametri il nome della corsia (univoco) e la capienza massima (in cm^3).

I prodotti trattati dal supermercato sono rappresentato dalla classe Prodotto. Tra i prodotti esistono quelli da frigo, rappresentati dalla classe ProdottoDaFrigo (che estende Prodotto).

Attraverso il metodo catalogaProdotto() della classe Supermercato e' possibile aggiungere un nuovo prodotto a quelli trattati dal supermercato. Il metodo riceve come parametri il codice prodotto (che identifica univocamente il prodotto stesso), il nome, il volume (in cm^3) ed un valore boolean che indica se si tratti di un prodotto da frigo (true) oppure no (false). Il metodo restituisce un oggetto della classe corrispondente (Prodotto o ProdottoDaFrigo). Nel caso in cui il prodotto sia gia' a catalogo viene restituito un riferimento all'istanza corrispondente.

La classe Prodotto dispone dei metodi getter per ottenere codice, nome e volume. Per ogni prodotto, mediante opportuni metodi getter e setter, è inoltre possibile ottenere/impostare il prezzo di listino e la percentuale di sconto (entrambi a zero, se non specificato diversamente). Il metodo isDaFrigo() restituisce invece un valore boolean true se il prodotto è da frigo, false altrimenti. Per i prodotti da frigo e' infine possibile ottenere/impostare la temperatura di conservazione.

Il metodo elencoProdotti() della classe Supermercato restituisce l'elenco dei prodotti trattati dal supermercato, ordinati per valori di prezzo di listino decrescenti.

E' possibile cercare un particolare prodotto tra quelli trattati mediante il metodo cercaProdotto(), che riceve come parametro il codice del prodotto e restituisce un riferimento all'oggetto Prodotto cercato. In caso di prodotto inesistente il metodo scatena una eccezione di tipo ProdottoInesistenteException.

# R2. Esposizione prodotti

Un prodotto viene esposto in una corsia mediante il metodo esponiProdotto() della classe Supermercato, che riceve come parametri il nome della corsia, il riferimento all'oggetto di tipo Prodotto da esporre e la relativa quantita', espressa come numero di pezzi (si noti che lo stesso prodotto puo' essere esposto anche in piu' di una corsia). Il metodo determina la quantita' di prodotto (eventualmente inferiore a quella specificata) che e' effettivamente possibile esporre in base allo spazio ancora disponibile nella corsia indicata.

Mediante il metodo calcolaPercentualeDiOccupazione() di Supermercato e' possibile ottenere la percentuale di occupazione attuale della corsia il cui nome e' passato come parametro.

Il metodo elencoCodiciProdottoPerCorsia() della stessa classe riceve come parametro il nome di una corsia e restituisce un elenco alfabetico dei codici relativi ai prodotti esposti in quella corsia.

E' possibile utilizzare il metodo quantitaProdottoEsposto() della classe Supermercato per ottenere la quantita' esposta per un particolare prodotto. Esistono due varianti del metodo. La prima variante riceve come parametri un riferimento al prodotto ed il nome di una corsia e restituisce la quantita' di prodotto esposto in quella corsia. La seconda variante riceve invece solamente il riferimento al prodotto e restituisce come quantita' esposta per quel prodotto la somma delle quantita' esposte nelle diverse corsie.

# R3. Acquisti e scontrini

I prodotti si considerano acquistati nel momento in cui vengono aggiunti ad uno scontrino. Gli scontrini, rappresentati dalla classe Scontrino, sono identificati da un codice progressivo assegnato all'apertura dello scontrino stesso (a partire da 1000).

Per aprire uno scontrino si usa il metodo apriScontrino() di Supermercato, che restituisce il codice dello scontrino creato.

I prodotti vengono aggiunti ad uno scontrino invocando il metodo acquistaProdotto() della stessa classe, che riceve come parametri il codice dello scontrino, il riferimento all'oggetto di tipo Prodotto da aggiungere, la corsia da cui prelevarlo e la quantita' (potra' essere prelevata dalla corsia una quantita' al piu' pari a quella disponibile). In caso di corsia inesistente il metodo scatenera' una eccezione di tipo CorsiaInesistenteException.

Mediante il metodo dettagliScontrino() e' possibile ottenere, per un determinato scontrino, le informazioni relative ai prodotti acquistati ed alle relative quantita'. Il metodo riceve come parametro il codice dello scontrino e restituisce una stringa che riporta, nella prima riga, il codice dello scontrino e, nelle righe successive il codice del prodotto e la relativa quantita' separati da uno spazio. Tutte le righe tranne l'ultima sono terminate da \n.

Il metodo chiudiScontrino() riceve come parametro il codice dello scontrino da chiudere e restituisce l'importo totale da pagare, calcolato in base alle diverse quantita' di prodotto acquistate ed applicando eventuali sconti ai prezzi di listino.

# R4. Caricamento da file

Il metodo leggiFile() della classe Supermercato permette di leggere da file le informazioni relative ai prodotti trattati ed alla relativa esposizione nelle corsie.

Il metodo riceve come parametro il percorso di un file testuale organizzato per righe, dove ogni riga puo' riportare le informazioni relative ad un prodotto (da frigo o non) o all'esposizione. Si assuma che le informazioni siano separate da un punto e virgola.

Le righe relative ad un prodotto non da frigo cominciano con la stringa PRODOTTO_NO_FRIGO, seguita da codice, nome, volume, prezzo e percentuale di sconto del prodotto. Le righe relative ad un prodotto da frigo cominciano invece con PRODOTTO_DA_FRIGO e, dopo le informazioni sopra indicate, riportano anche la temperatura di conservazione.

Infine, le righe relative all'esposizione di un prodotto cominciano con la stringa ESPOSIZI_PRODOTTO, seguita da codice prodotto, nome corsia e quantita' da esporre.

Si assuma che il file non contenga errori di formato e che quindi tutte le righe siano strutturate come sopra riportato. Si assuma tuttavia che nel file si possa fare riferimento a prodotti non (ancora) trattati e/o a corsie non (ancora) definite.