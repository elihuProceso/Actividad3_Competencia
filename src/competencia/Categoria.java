package competencia;

public class Categoria {
    private String nombreCategoria;
    private double distancia;
    private String generoCompetidores;

    public Categoria(String nombreCategoria, double distancia, String generoCompetidores) {
        this.nombreCategoria = nombreCategoria;
        this.distancia = distancia;
        this.generoCompetidores = generoCompetidores;
    }

    public String getNombreCategoria() { return nombreCategoria; }
    public void setNombreCategoria(String nombreCategoria) { this.nombreCategoria = nombreCategoria; }

    public double getDistancia() { return distancia; }
    public void setDistancia(double distancia) { this.distancia = distancia; }

    public String getGeneroCompetidores() { return generoCompetidores; }
    public void setGeneroCompetidores(String generoCompetidores) { this.generoCompetidores = generoCompetidores; }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombreCategoria='" + nombreCategoria + '\'' +
                ", distancia=" + distancia + "km" +
                ", generoCompetidores='" + generoCompetidores + '\'' +
                '}';
    }
}
