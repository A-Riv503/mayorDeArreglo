import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    /*Tienes un arreglo (llamado myArray) con 5 elementos (enteros en el rango de 1 a 100). Escribe un programa en Java que imprima el número más alto del arreglo
    (Si se repite, solo imprimir una vez). El programa solo debe imprimir el número, sin ningún texto.*/
    public static void main(String[] args) {
        llenarArray();

    }

    public static void llenarArray(){
        int arrayDeNum[]=new int[5];
        int num;
        for(int i=0; i< arrayDeNum.length;i++){
            System.out.println("ingrese los numeros de su arreglo");
            num=scan.nextInt();
            arrayDeNum[i]=num;
        }
        numMayor(arrayDeNum);
    }

    public static int numMayor(int arreglo[]){
        int mayor=0;
        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i]>mayor){
                mayor=arreglo[i];
            }
        }
        System.out.println(mayor);

        return mayor;

    }


}