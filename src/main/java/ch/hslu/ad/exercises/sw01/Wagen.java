package ch.hslu.ad.exercises.sw01;

import java.util.Objects;

/**
 * Represents a railway car (Wagen) with a specific number of seats and an identifier.
 * Cars can be linked to form a train.
 */
public class Wagen {

    private final String id;
    private final int anzahlPlaetze;
    private Wagen nachfolger;

    /**
     * Constructs a new railway car.
     *
     * @param id            the unique identifier of the car.
     * @param anzahlPlaetze the number of seats in the car.
     */
    public Wagen(final String id, final int anzahlPlaetze) {
        this(id, anzahlPlaetze, null);
    }

    /**
     * Constructs a new railway car and links it to the next one.
     *
     * @param id            the unique identifier of the car.
     * @param anzahlPlaetze the number of seats in the car.
     * @param nachfolger    the next car in the train.
     */
    public Wagen(final String id, final int anzahlPlaetze, final Wagen nachfolger) {
        this.id = id;
        this.anzahlPlaetze = anzahlPlaetze;
        this.nachfolger = nachfolger;
    }


    /**
     * Gets the unique identifier of the car.
     *
     * @return the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the number of seats.
     *
     * @return the number of seats.
     */
    public int getAnzahlPlaetze() {
        return anzahlPlaetze;
    }

    /**
     * Gets the next car in the train.
     *
     * @return the next car, or null if it's the last one.
     */
    public Wagen getNachfolger() {
        return nachfolger;
    }

    /**
     * Sets the next car in the train.
     *
     * @param nachfolger the car to attach.
     */
    public void setNachfolger(final Wagen nachfolger) {
        this.nachfolger = nachfolger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wagen wagen = (Wagen) o;
        return Objects.equals(id, wagen.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Calculates the total number of seats in a train starting from the given car.
     *
     * @param startWagen the first car of the train.
     * @return the total number of seats.
     */
    public static int berechneGesamtPlaetze(Wagen startWagen) {
        int total = 0;
        Wagen current = startWagen;
        while (current != null) {
            total += current.getAnzahlPlaetze();
            current = current.getNachfolger();
        }
        return total;
    }
}
