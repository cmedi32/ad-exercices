**ex 01 Aufgaben linked list: (gem. UML input D12)**

**Lernziele:**

- Implementation einer einfach verketteten Liste.
- Funktionsweise der typischen Operationen auf einer Liste verstehen.
- Systematische, schrittweise Implementation und Testen von Code

**Tasks**

- a) Implementation und Testing Node.
- b) max 1 Element, size().
- c) erweiterung dynamisches vergrössern.
- d) implementation contains() **(Dazu müssen Sie bereits intern über die Liste iterieren können.)**.
- e) First Out pop (welche Datenstruktur repräsentiert das).
- f) contains() ? remove - repoint elements.

**Resultat:** ein Stack mit unterliegender Linked List

**ex 02 Aufgaben stack - array**

**Lernziele:**

- Verständnis der Funktionsweise eines Stacks.
- Implementation als statische Datenstruktur.
- Schrittweise Entwicklung und kontinuierliches Testen.

**Tasks**

- a) UML-Klassendiagramms - Schnittstellenvisualisierung - Struktur Constraints
- b) Implementation Schnittstelle und Bare-Bone Klasse zur implementation
- c) TDD - implementation des Contracts
- d) implementation gem. TDD Spezifikation
- f) edge case pop und push - Dokumentation und Learnings

**Implementation mit Array:**

- Man merkt sich jeweils den Index des letzten Elementes.
- Array ist statisch, Grösse somit beschränkt.
- Maximaler Platz ist immer belegt, weil bereits reserviert.
- Dadurch ist ein maximal schnelles Einfügen möglich!

**ex 03 Stackmaschine**

**Lernziele:**

- Anwendung eines Stacks

**Zustandsanalyse eines Stacks**

LOAD 2:

| 2 |
|---|

LOAD 3:

| 3 |
|---|
| 2 |

ADD:

| 5 |
|---|

LOAD 4:

| 4 |
|---|
| 5 |

MUL:

| 20 |
|----|

PRINT:

| - |
|---|

**Stackprogramm für die Aussage (4+5) * (2+3)**

LOAD 4 -
LOAD 5 -
**ADD** -
LOAD 2 -
LOAD 3 -
**ADD** -
MUL -
**PRINT**

**Erweiterung der Maschine mit Subtraktion und Division**

2 Komponenten SUB und DIV. Wichtig hier:
**Reihenfolge relevant in welcher auf den Stack gelegt wird (nicht kommuntativ)**