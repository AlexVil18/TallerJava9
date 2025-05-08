public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setNumeroCuenta("1001");
        cuenta1.setNombreTitular("Ana García");
        cuenta1.setSaldo(1000.0);
        cuenta1.setTipoCuenta("Ahorros");


        CuentaBancaria cuenta2 = new CuentaBancaria("1002", "Juan Pérez", 2000.0, "Corriente");


        System.out.println("Estado inicial de las cuentas:");
        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();


        System.out.println("Realizando operaciones...");
        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);
        cuenta1.retirar(-100.0);

        cuenta2.depositar(-50.0);
        cuenta2.depositar(1000.0);
        cuenta2.retirar(3500.0);

        System.out.println("\nEstado final de las cuentas:");
        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();



        // Crear un libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        // Mostrar detalles del libro
        libro1.mostrarDetalles();
        // Prestar el libro
        libro1.prestar();
        // Mostrar detalles del libro después de prestarlo
        libro1.mostrarDetalles();
        // Segundo intento de prestar el libro
        libro1.prestar();
        // Mostrar detalles del libro después del segundo intento
        libro1.mostrarDetalles();
        // Devolver el libro
        libro1.devolver();
        // Mostrar detalles del libro después de devolverlo
        libro1.mostrarDetalles();
        // Prestar el libro nuevamente
        libro1.prestar();
        // Mostrar detalles del libro después de la devolución
        libro1.mostrarDetalles();


        Coche coche1 = new Coche();
        coche1.setMarca("Toyota");
        coche1.setModelo("Corolla");
        coche1.setAnio(2020);


        Coche coche2 = new Coche("Honda", "Civic", 2021);

        // Mostrar información de ambos coches
        System.out.println("Información del primer coche:");
        coche1.mostrarInformacion();
        coche1.mostrarInformacionDetallada();

        System.out.println("\nInformación del segundo coche:");
        coche2.mostrarInformacion();
        coche2.mostrarInformacionDetallada();

        // Actualizar kilometraje del primer coche
        System.out.println("\nActualizando kilometraje del primer coche:");
        coche1.actualizarKilometraje(15000);
        coche1.actualizarKilometraje(-5000);

        // Actualizar kilometraje del segundo coche
        System.out.println("\nActualizando kilometraje del segundo coche:");
        coche2.actualizarKilometraje(20000);

        // Mostrar información actualizada
        System.out.println("\nInformación actualizada del primer coche:");
        coche1.mostrarInformacion();
        coche1.mostrarInformacionDetallada();

        System.out.println("\nInformación actualizada del segundo coche:");
        coche2.mostrarInformacion();
        coche2.mostrarInformacionDetallada();


        // Crear un pedido
        // Crear el primer pedido usando constructor vacío
        Pedido pedido1 = new Pedido();
        pedido1.setNumeroPedido(1);
        pedido1.setNombreCliente("Carlos Rodríguez");
        pedido1.agregarProducto("Laptop", 1200.0);
        pedido1.agregarProducto("Mouse", 25.0);
        pedido1.agregarProducto("Teclado", 45.0);

        // Crear el segundo pedido usando constructor parametrizado 
        Pedido pedido2 = new Pedido(2, "María López", 0.0);
        pedido2.agregarProducto("Smartphone", 800.0);
        pedido2.agregarProducto("Auriculares", 100.0);

        // Aplicar descuentos válidos e inválidos
        System.out.println("\nAplicando descuentos...");
        pedido1.calcularDescuento(10); 
        pedido1.calcularDescuento(150);
        pedido2.calcularDescuento(15);
        pedido2.calcularDescuento(-5);

        // Mostrar información de ambos pedidos
        System.out.println("\nDetalles del primer pedido:");
        pedido1.mostrarPedido();
        System.out.println("\nDetalles del segundo pedido:");
        pedido2.mostrarPedido();
    }
}