package ec.edu.vista;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
     //Aplicacion.metodoA();
     //System.out.println("NUMERO RANDOMICO\n"+metodoA());
        Scanner entrada = new Scanner(System.in);
     int v=0; int h=1;
        while(v!=h)
        {  
            System.out.println("MENU\n"
                    + "1-VALIDAR NUMEROS PAR/IMPAR\n"
                    + "2-NUMERO FACTORIAL\n"
                    + "3-NUMERO RANDOMICOS\n"                    
                    + "4-SALIR\n"
                    + "5-EJEMPLO POTENCIA LIBRO");         
       int op= entrada.nextInt();   
       switch(op)
               {
             case 1: validarpares();
             break;
             case 2: factorial();
             break;             
             case 3: metodoA();
             break;
             case 4: v++;             
             break;
             case 5:potencia();
             break;
             default :  
             break;/* break; */
            }
                    
        
        
        } v--;     
    }
    public  static int metodoA()
    { //return 5;
    return (int) (Math.random()*100) ;
    }
    public void metodoB(){
    System.out.println("ESTUDIEN");
    }
    public static void validarpares(){
        int x=metodoA();
    if(x%2==0){System.out.println(x+"\tES PAR");}
    else{System.out.println(x+"\tES IMPAR");}
    }
    public static void factorial(){
    int x=metodoA();
    int acum= 1;
     for (int i=1;i<=x;i++)
         acum*=i;
    System.out.println(acum+"\tES el factorial de "+x);     
    }
    public static void potencia()
    { int r,e; int n=0;int p;
    Scanner entrada = new Scanner(System.in);
    System.out.println("INGRESE NUMERO A POTENCIAR ");
    n=entrada.nextInt();
    System.out.println("INGRESE ELEVACION DE POTENCIA PAG 18");
    p=entrada.nextInt();
    e=p; r=1;
    for(;p>0;p--)
        r=r*n;
    System.out.println("Potencia de:"+n+"¨"+e+"="+r);
        
    }
    
}
