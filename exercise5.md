###Warum werden Logging Bibliotheken verwendet?
Sie werden verwendet um Fehlerzustände nachvollziehen zu können und diese Aufzeichnen zu können.

###Welche Loglevel gibt es in Log4J und was hat es damit aufsich?
 - ALL
Alle Meldungen werden ungefiltert ausgegeben
 - TRACE
ausführlicheres Debugging (ab Version 1.2.12[8]), Kommentare
 - DEBUG
allgemeines Debugging (Auffinden von Fehlern)
 - INFO
allgemeine Informationen (Programm gestartet, Programm beendet, Verbindung zu Host Foo aufgebaut, Verarbeitung dauerte SoUndSoviel Sekunden …)
 - WARN
Auftreten einer unerwarteten Situation
 - ERROR
Fehler (Ausnahme wurde abgefangen. Bearbeitung wurde alternativ fortgesetzt)
 - FATAL
Kritischer Fehler, Programmabbruch
 - OFF
Logging ist deaktiviert

Quelle: https://de.wikipedia.org/wiki/Log4j

###Was für Konfigurationsmöglichkeiten bietet Ihnen log4J?


####ReadMe
[ReadMe](README.md)