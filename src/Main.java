import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerMainFirst = new Scanner(System.in);

        int opcion = 0;
        do {

            System.out.println("******************************************************");
            System.out.println("*******        TALLER PRE-HACKATON          **********");
            System.out.println("*******     GERSAIN LINARES - GLINAR1       **********");
            System.out.println("*******    PAOLA A. MARTINEZ - PMART17      **********");
            System.out.println("******************************************************");
            System.out.println("******************************************************");
            System.out.println("**                                                  **");
            System.out.println("**    1. Datos primitivos                           **");
            System.out.println("**    2. String                                     **");
            System.out.println("**    3. Constantes                                 **");
            System.out.println("**    4. Tipos de Operadores                        **");
            System.out.println("**    5. Condicional IF, ELSE IF, ELSE              **");
            System.out.println("**    6. Condicional Switch                         **");
            System.out.println("**    7. Condicional Ternaria                       **");
            System.out.println("**    8. Bucle DO WHILE                             **");
            System.out.println("**    9. Bucle WHILE                                **");
            System.out.println("**   10. Bucle FOR                                  **");
            System.out.println("**    0. Salir                                      **");
            System.out.println("******************************************************");
            //el usuario ingresa la opcion
            System.out.println("Por favor digita tu mejor opción:  ");

            while (!scannerMainFirst.hasNextInt())
            {
                System.out.println("Por favor digita una opción valida");
                scannerMainFirst.next();
                System.out.println("Ingresa la opción");
            }
            opcion = scannerMainFirst.nextInt();

            ///se ingresa al menú seleccionado por el usuario

            switch (opcion)
            {
                case 1:
                    System.out.println("******************************************************");
                    System.out.println("****************** DATOS PRIMITIVOS ******************\n");
                    System.out.println("**     01. Explicación byte.                        **");
                    System.out.println("**     02. Explicación short.                       **");
                    System.out.println("**     03. Explicación int                          **");
                    System.out.println("**     04. Explicación long                         **");
                    System.out.println("**     05. Explicación float                        **");
                    System.out.println("**     06. Explicación double                       **");
                    System.out.println("**     07. Explicación char                         **");
                    System.out.println("**     08. Explicación bolean                       **");
                    System.out.println("**     09. Salir                                    **");
                    System.out.println("******************************************************\n");
                    break;

                case 2:
                    System.out.println("******************************************************************");
                    System.out.println("*******                     STRING                      **********");
                    System.out.println("******************************************************************");
                    System.out.println("******************************************************************");
                    System.out.println("* El String es un objeto el cual nos permite                     *");
                    System.out.println("* almacenar muchos caracteres,te mostramos                       *");
                    System.out.println("* ejemplos del string                                            *");
                    System.out.println("* String mensaje=\"hi you\"se inicializa la variable             *");
                    System.out.println("* String nombre= new String (\"Juan\"); usando constructor       *");
                    System.out.println("*                      **");
                    System.out.println("****************************************************************\n");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    break;
            }





 /*

*/
        }
        while (opcion!=0);
    }
}