package ejercicio.electrodomesticos;

import java.util.Scanner;

public class Electrodomestico {

    String[][] electrodomesticos = new String[4][3];

    Scanner in = new Scanner(System.in);
    int i = 0;

    void guardarElectrodomestico() {
        String numeroSerie, tipoElectrodomestico, precio;

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresar Numero De Serie");
            numeroSerie = in.next();
            System.out.println("Ingresar Tipo De Electrodomestico");
            tipoElectrodomestico = in.next();
            System.out.println("Ingresar Precio");
            precio = in.next();

            electrodomesticos[i][0] = numeroSerie;
            electrodomesticos[i][1] = tipoElectrodomestico;
            electrodomesticos[i][2] = precio;
            System.out.println("Producto Almacenado Exitosamente");

        }
    }

    //busca por numero de serie del electrodomestico
    void buscarElectrodomestico() {
        String numSerieBuscar;
        System.out.print("Ingrese el numero de serie a buscar: ");
        numSerieBuscar = in.next();
        boolean bandera = false;

        for (int i = 0; i < electrodomesticos.length; i++) {

            if (numSerieBuscar.equals(electrodomesticos[i][0])) {
                System.out.println(" NUMERO SERIE : " + electrodomesticos[i][0]);
                System.out.println(" ELECTRODOMESTICO : " + electrodomesticos[i][1]);
                System.out.println(" PRECIO ELECTRODOMESTICO : " + electrodomesticos[i][2]);
                bandera = true;
            }
        }

        if (bandera == false) {
            System.out.println("EL NUMERO DE SERIE NO COINCIDE CON NINGUN ELECTRODOMESTICO");
        }

    }

    void listarElectrodomesticos() {
        System.out.println("Listando datos guardados");
        System.out.println("N. SERIE / TIPO / PRECIO");

        for (int i = 0; i < electrodomesticos.length; i++) 
            System.out.println(electrodomesticos[i][0] + " / " + electrodomesticos[i][1] + " / "
                    + electrodomesticos[i][2]);
        
    }

    
    void menu() {
        int opcion;
        do {

            System.out.println(" ---MENU DE OPCIONES--- ");
            System.out.println(" 1. Guardar Electrodomestico ");
            System.out.println(" 2. Mostrar Electrodomestico ");
            System.out.println(" 3. Buscar Electrodomestico por serie ");
            System.out.println(" 4. Salir ");

            System.out.print("\nDigite una opcion : ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    this.guardarElectrodomestico();
                    break;

                case 2:
                    this.listarElectrodomesticos();
                    break;

                case 3:
                    this.buscarElectrodomestico();
                    break;

            }
        } while (opcion > 0 && opcion < 4);

    }

}
