# WinGraphTextApp - Praca z oknami, grafiką i tekstem

## Opis projektu
Celem niniejszego zadania było stworzenie wielofunkcyjnej aplikacji mobilnej w systemie Android, prezentującej zaawansowaną obsługę wielu aktywności, elementów graficznych oraz interaktywnych komponentów interfejsu użytkownika. Aplikacja demonstruje płynną nawigację, personalizację treści oraz integrację z zasobami zewnętrznymi i systemowymi.

W stworzonej aplikacji zastosowano strukturę opartą na układach `LinearLayout` oraz `FrameLayout`, co pozwoliło na precyzyjne rozmieszczenie elementów takich jak pola edycyjne, grafiki oraz przyciski. Interfejs został zaprojektowany z dbałością o estetykę i ergonomię, z autorską stylizacją przycisków opartą na komponentach tekstowych, co nadało projektowi unikalny charakter.

## Kluczowe Funkcjonalności
Aplikacja składa się z czterech głównych modułów (aktywności):

1.  **Ekran Główny (Personalizacja)**: Umożliwia użytkownikowi wprowadzenie imienia za pomocą komponentu `EditText`. Dane te są dynamicznie przekazywane do kolejnych okien za pomocą mechanizmu `Intent extras`, co pozwala na personalizację powitań.
2.  **Ekran Szczegółów**: Prezentuje zaawansowaną obsługę tekstu i grafiki (`ImageView`). Zawiera inteligentny system powitań oraz dwa dedykowane przyciski nawigacyjne do modułów rozszerzonych.
3.  **Podgląd Web (WebView)**: Wykorzystuje komponent `WebView` do osadzenia strony GitHub bezpośrednio wewnątrz aplikacji. Moduł ten obsługuje skrypty JavaScript oraz posiada własny system nawigacji wstecznej.
4.  **Interaktywny Kalendarz**: Moduł wykorzystujący widżet `CalendarView`. Pozwala na przeglądanie dat oraz interakcję z użytkownikiem – po wyborze konkretnego dnia wyświetlana jest informacja o dacie za pomocą powiadomienia `Toast`.

## Obsługa techniczna i nawigacja
Logika aplikacji została w całości zaimplementowana w języku **Java**. Do najważniejszych aspektów technicznych należą:
*   **Intenty Wewnętrzne**: Wykorzystywane do płynnego przechodzenia między oknami aplikacji i przekazywania danych tekstowych.
*   **Wyzwania z multimediami (YouTube)**: Implementacja odtwarzacza wideo wymagała rozwiązania problemów z blokowaniem treści przez serwery zewnętrzne. Próby osadzenia wideo w `WebView` pokazały, że systemy zabezpieczeń wymagają emulacji pełnej przeglądarki (User-Agent). Ostatecznie, dla zapewnienia 100% stabilności, zastosowano `Intent` zewnętrzny otwierający tutorial w dedykowanej aplikacji YouTube.
*   **Uprawnienia**: Konfiguracja pliku `AndroidManifest.xml` pod kątem dostępu do Internetu oraz rejestracji wszystkich aktywności.
*   **Responsywność**: Zastosowanie odpowiednich marginesów (`padding`, `layout_margin`) oraz wag układu, co zapewnia poprawne wyświetlanie na różnych wielkościach ekranów, chroniąc elementy przed nakładaniem się na pasek systemowy.

Dzięki zastosowaniu tych rozwiązań, aplikacja stanowi kompletny przykład nowoczesnego podejścia do budowy interfejsu mobilnego, łącząc standardowe wymagania projektowe z nadprogramowymi modułami multimedialnymi i narzędziowymi.
