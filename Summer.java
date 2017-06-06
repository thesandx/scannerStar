/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer;
import java.util.Scanner;

/**
 *
 * @author MANOJ KUMAR JHA
 */
public class Summer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number champ!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<n+1;i++){
            for(k=1;k<n-i;k++){
                System.out.print(" ");
            }
            for(j=1;j<i+1;j++){   
                System.out.printf("*",j);    
            }
            System.out.println();
            
        }
    }
    
}
