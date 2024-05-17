package semana6;

import java.util.Comparator;
import java.util.Objects;

public class Song implements Comparable<Song>{
    public static final Comparator<Song> COMPARING = Comparator.comparing(Song::getTitulo);
    private String artista;
    private String titulo;

    public Song(String artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artista='" + artista + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(titulo, song.titulo);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(Song o) {
        return COMPARING.compare(this, o);
    }
}
