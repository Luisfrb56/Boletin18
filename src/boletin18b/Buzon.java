
package boletin18b;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Buzon {
    
 private ArrayList<Correo> listaCorreos=new ArrayList<Correo>();
 Correo m1=new Correo("Mensaje1");
 Correo m2=new Correo("Mensaje2");
 Correo m3=new Correo("Mensaje3");
 Correo m4=new Correo("Mensaje4");
 Correo m5=new Correo("Mensaje5");

 public void cargarMensajes(){
     listaCorreos.add(m1);
     listaCorreos.add(m2);
     listaCorreos.add(m3);
     listaCorreos.add(m4);
     listaCorreos.add(m5);
 }
 
 public void engadeMensaxe(Correo c){
     listaCorreos.add(c);
 }
 
 public int numeroCorreos(){
     return listaCorreos.size();
 }
 public boolean leidos(){
         boolean leido=false;

        for (int i=0; i<listaCorreos.size(); i++) {

            if (listaCorreos.get(i).isLeido()==true) {
                leido=true;
            } else {
                leido=false;
            }

        }
        return leido;
    }
     public String amosarNoLeido() {

        for (int i=0; i<listaCorreos.size(); i++) {

            if (listaCorreos.get(i).isLeido()==false) {

                listaCorreos.get(i).setLeido(true);
                return listaCorreos.get(i).getContido();
            }

        }
        return "Todos los mensajes han sido leidos";
    }
     
     public String amosarMensaxe(int k){
         
         try {
            return listaCorreos.get(k).getContido();
        } catch (IndexOutOfBoundsException exception) {
            return "Error: No encontrada la posición";
        }
     }
     
         public void eliminar(int k) {

        try {
            listaCorreos.remove(k);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Error no encontrada la posición");

        }

    }
    }
