import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alimento extends Producto{

    private String fechaElaboracion;
    private String fechaExpiracion;

    private List<String> ingredientes = new ArrayList<>();

    public Alimento(String nombre, double precio, String codigo, int cantidad,
                    String marca, String fechaElaboracion, String fechaExpiracion,
                    List<String> ingredientes) {
        super(nombre, precio, codigo, cantidad, marca);
        this.fechaElaboracion = fechaElaboracion;
        this.fechaExpiracion = fechaExpiracion;
        this.ingredientes = ingredientes;
    }

    public Alimento() {
    }

    @Override
    public void ingresarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese el código del producto");
        this.codigo=sc.next();
        System.out.println("Ingrese el cantidad del producto");
        this.cantidad=sc.nextInt();
        System.out.println("Ingrese marca del producto");
        this.marca=sc.next();
        System.out.println("Ingrese fecha de elaboración del producto");
        this.fechaElaboracion=sc.next();
        System.out.println("Ingrese fecha de expiración del producto");
        this.fechaExpiracion=sc.next();
    }

    @Override
    public String toString(){
        return "El Alimento "+this.nombre+ " tiene un precio de "+this.precio+
                ". Su codigo es "+this.codigo+", hay un total de "+this.cantidad+
                " unidades disponibles, es de marca "+this.marca+" fue elaborado el " +this.fechaElaboracion+
                " y expira el "+this.fechaExpiracion;
    }


    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
