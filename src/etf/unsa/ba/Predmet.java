package etf.unsa.ba;

public class Predmet {
    private int trenutniBrojstudenata = 0;
    private Student[] nizStudenata;
    private String nazivPredmeta;
    private int sifraPredmeta;
    private int maxBrojStudenata;

    public Predmet(String nazivPredmeta, int sifraPredmeta, int maxBrojStudenata) {
        this.nizStudenata = new Student[maxBrojStudenata];
        this.nazivPredmeta = new String(nazivPredmeta);
        this.sifraPredmeta = sifraPredmeta;
        this.maxBrojStudenata = maxBrojStudenata;
    }

    public void upisi(Student student) {
        if (trenutniBrojstudenata <= maxBrojStudenata) { //ako ima mjesta upisat cemo studenta;
            nizStudenata[trenutniBrojstudenata] = new Student(student.getImeStudenta(), student.getPrezimeStudenta(), student.getBrojIndexa());
            trenutniBrojstudenata++;
        } else { // ako nema mjesta ispisujemo poruku da je nemoguce upisati studenta;
            System.out.println("Maksimalan broj studenata je upisan na predmet, nemoguce je upisati Studenta !!!");
        }
    }

    public void ispisi(Student student) {
        int pomocna = trenutniBrojstudenata;
        for (int i = 0; i < trenutniBrojstudenata; i++) { //trazimo da li je student uopste upisan;
            if (nizStudenata[i].getBrojIndexa() == student.getBrojIndexa()) { // nasli smo da je ovaj student zaista prethodno upisan na predmet.
                for (int j = i; j < trenutniBrojstudenata - 1; j++) { //pomjeramo niz studenata od mjesta na kojem izbacujemo(ispisujemo)datog studenta.
                    nizStudenata[j] = nizStudenata[j + 1];
                }
                trenutniBrojstudenata--;
            }
        }
        if (pomocna == trenutniBrojstudenata) {
            System.out.println("Ovaj student uopste nije niti upisan.");
        }
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }

    public int getMaxBrojStudenata() {
        return maxBrojStudenata;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public void ispisSpiskaStudenata() {
        for (int i = 0; i < trenutniBrojstudenata; i++) {
            System.out.print(i + 1 + ". ");
            nizStudenata[i].ispisStudenta();
        }
    }
}
