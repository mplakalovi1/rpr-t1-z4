package etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getNazivPredmeta() {
        Predmet Im2 = new Predmet("Inzenjerska matematika 2", 686769, 500);
        assertEquals(Im2.getNazivPredmeta(), "Inzenjerska matematika 2");
    }

    @Test
    void getSifraPredmeta() {
        Predmet Im2 = new Predmet("Inzenjerska matematika 2", 686769, 500);
        assertEquals(Im2.getSifraPredmeta(), 686769);
    }

    @Test
    void getMaxBrojStudenata() {
        Predmet Im2 = new Predmet("Inzenjerska matematika 2", 686769, 500);
        assertEquals(Im2.getMaxBrojStudenata(), 500);
    }
     @Test
    void testSettera(){
        Predmet neki=new Predmet ("Neki predmet na etfu",1000,200);
        neki.setNazivPredmeta("Teorija Signala (TS)");
        neki.setSifraPredmeta(2345);
        assertAll("testovi settera",
                () -> assertEquals(neki.getNazivPredmeta(),"Teorija Signala (TS)"),
                () ->  assertEquals(neki.getSifraPredmeta(),2345));

    }
}
