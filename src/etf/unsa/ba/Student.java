package etf.unsa.ba;

public class Student {
    private String imeStudenta;
    private String prezimeStudenta;
    private int brojIndexa;

    public Student(String imeStudenta,String prezimeStudenta,int brojIndexa){
        this.imeStudenta=imeStudenta; this.prezimeStudenta=prezimeStudenta; this.brojIndexa=brojIndexa;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public void setPrezimeStudenta(String prezimeStudenta) {
        this.prezimeStudenta = prezimeStudenta;
    }

   public void ispisStudenta(){
System.out.println(prezimeStudenta+" "+imeStudenta+" ("+brojIndexa+")");
   }
}
