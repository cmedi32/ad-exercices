package ch.hslu.ad.exercises.sw00;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WagenTest {

    @Test
    void testEqualsContract() {
        EqualsVerifier.forClass(Wagen.class)
            .withIgnoredFields("nachfolger")
            .verify();
    }

    @Test
    void testOverloadedConstructor() {
        Wagen wagen3 = new Wagen("W003", 80);
        Wagen wagen2 = new Wagen("W002", 40, wagen3);
        Wagen wagen1 = new Wagen("W001", 60, wagen2);

        assertThat(wagen1.getNachfolger()).isEqualTo(wagen2);
        assertThat(wagen2.getNachfolger()).isEqualTo(wagen3);
        assertThat(wagen3.getNachfolger()).isNull();
    }

    @Test
    void testBerechneGesamtPlaetze() {
        Wagen wagen = new Wagen("W001", 60,
                new Wagen("W002", 40,
                        new Wagen("W003", 80)));

        int gesamtPlaetze = Wagen.berechneGesamtPlaetze(wagen);

        assertThat(gesamtPlaetze).isEqualTo(180);
    }
    
    @Test
    void testBerechneGesamtPlaetzeSingleWagen() {
        Wagen wagen = new Wagen("W001", 100);

        int gesamtPlaetze = Wagen.berechneGesamtPlaetze(wagen);

        assertThat(gesamtPlaetze).isEqualTo(100);
    }

    @Test
    void testBerechneGesamtPlaetzeEmpty() {
        int gesamtPlaetze = Wagen.berechneGesamtPlaetze(null);

        assertThat(gesamtPlaetze).isZero();
    }
}
