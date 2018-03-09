/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;



public class LinkedHashM implements Maps {
    
    private LinkedHashMap<String, String> lmap = new LinkedHashMap<String, String>();
    private Set set = lmap.entrySet();
    private Iterator iterator = set.iterator();
    
    public void agregar(String nombre){
    String tipo = "";
    while((iterator.hasNext())&&(tipo.equals(""))){
        Map.Entry mentry = (Map.Entry)iterator.next();
        if (mentry.getValue()==nombre){
            tipo = ""+mentry.getKey();
            lmap.put(tipo, nombre);
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
        if (mentry.getValue()==nombre)
            type = "El tipo de la carta es: "+mentry.getKey();
    }
     if (type.equals(""))
        type = "No existe la carta";
    return type;
}

public String getCartasTodas(){
    String r = "";
    Set set2 = lmap.entrySet();
    Iterator iterator2 = set2.iterator();
    while (iterator2.hasNext()){
        Map.Entry me2 = (Map.Entry)iterator2.next();
        r = r + "Nombre: "+me2.getValue()+" Tipo: "+me2.getKey()+"\n";
    }
    return r;
}

public String getCartasOrdenadas(){
    String r = "";
    Map<String, String> map = new TreeMap<String, String>(lmap);
    Set set2 = map.entrySet();
    Iterator iterator2 = set2.iterator();
    while (iterator2.hasNext()){
        Map.Entry me2 = (Map.Entry)iterator2.next();
        r = r + "Nombre: "+me2.getValue()+" Tipo: "+me2.getKey()+"\n";
    }
    return r;
}

public String getCantidad(){
    return "";
}

public String getCantidadOrdenadas(){
    return "";
}
    
}
