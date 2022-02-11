public class tiendaSeis{
    //Atributos
    String tipoDeProducto;
    double costo;

    // Asignación de atributos
    public tiendaSeis(String producto, double precio){
        tipoDeProducto = producto;
        costo = precio;
    }

    // Metodo para el incremento de precio
    public double incrementoPrecio(double incremento){
        double nuevoPrecio = costo + incremento;
        costo = nuevoPrecio;
        return costo;
    }

    // Precio con impuestos
    public double precioImpuesto (double impuesto){
        double precioConImpuesto = costo * (1 + impuesto);
        costo = precioConImpuesto;
        return costo;
    }

    //para imprimir
    public String toString(){
        return "esta tienda vende: " + tipoDeProducto + " al siguiente precio: " + costo + ".";
    }

    // Metodo principal
    public static void main(String[] args) {
        tiendaSeis puestoDeLimonada = new tiendaSeis("Limonada", 5.23);
        tiendaSeis puestoGalletas = new tiendaSeis ("Galletas", 4.69);
        
        puestoDeLimonada.incrementoPrecio(2);
        puestoDeLimonada.precioImpuesto(0.16);
        
        puestoGalletas.incrementoPrecio(3);
        puestoGalletas.precioImpuesto(0.16);
    
        System.out.println(puestoDeLimonada);
        System.out.println(puestoGalletas);
    }       
}