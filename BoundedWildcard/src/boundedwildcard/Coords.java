/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundedwildcard;

/**
 *
 * @author abvil
 * @param <T>
 */
public class Coords<T extends TwoD> {
    T[] coords;
    
    Coords(T[] o){
        coords = o;
    }
}
