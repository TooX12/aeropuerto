/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication87;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Lab3 mq 11
 */
public class Linea {
    Linea(){
        
    }   
    void menu(){
        File f = new File("aero.txt");
        File g = new File ("ajsndsj.txt");
        File i = new File ("agysvd.txt");
           JOptionPane.showMessageDialog(null, "La opcion de consultar todavia no esta disponible jeje, algunos paises estan mal escritos\nEl programa todavia NO guarda nada");
        JTextArea area = new JTextArea();
        JTextArea area2= new JTextArea();
   dias d[]=new dias[7];
   d[0]=new dias();                //Empece a crear todos los vuelos, son un chingo
   d[0].dia="Lunes";
   d[0].vu[0].hora="7:00";
   d[0].vu[0].Lugar="Francia";
   d[0].vu[1].hora="8:00";
    d[0].vu[1].Lugar="Alemania";
    d[0].vu[2].hora="9:00";
    d[0].vu[2].Lugar="Brasil";
    d[0].vu[3].hora="10:00";
    d[0].vu[3].Lugar="Holanda";
     d[0].vu[4].hora="11:00";
      d[0].vu[4].Lugar="Colombia";
     d[0].vu[5].hora="12:00";
      d[0].vu[5].Lugar="Inglaterra";
      d[0].vu[6].hora="13:00";
      d[0].vu[6].Lugar="Canada";
   d[1]=new dias();
    d[1].dia="Martes";
     d[1].vu[0].hora="7:00";
   d[1].vu[0].Lugar="Portugal";
   d[1].vu[1].hora="8:00";
    d[1].vu[1].Lugar="Italia";
    d[1].vu[2].hora="9:00";
    d[1].vu[2].Lugar="Brasil";
    d[1].vu[3].hora="10:00";
    d[1].vu[3].Lugar="Belgica";
     d[1].vu[4].hora="11:00";
      d[1].vu[4].Lugar="Aregntina";
     d[1].vu[5].hora="12:00";
      d[1].vu[5].Lugar="Peru";
      d[1].vu[6].hora="13:00";
      d[1].vu[6].Lugar="Honduras";
   d[2]=new dias();
    d[2].dia="Miercoles";
     d[2].vu[0].hora="7:00";
   d[2].vu[0].Lugar="Holanda";
   d[2].vu[1].hora="8:00";
    d[2].vu[1].Lugar="Mexico";
    d[2].vu[2].hora="9:00";
    d[2].vu[2].Lugar="India";
    d[2].vu[3].hora="10:00";
    d[2].vu[3].Lugar="Rusia";
     d[2].vu[4].hora="11:00";
      d[2].vu[4].Lugar="Colombia";
     d[2].vu[5].hora="12:00";
      d[2].vu[5].Lugar="Belgica";
      d[2].vu[6].hora="13:00";
      d[2].vu[6].Lugar="Esapaña";
   d[3]=new dias();
    d[3].dia="Jueves";
     d[3].vu[0].hora="7:00";
   d[3].vu[0].Lugar="E.U.A";
   d[3].vu[1].hora="8:00";
    d[3].vu[1].Lugar="Mexico";
    d[3].vu[2].hora="9:00";
    d[3].vu[2].Lugar="India";
    d[3].vu[3].hora="10:00";
    d[3].vu[3].Lugar="Rusia";
     d[3].vu[4].hora="11:00";
      d[3].vu[4].Lugar="Colombia";
     d[3].vu[5].hora="12:00";
      d[3].vu[5].Lugar="Belgica";
      d[3].vu[6].hora="13:00";
      d[3].vu[6].Lugar="Esapaña";
   d[4]=new dias();
    d[4].dia="Viernes";
      d[3].vu[0].hora="7:00";
   d[4].vu[0].Lugar="Canada";
   d[4].vu[1].hora="8:00";
    d[4].vu[1].Lugar="Alemania";
    d[4].vu[2].hora="9:00";
    d[4].vu[2].Lugar="Rusia";
    d[4].vu[3].hora="10:00";
    d[4].vu[3].Lugar="Jamaica";
     d[4].vu[4].hora="11:00";
      d[4].vu[4].Lugar="Suiza";
     d[4].vu[5].hora="12:00";
      d[4].vu[5].Lugar="Brasil";
      d[4].vu[6].hora="13:00";
      d[4].vu[6].Lugar="E.U.A";
   d[5]=new dias();
    d[5].dia="Sabado";
      d[5].vu[0].hora="7:00";
   d[5].vu[0].Lugar="Costa Rica";
   d[5].vu[1].hora="8:00";
    d[5].vu[1].Lugar="Chile";
    d[5].vu[2].hora="9:00";
    d[5].vu[2].Lugar="Turquia";
    d[5].vu[3].hora="10:00";
    d[5].vu[3].Lugar="Francia";
     d[5].vu[4].hora="11:00";
      d[5].vu[4].Lugar="China";
     d[5].vu[5].hora="12:00";
      d[5].vu[5].Lugar="Mexico";
      d[5].vu[6].hora="13:00";
      d[5].vu[6].Lugar="India";
   d[6]=new dias();
    d[6].dia="Domingo";
      d[6].vu[0].hora="7:00";
   d[6].vu[0].Lugar="E.U.A";
   d[6].vu[1].hora="8:00";
    d[6].vu[1].Lugar="Mexico";
    d[6].vu[2].hora="9:00";
    d[6].vu[2].Lugar="India";
    d[6].vu[3].hora="10:00";
    d[6].vu[3].Lugar="Rusia";
     d[6].vu[4].Lugar="11:00";
      d[6].vu[4].Lugar="Colombia";
     d[6].vu[5].Lugar="12:00";
      d[6].vu[5].Lugar="Belgica";
      d[6].vu[6].Lugar="13:00";
      d[6].vu[6].Lugar="Esapaña";
String opciones[]={"Reservar","Comprar","Consultar","Cancelar","Salir"};
String opc="";
do{
    opc=(String)JOptionPane.showInputDialog(null,"Seleccione opcion :",null,3,null,opciones,null);
    if(opc==null){
        opc="Salir";
    }
        switch(opc){
            case "Reservar":
               reservar(d);
                break;
            case "Comprar": comprar(d);  //Como el metodo comprar es lo mismo que reservar solo que en la varible "boleto" de la clase pasajeros va a decir "pagado" entonces solo hice un metodo comprar con el mismo procedimiento de reservar
                break;
            case "Consultar":
                break;
            case "Cancelar":cancelar(d);
                break;
                
        }
    
}while(opc.compareTo("Salir")!=0);

    }
    
