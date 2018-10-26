package etf.unsa.ba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getBrojIndexa() {
        Student nikoNikic=new Student("Niko","Nikic",17998);
        assertEquals(nikoNikic.getBrojIndexa(),17998);
    }

    @Test
    void getImeStudenta() {
        Student nikoNikic=new Student("Niko","Nikic",17998);
        assertEquals(nikoNikic.getImeStudenta(),"Niko");
    }

    @Test
    void getPrezimeStudenta() {
        Student nikoNikic=new Student("Niko","Nikic",17998);
        assertEquals(nikoNikic.getPrezimeStudenta(),"Nikic");
    }

    @Test
    void setBrojIndexa() {
        Student nikoNikic=new Student("Niko","Nikic",17998);
        nikoNikic.setBrojIndexa(17999);
        assertEquals(nikoNikic.getBrojIndexa(),17999);
    }

    @Test
    void setImeStudenta() {
        Student nikoNikic=new Student("Niko","Nikic",17998);
        nikoNikic.setImeStudenta("Nikolica");
        assertEquals(nikoNikic.getImeStudenta(),"Nikolica");
    }

    @Test
    void setPrezimeStudenta() {
        Student nikoNikic=new Student("Niko","Nikic",17998);
        nikoNikic.setPrezimeStudenta("Prikolica");
        assertEquals(nikoNikic.getPrezimeStudenta(),"Prikolica");
    }


}