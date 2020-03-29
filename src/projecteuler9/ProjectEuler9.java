/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler9;

/**
 *
 * @author Fernando Baladi
 */
public class ProjectEuler9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 1000;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    if ((i<j)&&(j<k)&&(i+j+k==num)&&(((int) Math.pow(i, 2))+((int)Math.pow(j, 2))==((int)Math.pow(k, 2)))) {
                        System.out.println(i + ", " + j + ", " + k + "son tripletes.");
                        System.out.println("El producto del triplete es: " + (i*j*k));
                    }
                }
            }
        }
    }
    
}
