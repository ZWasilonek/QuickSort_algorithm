# QuickSort_algorithm

Jest to program napisany w języku Java, który za pivot przyjmuje zawsze ostatni element w tablicy pobranych od użytkownika liczb.
Algorytm QuickSort jest procedurą rekurencyjną i opiera się na podejściu dziel i zwyciężaj, w którym tablica jest dzielona na podtablice poprzez wybranie elementu przestawnego. Podczas dzielenia tablicy element pivot (inczej zwany też cementem – element, od którego rozpoczyna się porównanie liczb) należy ustawić w taki sposób, aby elementy mniejsze niż pivot były po lewej stronie, a elementy większe niż pivot po prawej. 
Ten sam proces jest kontynuowany zarówno dla lewej, jak i prawej podtablicy. Na koniec posortowane elementy są łączone w posortowaną tablicę. 
W moim algorytmie element pivot to zawsze ostatni element w tablicy, a więc pierwszy element wprowadzony do konsoli przez użytkownika. 
 
Złożoność szybkiego sortowania 
  Złożoność czasu 	  
  - Najgorszy 	O(n 2 ) 
  - Najlepszy 	O(n*log n) 
  - Przeciętny 	O(n*log n) 
  
  Złożoność przestrzeni 	O(log n) 
  
  Stabilność 	Nie 
 
1. Złożoność czasowa 
Złożoność najgorszego przypadku [Big-O] : O(n2) występuje, gdy wybrany element obrotu jest albo największym, albo najmniejszym elementem. Ten stan prowadzi do przypadku, w którym element obrotowy znajduje się na skrajnym końcu posortowanej tablicy. Jedna podtablica jest zawsze pusta, a inna podtablica zawiera elementy. W związku z tym funkcja quicksort jest wywoływana tylko w tej podtablicy. Jednak algorytm szybkiego sortowania ma lepszą wydajność w przypadku rozproszonych przegubów. 
Średnia złożoność przypadku [Big-theta] : O(n*log n) występuje, gdy powyższe warunki nie występują, czyli np. gdy elementy tablicy są w pomieszanej kolejności, która nie jest prawidłowo rosnąca i nieprawidłowa malejąca. 
Złożoność najlepszego przypadku [Big-omega] : O(n*log n) występuje, gdy element obrotowy jest zawsze elementem środkowym lub blisko elementu środkowego. 
 
2. Złożoność przestrzeni 
Złożoność przestrzeni dla quicksort to O(log n). 


Instrukcja uruchamiania programu:
Program można uruchomić za pośrednictwem IDE (Integrated Development Environment), czyli zintegrowanego środowiska programistycznego (np. Intellij IDEA) lub w CLI (Command Line Interface), czyli w wierszu poleceń / terminalu.  
