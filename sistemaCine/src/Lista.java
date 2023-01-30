
public class Lista {
    
    //nodo para iniciar la lista;
    private Nodo inicio;
    
    //mide la cantidad de ordenes 
    private int size;
    
    //constructor para inicializar la lista
    public void Lista() {
        inicio = null;
        size = 0;
    }
   
    //verifica si la lista esta vacia
    public boolean estaVacia() {
        if(inicio == null)
            return true;
        else
            return false;
    }
    
    public int orderNumber() {
        return size;
    }
    
    public void removerPorPosicion(int posicion) {
        //
        if(posicion >= 0 && posicion < size) {
            if(posicion == 0) {
                inicio= inicio.getSiguiente();
            } else {
                Nodo reco = inicio;
                for(int i = 0; i < posicion - 1; i++)
                    reco = reco.getSiguiente();
                Nodo siguiente = reco.getSiguiente();
                //le apunta al nodo siguiente, asi eliminando el nodo
                reco.setSiguiente(siguiente.getSiguiente());
            }
            size--;
        }
    }
    
    //agrega un nodo al final de la lista con los detalles de la orden
    public void agregar(String nombrePelicula, String horarioPelicula, String salaPelicula, int cantBoletos, Double totalPrecio) {
        //crea un nuevo nodo y le asigna los valores ingresado
        Nodo nuevo = new Nodo();
        nuevo.setNombrePelicula(nombrePelicula);
        nuevo.setHorarioPelicula(horarioPelicula);
        nuevo.setSalaPelicula(salaPelicula);
        nuevo.setCantBoletos(cantBoletos);
        nuevo.setTotalPrecio(totalPrecio);
        
        //si la lista esta vacia, anade el nodo al principio.
        if(estaVacia()) {
            inicio = nuevo;
        } else {
            //recorre la lista hasta llegar al ultimo nodo, y se anade el nuevo nodo
            Nodo reco = inicio;
            
            while(reco.getSiguiente() != null)
                reco = reco.getSiguiente();
            
            reco.setSiguiente(nuevo);
        }
        size++;
    }
    
 
    
    //imprime las ordenes del sistema de tickets en consola
    public void imprimir() {
        if(!estaVacia()) {
            Nodo reco = inicio;
            int i = 1;
            System.out.println(" ");
            while(reco != null) {
                System.out.print(i + ".[" + reco.getNombrePelicula() + ", " + reco.getHorarioPelicula() + ", " + reco.getSalaPelicula() + ", " + reco.getCantBoletos() + ", " + reco.getTotalPrecio() + "]" + " -> ");
                reco = reco.getSiguiente();
                i++;
            }
        }
    }
    
    
}
