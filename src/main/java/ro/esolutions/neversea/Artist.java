package ro.esolutions.neversea;

import java.util.Objects;

public class Artist {
    String nume;
    String ora;
    String scena;
    String genMuzical;

    public Artist(){

    }


    public Artist(String nume, String ora, String scena, String genMuzical) {
        this.nume = nume;
        this.ora = ora;
        this.scena = scena;
        this.genMuzical = genMuzical;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return nume.equals(artist.nume) &&
                genMuzical.equals(artist.genMuzical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, genMuzical);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(final String nume) {
        this.nume = nume;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(final String ora) {
        this.ora = ora;
    }

    public String getScena() {
        return scena;
    }

    public void setScena(final String scena) {
        this.scena = scena;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(final String genMuzical) {
        this.genMuzical = genMuzical;
    }
}
