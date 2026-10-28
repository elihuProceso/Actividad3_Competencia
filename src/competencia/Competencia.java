package competencia;

import java.util.ArrayList;
import java.util.List;

public class Competencia {
    private List<Categoria> categorias;
    private List<Competidor> competidores;
    private int contadorAsignacionNumero;

    public Competencia() {
        this.categorias = new ArrayList<>();
        this.competidores = new ArrayList<>();
        this.contadorAsignacionNumero = 1; // Sistema asigna el número secuencialmente
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void eliminarCategoria(String nombreCategoria) {
        categorias.removeIf(c -> c.getNombreCategoria().equalsIgnoreCase(nombreCategoria));
    }

    public Competidor inscribirCompetidor(String nombreCompleto, String genero, Categoria categoria) {
        Competidor nuevo = new Competidor(nombreCompleto, contadorAsignacionNumero++, genero, categoria);
        competidores.add(nuevo);
        return nuevo;
    }

    public void eliminarCompetidor(int numeroCorredor) {
        competidores.removeIf(c -> c.getNumeroCorredor() == numeroCorredor);
    }

    public List<Categoria> getCategorias() { return categorias; }
    public List<Competidor> getCompetidores() { return competidores; }

    @Override
    public String toString() {
        return "Competencia{" +
                "categorias=" + categorias.size() +
                ", competidoresInscritos=" + competidores.size() +
                '}';
    }
}