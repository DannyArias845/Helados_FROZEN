import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaración e inicialización de variables de precios
        double precioSimple = 1.500;
        double precioDoble = 2.500;
        double precioEspecial = 3.500;

        // Declaración de variables para almacenar la cantidad vendida
        int cantidadSimple, cantidadDoble, cantidadEspecial;

        // Declaración de variables para almacenar los datos del cliente
        String nombre, apellido, identificacion, direccion, telefono, correo, fechaCompra, metodoPago;

        // Solicitar datos del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        nombre = input.nextLine();

        System.out.print("Ingrese el apellido del cliente: ");
        apellido = input.nextLine();

        System.out.print("Ingrese la identificación del cliente: ");
        identificacion = input.nextLine();

        System.out.print("Ingrese la dirección del cliente: ");
        direccion = input.nextLine();

        System.out.print("Ingrese el teléfono del cliente: ");
        telefono = input.nextLine();

        System.out.print("Ingrese el correo electrónico del cliente: ");
        correo = input.nextLine();

        System.out.print("Ingrese la fecha de compra: ");
        fechaCompra = input.nextLine();

        System.out.print("Ingrese el método de pago: ");
        metodoPago = input.nextLine();

        // Solicitar la cantidad vendida de cada tipo de helado
        System.out.print("Ingrese la cantidad de helados simples vendidos: ");
        cantidadSimple = input.nextInt();

        System.out.print("Ingrese la cantidad de helados dobles vendidos: ");
        cantidadDoble = input.nextInt();

        System.out.print("Ingrese la cantidad de helados especiales vendidos: ");
        cantidadEspecial = input.nextInt();

        // Calcular el total de ventas
        double totalSimple = cantidadSimple * precioSimple;
        double totalDoble = cantidadDoble * precioDoble;
        double totalEspecial = cantidadEspecial * precioEspecial;
        double totalVentas = totalSimple + totalDoble + totalEspecial;

        // Mostrar resultados
        System.out.println("\n--- Detalles de la Venta ---");
        System.out.println("Cliente: " + nombre + " " + apellido);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Fecha de compra: " + fechaCompra);
        System.out.println("Método de pago: " + metodoPago);

        System.out.println("\n--- Detalles de Helados Vendidos ---");
        System.out.println("Helados Simples vendidos: " + cantidadSimple + " Total: $" + totalSimple);
        System.out.println("Helados Dobles vendidos: " + cantidadDoble + " Total: $" + totalDoble);
        System.out.println("Helados Especiales vendidos: " + cantidadEspecial + " Total: $" + totalEspecial);

        System.out.println("\nTotal de ventas del día: $" + totalVentas);
    }
}

