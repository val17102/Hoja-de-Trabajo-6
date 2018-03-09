/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */

import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
public class TreeM implements Maps{
    
    private TreeMap<String, String> tmap = new TreeMap<String, String>();
    private Set set = tmap.entrySet();
    private Iterator iterator = set.iterator();
    
    public void agregarCarta(String linea){
     String[] arr = linea.split("\\|");
     tmap.put(arr[0], arr[1]);
}
    
    public void agregar(String nombre){
    String tipo = "";
    while((iterator.hasNext())&&(tipo.equals(""))){
        Map.Entry mentry = (Map.Entry)iterator.next();
        if (mentry.getKey()==nombre){
            tipo = ""+mentry.getValue();
            tmap.put(nombre, tipo);
        }
    }
    if (tipo.equals("")){
        System.out.println("No existe la carta");
    }else 
        System.out.println("Ingresado");
}
public String tipo(String nombre){
    String type = "";
    while((iterator.hasNext())&&(type.equals(""))){
        Map.Entry mentry = (Map.Entry)iterator.next();
        if (mentry.getKey()==nombre)
            type = "El tipo de la carta es: "+mentry.getValue();
    }
     if (type.equals(""))
        type = "No existe la carta";
    return type;
}

public String getCartasTodas(){
    String r = "";
    Set set2 = tmap.entrySet();
    Iterator iterator2 = set2.iterator();
    while (iterator2.hasNext()){
        Map.Entry me2 = (Map.Entry)iterator2.next();
        r = r + "Tipo: "+me2.getValue()+" Nombre: "+me2.getKey()+"\n";
    }
    return r;
}

public String getCartasOrdenadas(){
    String r = "";
    Set set2 = tmap.entrySet();
    Iterator iterator2 = set2.iterator();
    while (iterator2.hasNext()){
        Map.Entry me2 = (Map.Entry)iterator2.next();
        r = r + "Tipo: "+me2.getValue()+" Nombre: "+me2.getKey()+"\n";
    }
    return r;
}

public String getCantidad(){
    int cantidad = 0;
    while (iterator.hasNext())
    {
    	cantidad += 1;
    }
    return cantidad;
}

public String getCantidadOrdenadas(){
    return "";
}
}
