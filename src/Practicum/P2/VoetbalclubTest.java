package Practicum.P2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    private Voetbalclub v1 = new Voetbalclub();

    @Test
    void getName(){
        assertEquals("FC", v1.getName());
    }

    @Test
    void verwerkResultaat() {
        v1.verwerkResultaat('x');
        assertEquals(0,v1.aantalPunten());

    }

    @Test
    void aantalGespeeld() {
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        assertEquals(3, v1.aantalGespeeld());
    }

    @Test
    void aantalPunten() {
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        assertEquals(7, v1.aantalPunten());
    }

    @Test
    void testToString() {
        String verwacht = v1.getName()
                + v1.aantalGespeeld()
                + " "
                + v1.getAantalGewonnen()
                + " "
                + v1.getAantalGelijk()
                + " "
                + v1.getAantalVerloren()
                + " "
                + v1.aantalPunten()
                + " " ;
        assertEquals(verwacht, v1.toString());
    }

}