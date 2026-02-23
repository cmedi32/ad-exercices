package ch.hslu.ad.exercises.sw01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A small program to demonstrate the use of the Wagen class.
 */
public final class ZugSimulation {

    private static final Logger LOG = LoggerFactory.getLogger(ZugSimulation.class);

    private ZugSimulation() {
        // Private constructor for utility class
    }

    public static void main(final String[] args) {
        // Personenwagen erzeugen, mit unterschiedlichen Kapazitäten
        Wagen wagen = new Wagen("W001", 60,
                new Wagen("W002", 40,
                        new Wagen("W003", 80)));


        // Berechnung der Gesamtanzahl Plätze
        int gesamt = Wagen.berechneGesamtPlaetze(wagen);
        LOG.info("Gesamtanzahl Plätze: " + gesamt);
    }
}
