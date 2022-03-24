# RecruitmentSuncode

Zadanie 1
Napisać aplikację webową, która będzie pobierała dane z zewnętrznej bazy
danych. Na pierwszej stronie użytkownik wybiera z rozwijalnej listy
nazwę kolumny z zewnętrznej bazy danych (lista może być na stałe zaszyta w
stronie). Po zaakceptowaniu wyboru przyciskiem należy wykonać zapytanie do bazy
danych. Powinno ono zwracać te krotki (z wszystkimi kolumnami), dla których
wartości w wybranej w formularzu kolumny powtarzają się (pkt.2) lub są unikalne
(pkt.3). Poszczególne krotki powinny w wynikach występować tylko raz. Po
otrzymaniu wyniku dane należy przedstawić na kolejnej (lub na tej samej np. w
technologii AJAX bez przeładowania strony) stronie w postaci tabeli.
Ponieważ zadanie jest dość rozbudowane i dotyka różnych technologii można je
podzielić na kilka etapów ocenianych odrębnie:

1. Stworzenie strony www umożliwiającej wybór z Combobox&#39;a kolumny i przekazanie
zapytania na stronę serwera (który ma dostęp do bazy danych)

2. Stworzenie zapytania SQL, do bazy danych (najlepiej postgreSQL) zwracającego
powtarzające się krotki dla wskazanej kolumny (tzn. takie dla których wybrana
kolumna ma kilka takich samych wartości).

Przykład:

Dla załączonej bazy danych i dla podanej kolumny: kolumna1
Pożądany wynik zapytania:

4;&quot;wartość54&quot;;&quot;wartość43&quot;;&quot;wartość45&quot;;4

5;&quot;wartość43&quot;;&quot;wartość23&quot;;&quot;wartość34&quot;;4

6;&quot;wartość43&quot;;&quot;wartość54&quot;;&quot;wartość43&quot;;2

7;&quot;wartość54&quot;;&quot;wartość52&quot;;&quot;wartość53&quot;;8

9;&quot;wartość43&quot;;&quot;wartość33&quot;;&quot;wartość45&quot;;9


3. Stworzenie zapytania SQL, do bazy danych (najlepiej postgreSQL) zwracającego
unikalne wiersze
Przykład:
Dla załączonej bazy danych i dla podanej kolumny: kolumna1
Pożądany wynik zapytania:

1;&quot;wartość1&quot;;&quot;wartość2&quot;;&quot;wartość3&quot;;1

2;&quot;warość21&quot;;&quot;wartość22&quot;;&quot;wartość23&quot;;5

3;&quot;wartość31&quot;;&quot;wartość22&quot;;&quot;wartość32&quot;;6

8;&quot;wartość21&quot;;&quot;wartość2211&quot;;&quot;wartość43&quot;;4

10;&quot;wartość87&quot;;&quot;wartość62&quot;;&quot;wartość11&quot;;3

4. Wyświetlenie rezultatów zapytania na stronie WWW

5. Wyświetlenie rezultatów ze strony bez przeładowania strony (np. technologia
AJAX)
