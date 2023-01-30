
public class Nodo {
    private String nombrePelicula;
    private String horarioPelicula;
    private String salaPelicula;
    private int cantBoletos;
    private Double totalPrecio;
    private Nodo siguiente;

    public Nodo() {
        this.nombrePelicula = null;
        this.horarioPelicula = null;
        this.salaPelicula = null;
        this.cantBoletos = 0;
        this.totalPrecio = 0.0;
        this.siguiente = null;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getHorarioPelicula() {
        return horarioPelicula;
    }

    public void setHorarioPelicula(String horarioPelicula) {
        this.horarioPelicula = horarioPelicula;
    }

    public String getSalaPelicula() {
        return salaPelicula;
    }

    public void setSalaPelicula(String salaPelicula) {
        this.salaPelicula = salaPelicula;
    }

    public int getCantBoletos() {
        return cantBoletos;
    }

    public void setCantBoletos(int cantBoletos) {
        this.cantBoletos = cantBoletos;
    }

    public Double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(Double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
