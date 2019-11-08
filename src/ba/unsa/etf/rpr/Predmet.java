package ba.unsa.etf.rpr;

import java.util.List;

public class Predmet {
    String naziv;
    int ECTS;
    List<Student> listaStudenata;

    public Predmet(String naziv, int ECTS) {
        this.naziv = naziv;
        this.ECTS = ECTS;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getECTS() {
        return ECTS;
    }

    public List<Student> getListaStudenata() {
        return listaStudenata;
    }

    void dodajStudenta(Student student) {}

}
