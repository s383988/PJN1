# PJN1
Misja 1: Aplikacja do odmieniania nazwisk przez przypadki.

Aplikacja została napisana w JavaFX, służy do automatycznej odmiany polskich nazwisk przez przypadki.

Korzystanie z aplikacji:
Nazwisko należy wpisać w mianowniku rodzju męskiego, np. Kowalski. Następnie zaznaczyć dla kogo ma zostać odmienione:
kobiety, mężczyzny lub liczby mnogiej i wcisnąć przycisk OK.
Mimo dołożonych starań aplikacja może zwracać błędne wyniki.

Działanie:
Program szuka w dołączonym pliku CSV 'odmiana' pierwszego wzorca do którego można dopasować nazwisko. 
Każdy wiersz w pliku składa się z następujących danych podanych po przecinku: 
  - M lub K lub P - oznaczenie mężczyzna, kobieta, państwo (liczba mnoga);
  - ^regexp$ - wzór nazwiska;
  - odmiana końcówek dla 7 przypadków.
Dane z pasującego wiersza zostają zapisane do tablicy. Następnie zostaje wyznaczony niezmienny temat nazwiska.
Potem temat jest łączony dla wszystkich przypadków z pobranymi wcześniej końcówkami.

Testy:
Ze zbioru 399 529 nazwisk polskich wylosowano 10 przypadkowych nazwisk. 
Została przeprowadzona ręczna odmiana nazwisk w testach a następnie porównanie czy program odmienia poprawnie. 
Porównane zostały dwa sposoby:
1. Metoda odmiany z końcówkami wyrazów z pliku.
2. Porównanie tylko z tematem.

Rezultat:
1) 30/30 testów przy 10 nazwiskach
2) 6/30 testów (przeszły odmiany nazwisk kobiet niezakończone na a)