    static void comprar(dias d[]){
        JTextArea area = new JTextArea();
        JTextArea area2 = new JTextArea();
         String cad="";    
                for(int r=0;r<7;r++){
                    cad+=d[r].dia+"\t";
                }
                area.setText("\t"+cad+"\n");
        String cad2="";
        for(int r=0;r<7;r++){
            cad2+=d[0].vu[r].hora+"\t";
            for(int f=0;f<7;f++){
                cad2+=d[f].vu[r].Lugar+"\t";
            }
            cad2+="\n";
        }
        area.append(cad2+"Escribe el dia del vuelo :");
        String dia=JOptionPane.showInputDialog(area);
        int i=0;
        while(d[i].dia.compareTo(dia)!=0){
            i++;
        }
        String cadena="";
        cadena+="\t"+d[i].dia+"\n";
        for(int v=0;v<7;v++){
            cadena+=d[i].vu[v].hora+"\t"+d[i].vu[v].Lugar+"\n";
        }
        area2.append(cadena+"Escribe el nombre de tu destino :");
      String desti=JOptionPane.showInputDialog(area2);
      int ip=0;
      while(d[i].vu[ip].Lugar.compareToIgnoreCase(desti)!=0){
          ip++;
      }
      d[i].vu[ip].pas[d[i].vu[ip].cont]=new pasajeros();
      d[i].vu[ip].pas[d[i].vu[ip].cont].nombre=JOptionPane.showInputDialog("Ingresa tu nombre :");
       d[i].vu[ip].pas[d[i].vu[ip].cont].boleto="pagado";
    }
    static void reservar(dias d[]){
        JTextArea area = new JTextArea();
         JTextArea area2 = new JTextArea();
         String cad="";    
                for(int r=0;r<7;r++){
                    cad+=d[r].dia+"\t";
                }
                area.setText("\t"+cad+"\n");
        String cad2="";
        for(int r=0;r<7;r++){
            cad2+=d[0].vu[r].hora+"\t";
            for(int f=0;f<7;f++){
                cad2+=d[f].vu[r].Lugar+"\t";
            }
            cad2+="\n";
        }
        area.append(cad2+"Escribe el dia del vuelo :");
        String dia=JOptionPane.showInputDialog(area);
        int i=0;
        while(d[i].dia.compareTo(dia)!=0){
            i++;
        }
        String cadena="";
        cadena+="\t"+d[i].dia+"\n";
        for(int v=0;v<7;v++){
            cadena+=d[i].vu[v].hora+"\t"+d[i].vu[v].Lugar+"\n";
        }
        area2.append(cadena+"Escribe el nombre de tu destino :");
      String desti=JOptionPane.showInputDialog(area2);
      int ip=0;
      while(d[i].vu[ip].Lugar.compareToIgnoreCase(desti)!=0){
          ip++;
      }
      d[i].vu[ip].pas[d[i].vu[ip].cont]=new pasajeros();
      d[i].vu[ip].pas[d[i].vu[ip].cont].nombre=JOptionPane.showInputDialog("Ingresa tu nombre :");
       d[i].vu[ip].pas[d[i].vu[ip].cont].boleto="reservado";
    }
    static void cancelar(dias d[]){
       String nombre=JOptionPane.showInputDialog("Ingresa tu nombre : ");
      String dia=JOptionPane.showInputDialog("Ingresa el dia de tu vuelo :");
      String destino=JOptionPane.showInputDialog("Ingresa el destino :");
      int posicion_dia=0;
      int posicion_destino=0;
      int posicion_pasajero=0;
      try{
           while(d[posicion_dia].dia.compareToIgnoreCase(dia)!=0){
          posicion_dia++;
      }
      }catch(ArrayIndexOutOfBoundsException e){
          JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del dia correctamente");
      
      }
       try{
           while(d[posicion_dia].vu[posicion_destino].Lugar.compareToIgnoreCase(destino)!=0){
               
          posicion_destino++;
      }
      }catch(ArrayIndexOutOfBoundsException e){
          JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del destino correctamente");
      
      }
        try{
           while(d[posicion_dia].vu[posicion_destino].pas[posicion_pasajero].nombre.compareToIgnoreCase(nombre)!=0){
          posicion_pasajero++;
      }
       
      }catch(ArrayIndexOutOfBoundsException e){
          JOptionPane.showMessageDialog(null, "No se encontro el nombre en el sistema");
      
      }
        catch(NullPointerException r){
              JOptionPane.showMessageDialog(null, "El nombre no fue encontrado");
               }
      if(d[posicion_dia].vu[posicion_destino].pas[posicion_pasajero].boleto=="reservado"){
        if(d[posicion_dia].vu[posicion_destino].pas[posicion_pasajero].representante!=""){
            for(int a=posicion_pasajero){
        }
        else{
            for(int i=posicion_pasajero;i<d[posicion_dia].vu[posicion_destino].cont;i++){
                d[posicion_dia].vu[posicion_destino].pas[i]=d[posicion_dia].vu[posicion_destino].pas[i+1];
            }
            JOptionPane.showMessageDialog(null, "Su boleto ha sido ");
        }
      }
      else{
          JOptionPane.showMessageDialog(null, "El boleto o los boletos ya estan pagados, no se pueden cancelar");
      }
        
    }
    
    }

