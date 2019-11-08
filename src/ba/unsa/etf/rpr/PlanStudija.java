package ba.unsa.etf.rpr;

public class PlanStudija {
    int semestar;
    Predmet[] obavezniPredmeti;
    Predmet[] izborniPredmeti;
    int brojPredmeta;
    int ECTS;

    public PlanStudija(int semestar, int brojPredmeta, int ECTS) {
        this.semestar = semestar;
        this.brojPredmeta = brojPredmeta;
        this.ECTS = ECTS;
    }

    public int getSemestar() {
        return semestar;
    }

    public Predmet[] getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public Predmet[] getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public int getBrojPredmeta() {
        return brojPredmeta;
    }

    public int getECTS() {
        return ECTS;
    }
    void dodajObavezniPredmet(){}
    void dodajIzborniPredmet(){}

}
