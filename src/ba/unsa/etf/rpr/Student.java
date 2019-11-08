package ba.unsa.etf.rpr;

public class Student {
    static String ime;
    static String prezime;
    static int brojIndexa;
    PlanStudija studij;
    Predmet[] predmetiKojeSlusa;

    public Student(String ime, String prezime, int brojIndexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndexa = brojIndexa;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public PlanStudija getStudij() {
        return studij;
    }

    public void setStudij(PlanStudija studij) {
        this.studij = studij;
    }

    public Predmet[] getPredmetiKojeSlusa() {
        return predmetiKojeSlusa;
    }

    public void dodajPredmet(){

    }
}
