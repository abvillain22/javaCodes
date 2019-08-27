/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundedwildcard;

/**
 *
 * @author abvil
 */
public class BoundedWildcard {
    
    static void showXY(Coords<?> c){
        System.out.println("X Y Coordinates");
        for(int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " "+ c.coords[i].y);
        }
        System.out.println();
    }
    
    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("X Y Z  Coordinates");
        for(int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }
    
    static void showAll(Coords<? extends FourD> c){
        System.out.println("X Y Z T Coordinates");
        for(int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TwoD td[] = {new TwoD(5,6), new TwoD(7,8), new TwoD(9,10)};
        
        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("Contents of tdlocs");
        showXY(tdlocs);
        
        ThreeD th[] = {new ThreeD(1,2,3), new ThreeD(4,5,6), new ThreeD(7,8,9)};
        
        Coords<ThreeD> thlocs = new Coords<>(th);
        System.out.println("Contents of thlocs");
        showXY(thlocs);
        showXYZ(thlocs);
        
        FourD fd[] = {new FourD(1,2,3,4), new FourD(5,6,7,8), new FourD(9,10,11,12)};
        
        Coords<FourD> fdlocs = new Coords<>(fd);
        System.out.println("Contents of FourD");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
