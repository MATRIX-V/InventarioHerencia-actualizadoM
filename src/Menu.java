import java.util.ArrayList;
import java.util.Scanner;

    public class Menu {
        private Scanner scanner;
        private Producto producto;

        public Menu() {
            scanner = new Scanner(System.in);
            producto = new Producto();
        }

        public void mostrarMenu() {
            System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.println("HOlA, BIENVENIDO A LA GESTION DE TU INVENTARIO");
            System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.println("1. Agregar item de tipo Alimento");
            System.out.println("2. Agregar item de tipo Electrodomestico");
            System.out.println("3. Agregar item de tipo Tecnologia");
            System.out.println("4. Terminar Programa");
            System.out.println("-------------------------------");
            System.out.print("Escoge una opcion:: ");
        }

        public void ejecutarOpcion(int opcion) {
            switch (opcion) {
                case 1:
                    Alimento a1 = new Alimento();
                    a1.ingresarProducto();
                    System.out.println(a1.toString());
                    break;
                case 2:
                    Electrodomestico e1 = new Electrodomestico();
                    e1.ingresarProducto();
                    System.out.println(e1.toString());
                    break;
                case 3:
                    Tecnologia t1 = new Tecnologia();
                    t1.ingresarProducto();
                    System.out.println(t1.toString());
                    break;
                case 4:
                    System.out.println("Inventario Cerrado, gracias por usar el Gestor de Inventarios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrecto, seleccione una de las opciones mencionadas");
            }
        }
        public Scanner getScanner() {
            return scanner;
        }
        public void Ejecucion() {
            while (true) {
                mostrarMenu();
                int opcion = Integer.parseInt(scanner.next());
                ejecutarOpcion(opcion);
            }
        }
    }

