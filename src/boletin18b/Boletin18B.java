
package boletin18b;

import javax.swing.JOptionPane;

public class Boletin18B {


    public static void main(String[] args) {
   
    Buzon obx=new Buzon();
    boolean exit=true;
    obx.cargarMensajes();
    int opcion=7;
    
do {
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Opciones: \n1) Mostrar numero de Correos \n 2) Añadir un nuevo Mensaje \n3) Mostrar si hay mensajes sin leer \n4) Mostrar mensaje sin leer \n5) Mostrar el Correo por posicion \n6) Eliminar el Correo por posicion \n7) Salir"));
                switch (opcion) {
                case 1:
                    System.out.println(obx.numeroCorreos()+" correos");
                    break;
                case 2:
                    obx.engadeMensaxe(new Correo(JOptionPane.showInputDialog("Contenido del correo: ")));
                    break;
                case 3:
                    if (obx.leidos()==false) {
                        System.out.println("Quedan correos por leer");
                    } else {
                        System.out.println("Todos los correos han sido leidos");
                    }
                    break;

                case 4:

                    System.out.println(obx.amosarNoLeido());
                    break;
                case 5:
                    System.out.println(obx.amosarMensaxe(Integer.parseInt(JOptionPane.showInputDialog("Posicion del correo: "))));
                    break;

                case 6:
                    obx.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Posicion del correo")));
                    break;
                case 7:

                    exit=false;
                    break;

            }
               } catch (NumberFormatException excepcion) {
                System.out.println("Bye bye");
                exit=false;
            }

        } while (exit==true);
    }
}


