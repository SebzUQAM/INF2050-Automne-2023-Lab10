package org.uqam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonnaieTest {
    Monnaie monnaie;

    @BeforeEach
    void setUp() {
        monnaie = new Monnaie(100);
    }

    @Test
    void additionner() {
        Monnaie newMonnaie = monnaie.additionner(new Monnaie(10));
        assertEquals(110, newMonnaie.getMontantEnSous());
    }

    @Test
    void calculerPourcentage() {
        Monnaie newMonnaie = monnaie.calculerPourcentage(0.15);
        assertEquals(15, newMonnaie.getMontantEnSous());
    }

    @Test
    void soustraire() {
        Monnaie newMonnaie = monnaie.soustraire(new Monnaie(10));
        assertEquals(90, newMonnaie.getMontantEnSous());
    }

    @Test
    void testToString() {
        Monnaie newMonnaie = monnaie.calculerPourcentage(0.155);
        assertEquals("0.16$", newMonnaie.toString());
    }
}