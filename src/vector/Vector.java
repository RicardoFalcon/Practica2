/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author iveth
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        int menor;

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el elemento ->[" + (i + 1) + "]");
            vector[i] = entrada.nextInt();
        }

        for (int j = 0; j < vector.length; j++) {
        for (int k = 0; k < vector.length-j-1; k++) {
            if(vector[k] > vector[k+1]){
                int tmp = vector[k+1];
                vector[k+1] = vector[k];
                vector[k] = tmp;
            }
        }
    }
        System.out.println(Arrays.toString(vector));

    }
}
