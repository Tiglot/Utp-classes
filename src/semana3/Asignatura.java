package semana3;

import java.util.Comparator;
import java.util.Objects;

public class Asignatura implements Comparable<Asignatura>{
    public static final Comparator<Asignatura> COMPARING_CODIGO = Comparator.comparing(Asignatura::getCodigo);
    private String codigo;
    private int ciclo;
    private String nombre;
    private int creditos;

    public Asignatura(String codigo, int ciclo, String nombre, int creditos) {
        this.codigo = codigo;
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public Asignatura(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo='" + codigo + '\'' +
                ", ciclo=" + ciclo +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public int compareTo(Asignatura o) {
        return COMPARING_CODIGO.compare(this, o);
    }
}
