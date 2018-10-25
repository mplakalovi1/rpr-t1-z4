package etf.unsa.ba;

public class Predmet {
    private static int trenutniBrojstudenata=0;
    private Student[] nizStudenata;
    private String nazivPredmeta;
    private int sifraPredmeta;
    private int maxBrojStudenata;

    public Predmet(String nazivPredmeta,int sifraPredmeta,int maxBrojStudenata){
        this.nizStudenata=new Student[maxBrojStudenata];
        this.nazivPredmeta=new String(nazivPredmeta);
        this.sifraPredmeta=sifraPredmeta;
        this.maxBrojStudenata=maxBrojStudenata;
    }
    public void upisi(Student student){
nizStudenata[trenutniBrojstudenata]=new Student(student.getImeStudenta(),student.getPrezimeStudenta(),student.getBrojIndexa()); //vidjeti ovaj konstruktor studenta jos
trenutniBrojstudenata++;
    }
    public void ispisi(Student student){
for(int i=0;i<trenutniBrojstudenata;i++){
    if(nizStudenata[i].equals(student)){nizStudenata[i]=null;} //zatrazeno brisanje;
    trenutniBrojstudenata--;
}
    }

    public String getNazivPredmeta(){
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
        for (int i = 0; i<trenutniBrojstudenata; i++) {
            System.out.print(i+1+". ");
            nizStudenata[i].ispisStudenta();
        }
    }
}
