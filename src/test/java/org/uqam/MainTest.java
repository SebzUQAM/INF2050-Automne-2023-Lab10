package org.uqam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void calculerTaxes01() {
        long result = Main.calculerTaxes(100000, false, false);
        assertEquals(100000, result);
    }

    @Test
    void calculerTaxes02() {
        long result = Main.calculerTaxes(100000, true, false);
        assertEquals(105000, result);
    }

    @Test
    void calculerTaxes03() {
        long result = Main.calculerTaxes(100000, false, true);
        assertEquals(109975, result);
    }

    @Test
    void calculerTaxes04() {
        long result = Main.calculerTaxes(100000, true, true);
        assertEquals(114975, result);
    }

    @Test
    void calculerTaxes05() {
        long result = Main.calculerTaxes(1321310, true, true);
        assertEquals(1519176, result);
    }

    @Test
    void calculerTaxes06() {
        long result = Main.calculerTaxes(1321306, true, true);
        assertEquals(1519172, result);
    }

    @Test
    void calculerTaxes07() {
        long result = Main.calculerTaxes(1321306, false, true);
        assertEquals(1453106, result);
    }

    @Test
    void calculerTaxes08() {
        long result = Main.calculerTaxes(1321309, false, true);
        assertEquals(1453110, result);
    }

    @Test
    void calculerTaxes09() {
        long result = Main.calculerTaxes(1321309, true, false);
        assertEquals(1387374, result);
    }

    @Test
    void calculerTaxes10() {
        long result = Main.calculerTaxes(1321310, true, false);
        assertEquals(1387376, result);
    }

    @Test
    void calculerTaxes11() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            long result = Main.calculerTaxes(0, true, true);
        });
        assertEquals("Le montantEnSous ne peut pas être 0 ou inférieur.", thrown.getMessage());
    }

    @Test
    void calculerTaxes12() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            long result = Main.calculerTaxes(-10, true, true);
        });
        assertEquals("Le montantEnSous ne peut pas être 0 ou inférieur.", thrown.getMessage());
    }

    @Test
    void calculerTaxes13() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            long result = Main.calculerTaxes(0, false, false);
        });
        assertEquals("Le montantEnSous ne peut pas être 0 ou inférieur.", thrown.getMessage());
    }

    @Test
    void calculerTaxes14() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            long result = Main.calculerTaxes(-10, false, false);

        });
        assertEquals("Le montantEnSous ne peut pas être 0 ou inférieur.", thrown.getMessage());
    }

    @Test
    void calculerTaxes15() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            long result = Main.calculerTaxes(0, true, false);
        });
        assertEquals("Le montantEnSous ne peut pas être 0 ou inférieur.", thrown.getMessage());
    }

    @Test
    void calculerTaxes16() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            long result = Main.calculerTaxes(-10, true, false);

        });
        assertEquals("Le montantEnSous ne peut pas être 0 ou inférieur.", thrown.getMessage());
    }

    @Test
    void calculerTaxes17() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            long result = Main.calculerTaxes(0, false, true);
        });
        assertEquals("Le montantEnSous ne peut pas être 0 ou inférieur.", thrown.getMessage());
    }

    @Test
    void calculerTaxes18() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            long result = Main.calculerTaxes(-10, false, true);

        });
        assertEquals("Le montantEnSous ne peut pas être 0 ou inférieur.", thrown.getMessage());
    }
}