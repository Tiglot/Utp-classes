package semana2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Cancion implements Comparable<Cancion>{

    @Override
    public int compareTo(Cancion o) {
        return Comparator.comparing(Cancion::getName).thenComparing(Cancion::getArtista).thenComparing
                (Cancion::getDuracion).compare(this, o);
    }

    public enum Genero{ROCK, POP, URBANO, SALSA};

    private String name;
    private String artista;
    private int duracion;
    private Genero genero;
    private LocalDate lazamiento;

    public Cancion(String name, String artista, int duracion, Genero genero, LocalDate lazamiento) {
        this.name = name;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
        this.lazamiento = lazamiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getLazamiento() {
        return lazamiento;
    }

    public void setLazamiento(LocalDate lazamiento) {
        this.lazamiento = lazamiento;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "name='" + name + '\'' +
                ", artista='" + artista + '\'' +
                ", duracion=" + duracion +
                ", genero=" + genero +
                ", lazamiento=" + lazamiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return duracion == cancion.duracion && Objects.equals(name, cancion.name) && Objects.equals(artista, cancion.artista);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
