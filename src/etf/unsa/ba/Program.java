package etf.unsa.ba;

public class Program {

    public static void main(String[] args) {
        Predmet IM2 = new Predmet("Inzenjerska matematika 2", 6969, 500);
        Student matejPlakalovic = new Student("Matej", "Plakalovic", 17808);
        IM2.upisi(matejPlakalovic);
        matejPlakalovic.ispisStudenta();
//IM2.ispisi(matejPlakalovic);
        IM2.ispisSpiskaStudenata();
//Student anjaPlakalovic=new Student("Anja","Plakalovic",17810);
//IM2.upisi(anjaPlakalovic);
//IM2.ispisSpiskaStudenata();
    }
}
