/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
import java.io.*;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        boolean x = true ,y = true;
        MapFactory mf = new MapFactory();
        Maps mapa ;
        Scanner sc = new Scanner(System.in);
        String respuesta = "";
        while(x){
            
            System.out.println("MENU");
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHashMap");
            System.out.println("4. Salir");
            int ope =  sc.nextInt();
            if(ope >=1 && ope<=3){
                y = true;
                mapa = mf.Implementacion(String.valueOf(ope));
                File cartas = new File(System.getProperty("user.dir")+"\\"+"cards_desc.txt");
                FileReader leer = new FileReader(cartas);
                BufferedReader buff = new BufferedReader(leer);
                String linea;
                while((linea = buff.readLine()) != null){
                    mapa.agregarCarta(linea);
                }
                while (y){
                    System.out.println("MENU 2");
                    System.out.println("1. Agregar una carta por nombre");
                    System.out.println("2. Indicar tipo de una carta por nombre");
                    System.out.println("3. Mostrar nombre, tipo y cantidad de cada carta");
                    System.out.println("4. Mostrar nombre, tipo y cantidad de cada carta ordenadas por tipo");
                    System.out.println("5. Mostrar el nombre y tipo de todas las cartas");
                    System.out.println("6. Mostrar el nombre y tipo de todas las cartas ordenadas por tipo");
                    System.out.println("7. Salir");
                    int ope2 =  sc.nextInt();
                    if (ope2 == 1){
                       System.out.println("Ingrese el nombre de la carta");
                       respuesta = sc.next();
                       mapa.agregar(respuesta);
                    }else if(ope2 == 2){
                       System.out.println("Ingrese el nombre de la carta"); 
                       respuesta = sc.next();
                       System.out.println("El tipo es: "+mapa.tipo(respuesta)); 
                    }else if(ope2 == 3){
                       System.out.println(""+mapa.getCantidad());  
                    }else if(ope2 == 4){
                        
                    }else if(ope2 == 5){
                        System.out.println(mapa.getCartasTodas());
                    }else if (ope2 == 6){
                        System.out.println(mapa.getCartasOrdenadas());
                    }else if (ope2 == 7){
                        y = false;
                    }
                }
            }else if (ope == 4){
                x = false;
            }
        }
    }
    
}
