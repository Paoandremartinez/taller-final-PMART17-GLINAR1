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
                    System.out.println("******************************************************************");
                    System.out.println("*******              1. DATOS PRIMITIVOS                   *******");
                    System.out.println("******************************************************************");
                    System.out.println("******************************************************************");
                    System.out.println("*     1. Explicación byte.                                       *");
                    System.out.println("*     2. Explicación short.                                      *");
                    System.out.println("*     3. Explicación int                                         *");
                    System.out.println("*     4. Explicación long                                        *");
                    System.out.println("*     5. Explicación float                                       *");
                    System.out.println("*     6. Explicación double                                      *");
                    System.out.println("*     7. Explicación char                                        *");
                    System.out.println("*     8. Explicación bolean                                      *");
                    System.out.println("*     9. Salir                                                   *");
                    System.out.println("*                                                                *");
                    System.out.println("******************************************************************");
                    break;
                case 2:
                    System.out.println("******************************************************************");
                    System.out.println("*******                  2. STRING                      **********");
                    System.out.println("******************************************************************");
                    System.out.println("******************************************************************");
                    System.out.println("* El tipo de dato String es una clase que representa cadenas de  *");
                    System.out.println("* caracteres y se utiliza ampliamente en aplicaciones para       *");
                    System.out.println("* almacenar y manipular texto. En Java, una cadena de texto se   *");
                    System.out.println("* define utilizando comillas dobles (\" \") alrededor del texto    *");
                    System.out.println("*                                                                *");
                    System.out.println("* String mensaje=\"hi you\"se inicializa la variable               *");
                    System.out.println("* String nombre= new String (\"Juan\"); usando constructor         *");
                    System.out.println("*                                                                *");
                    System.out.println("****************************************************************\n");
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("******************************************************************");
                    System.out.println("*******          4. TIPO OPERADORES                        *******");
                    System.out.println("******************************************************************");
                    System.out.println("******************************************************************");
                    System.out.println("*                                                                *");
                    System.out.println("*  1. Aritmeticos                                                *");
                    System.out.println("*  2. Relacionales                                               *");
                    System.out.println("*  3. Logicos                                                    *");
                    System.out.println("*  4. Asignación                                                 *");
                    System.out.println("*  5. Incremento / Decremento                                    *");
                    System.out.println("*                                                                *");
                    System.out.println("******************************************************************");

                    int opc4 = scannerMainFirst.nextInt();
                    switch (opc4)
                    {
                        case 1:
                            System.out.println("******************************************************************");
                            System.out.println("*******            1. ARITMETICOS                       **********");
                            System.out.println("******************************************************************");
                            System.out.println("******************************************************************");
                            break;
                        case 2:
                            System.out.println("******************************************************************");
                            System.out.println("*******            2. RELACIONALES                      **********");
                            System.out.println("******************************************************************");
                            System.out.println("******************************************************************");

                            break;
                        case 3:
                            System.out.println("******************************************************************");
                            System.out.println("*******            3. LOGICOS                           **********");
                            System.out.println("******************************************************************");
                            System.out.println("******************************************************************");

                            break;
                        case 4:
                            System.out.println("******************************************************************");
                            System.out.println("*******            4. ASIGNACIÓN                        **********");
                            System.out.println("******************************************************************");
                            System.out.println("******************************************************************");

                            break;
                        case 5:
                            System.out.println("******************************************************************");
                            System.out.println("*******         5. INCREMENTO / DECREMENTO              **********");
                            System.out.println("******************************************************************");
                            System.out.println("******************************************************************");

                            break;

                    }

                    System.out.println();
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