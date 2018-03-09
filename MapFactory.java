/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hecto
 */
public class MapFactory {
     public Maps Implementacion(String imp){
        if("1".equals(imp)){
            return new HashM();
        }else if("2".equals(imp)){
            return new TreeM();
        }else if ("3".equals(imp)){
            return new LinkedHashM();
    }
        return null;
    }
}
