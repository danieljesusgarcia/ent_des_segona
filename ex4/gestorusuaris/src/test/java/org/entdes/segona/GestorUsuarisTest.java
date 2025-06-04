package org.entdes.segona;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorUsuarisTest {
    
    GestorUsuaris gestorUsuaris;
    @BeforeEach
    public void setUp() {
        gestorUsuaris = new GestorUsuaris();
    }
    
    @Test
    public void testMidaLlista() {
        String data[][] = {{"Joan", "30","180"}, {"Maria", "18","170"}, {"Pere", "25","175"}};
        gestorUsuaris.afegirUsuaris(data);
        assertEquals(3, gestorUsuaris.usuaris.size());
    }

    @Test
    public void testDadesLlista() {
        String data[][] = {{"Joan", "30","180"}, {"Maria", "18","170"}, {"Pere", "25","175"}};
        gestorUsuaris.afegirUsuaris(data);
        assertEquals(30, gestorUsuaris.usuaris.get(0).edat);
        assertEquals("Joan", gestorUsuaris.usuaris.get(0).nom);
        assertEquals(18,gestorUsuaris.usuaris.get(1).edat);
        assertEquals("Maria", gestorUsuaris.usuaris.get(1).nom);
        assertEquals(25, gestorUsuaris.usuaris.get(2).edat);
        assertEquals("Pere", gestorUsuaris.usuaris.get(2).nom);
    }

    @Test
    public void testLlistaBuida() {
        String data[][] = {{"Joan", "0"}, {"Maria", "0"}, {"Pere", "0"}};
        gestorUsuaris.afegirUsuaris(data);
        assertEquals(0, gestorUsuaris.usuaris.size());
    }

    @Test
    public void testDadesBuides() {
        String data[][] = {};
        gestorUsuaris.afegirUsuaris(data);
        assertEquals(0, gestorUsuaris.usuaris.size());
    }
}
