package competencia;

public class Competidor {
    private String nombreCompleto;
    private int numeroCorredor;
    private String genero;
    private Categoria categoria;
    private boolean culmino;
    private double tiempo;
    private boolean top10;

    public Competidor(String nombreCompleto, int numeroCorredor, String genero, Categoria categoria) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCorredor = numeroCorredor;
        this.genero = genero;
        this.categoria = categoria;
        this.culmino = false;
        this.tiempo = 0.0;
        this.top10 = false;
    }

    public void registrarParticipacion(boolean culmino, double tiempo, boolean top10) {
        this.culmino = culmino;
        this.tiempo = culmino ? tiempo : 0.0;
        this.top10 = culmino && top10;
    }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public int getNumeroCorredor() { return numeroCorredor; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public boolean isCulmino() { return culmino; }
    public double getTiempo() { return tiempo; }
    public boolean isTop10() { return top10; }

    @Override
    public String toString() {
        return "Competidor{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", numeroCorredor=" + numeroCorredor +
                ", genero='" + genero + '\'' +
                ", categoria=" + categoria.getNombreCategoria() +
                ", culmino=" + culmino +
                ", tiempo=" + tiempo + " hrs" +
                ", top10=" + top10 +
                '}';
    }
}