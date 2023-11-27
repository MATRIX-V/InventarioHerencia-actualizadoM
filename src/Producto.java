import java.util.Scanner;

public class Producto {

    String nombre;
    double precio;
    String codigo;
    int cantidad;

    String marca;
//solo será para un producto en general, pero cada elemento tiene sus propias caracteristicas
    public Producto(String nombre, double precio, String codigo, int cantidad, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    public Producto() {
    }

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
    }

}
