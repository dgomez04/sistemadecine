
public class ventasTotales {
    
    //constructor para ventasTotales
    private int boletos;   
    private double totalVenta;
    
    public ventasTotales() {
       
    } 

    public ventasTotales(int boletos, double totalVenta) {
        this.boletos = boletos;
        this.totalVenta = totalVenta;
    }

    public int getBoletos() {
        return boletos;
    }

    public void setBoletos(int boletos) {
        this.boletos = boletos;
    }

    

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    
}
