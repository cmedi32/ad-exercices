package ch.hslu.ad.exercises.sw02.ex02;

/**
 * Schnittstelle für einen Stack mit String-Elementen.
 */
public interface Stack {

    /**
     * Legt ein Element oben auf den Stack.
     *
     * @param item das einzufügende Element.
     * @throws IllegalStateException wenn der Stack voll ist.
     */
    void push(String item);

    /**
     * Entfernt das oberste Element vom Stack und gibt es zurück.
     *
     * @return das oberste Element.
     * @throws IllegalStateException wenn der Stack leer ist. (Alternativ - Nullpointer liefern - Array nicht anpassen)
     */
    String pop();

    /**
     * Prüft, ob der Stack leer ist.
     *
     * @return {@code true} wenn der Stack keine Elemente enthält.
     */
    boolean isEmpty();

    /**
     * Prüft, ob der Stack voll ist.
     *
     * @return {@code true} wenn der Stack seine maximale Kapazität erreicht hat.
     */
    boolean isFull();
}
