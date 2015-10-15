
package boletin2.pkg1;

import java.util.Scanner;

public class Boletin21_C {

 
    public static void main(String[] args) {
        //pedimos as variables por teclado
        float base,altura;
        Scanner obx = new Scanner(System.in);
        System.out.println("teclea base") ;
        base =obx.nextFloat();
        System.out.println("teclea altura") ;
        altura = obx.nextFloat();
        System.out.println("area ="+ base*altura/2);
                }
    
}
