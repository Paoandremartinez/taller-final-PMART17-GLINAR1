import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerMainFirst = new Scanner(System.in);

        int opcion = 0;
        int opc4 = 0;
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
                    System.out.println("Por favor digita tu mejor opción:  ");
                    break;

                case 2:
                    System.out.println("******************************************************************");
                    System.out.println("*******                  2. STRING                      **********");
                    System.out.println("******************************************************************");
                    System.out.println("******************************************************************");
                    System.out.println("* El tipo de dato String es una clase que representa cadenas de  *");
                    System.out.println("* caracteres y se utiliza ampliamente en aplicaciones para       *");
                    System.out.println("* almacenar y manipular texto. En Java, una cadena de texto se   *");
                    System.out.println("* define utilizando comillas dobles (\" \") alrededor del texto  *");
                    System.out.println("*                                                                *");
                    System.out.println("* String mensaje=\"hi you\"se inicializa la variable             *");
                    System.out.println("* String nombre= new String (\"Juan\"); usando constructor       *");
                    System.out.println("*                                                                *");
                    System.out.println("******************************************************************");
                    break;
                case 3:
                    break;
                case 4:
                    do {
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
                    System.out.println("*  6. Volver al menú unicial                                     *");
                    System.out.println("*                                                                *");
                    System.out.println("******************************************************************");
                    System.out.println("Por favor digita tu mejor opción:  ");
                    opc4 = scannerMainFirst.nextInt();


                        switch (opc4) {

                              case 1:

                                  System.out.println("*******************************************************************");
                                  System.out.println("*******             1. ARITMETICOS                       **********");
                                  System.out.println("*******************************************************************");
                                  System.out.println("* Operador ||           Ejemplo      ||            Detalle        *");
                                  System.out.println("*--------------------------------------_--------------------------*");
                                  System.out.println("*    +     || int suma= 5+3;         || Suma dos operandos.       *");
                                  System.out.println("*          ||                        || Resultado: 8              *");
                                  System.out.println("*-------------------------------------_---------------------------*");
                                  System.out.println("*    -     || int suma= 5-3;         || Resta el segundo operando *");
                                  System.out.println("*          ||                        || del primero. Resultado: 2 *");
                                  System.out.println("*-----------------------------------------------------------------*");
                                  System.out.println("*    *     || int multiplicación 5*3;|| Multiplica dos operadores *");
                                  System.out.println("*          ||                        || Resultado: 15             *");
                                  System.out.println("*-----------------------------------------------------------------*");
                                  System.out.println("*    /     || int división= 6/3;     || Divide el primer operando *");
                                  System.out.println("*          ||                        || por el segundo Resultado:2*");
                                  System.out.println("*-----------------------------------------------------------------*");
                                  System.out.println("*     %    || int modulo = 5 % 3 ;   || Devuelve el resto de la   *");
                                  System.out.println("*          ||                        || división del primer       *");
                                  System.out.println("*          ||                        || operando por el segundo   *");
                                  System.out.println("*          ||                        || Resultado: 2              *");
                                  System.out.println("*-----------------------------------------------------------------*");
                                  break;
                              case 2:
                                  System.out.println("******************************************************************");
                                  System.out.println("*******            2. RELACIONALES                      **********");
                                  System.out.println("******************************************************************");
                                  System.out.println("* Operador  ||           Ejemplo     ||           Detalle        *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    ==     || bolean igual (5==3);  || Comprueba si los valores *");
                                  System.out.println("*           ||                       || de dos operandos son =   *");
                                  System.out.println("*           ||                       || Resultado: False         *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    !=     || bolean NO es = (5!=3);|| Comprueba si los valores *");
                                  System.out.println("*           ||                       || de dos operandos no son  *");
                                  System.out.println("*           ||                       || iguales Resultado: true  *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    >      || bolean mayor = (5>3); || Comprueba si el valor    *");
                                  System.out.println("*           ||                       || del primer operando es   *");
                                  System.out.println("*           ||                       || mayor que el segundo     *");
                                  System.out.println("*           ||                       || Resultado: True          *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    <      || bolean menor = (5<3); || Comprueba si el valor    *");
                                  System.out.println("*           ||                       || del primer operando es   *");
                                  System.out.println("*           ||                       || menor que el segundo     *");
                                  System.out.println("*           ||                       || Resultado: False         *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*   >=      || bolean mayor 0 igual  || Comprueba si el valor    *");
                                  System.out.println("*           || = (5>=3);             || del primer operando es   *");
                                  System.out.println("*           ||                       || mayor o igual que el se- *");
                                  System.out.println("*           ||                       || gundo Resultado: True    *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*   <=      || bolean menor 0 igual  || Comprueba si el valor    *");
                                  System.out.println("*           || = (5<=3);             || del primer operando es   *");
                                  System.out.println("*           ||                       || menor o igual que el se- *");
                                  System.out.println("*           ||                       || gundo Resultado: False   *");
                                  System.out.println("******************************************************************");

                                  break;
                              case 3:
                                  System.out.println("******************************************************************");
                                  System.out.println("*******                  3. LOGICOS                     **********");
                                  System.out.println("******************************************************************");
                                  System.out.println("* Operador  ||           Ejemplo     ||           Detalle        *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    &&     || bolean resultado      || Devuelve true si ambos   *");
                                  System.out.println("*           || =(5>3 && 3<4);        || operandos son True       *");
                                  System.out.println("*           ||                       || Resultado: True          *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    ||     || bolean resultado      || Devuelve true si al menos*");
                                  System.out.println("*           || =(5>3 || 3<4);        || una de ellas es tru      *");
                                  System.out.println("*           ||                       || Resultado: true          *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    !      || bolean resultado      || Invierte el valor de un  *");
                                  System.out.println("*           || =!(5>3);              || operando booleano.       *");
                                  System.out.println("*           ||                       || Resultado: False         *");
                                  System.out.println("******************************************************************");

                                  break;
                              case 4:
                                  System.out.println("******************************************************************");
                                  System.out.println("*******            4. ASIGNACIÓN                        **********");
                                  System.out.println("******************************************************************");
                                  System.out.println("* Operador  ||           Ejemplo     ||           Detalle        *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    =      || int a=5;              || Asigna el valor del      *");
                                  System.out.println("*           ||                       || operando derecho al ope- *");
                                  System.out.println("*           ||                       || rando izquierdo          *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    +=     || int a=5; a+=3;        || Suma el operando derecho *");
                                  System.out.println("*           ||                       || al operando izquierdo y  *");
                                  System.out.println("*           ||                       || asigna el resultado al   *");
                                  System.out.println("*           ||                       || operando izquierdo. Res 8*");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    -=     || int a=5; a-=3;        || Resta el operando derecho*");
                                  System.out.println("*           ||                       || del operando izquierdo y *");
                                  System.out.println("*           ||                       || asigna el resultado al   *");
                                  System.out.println("*           ||                       || operando izquierdo. Res 2*");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    *=     || int a=5; a*=3;        || Multiplica el operando   *");
                                  System.out.println("*           ||                       || derecho por el operando  *");
                                  System.out.println("*           ||                       || izquierdo y asigna el re-*");
                                  System.out.println("*           ||                       || sultado al operando      *");
                                  System.out.println("*           ||                       || izquierdo. Resultado 15  *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    /=     || int a=6; a/=3;        || Divide el operando       *");
                                  System.out.println("*           ||                       || izquierdo por el operando*");
                                  System.out.println("*           ||                       || derecho y asigna el      *");
                                  System.out.println("*           ||                       || resultado al operando    *");
                                  System.out.println("*           ||                       || izquierdo. Resultado 2   *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    %=     || int a=5; a%=3;        || Calcula el módulo del    *");
                                  System.out.println("*           ||                       || operando izquierdo por el*");
                                  System.out.println("*           ||                       || operando derecho y asigna*");
                                  System.out.println("*           ||                       || el resultado al operando *");
                                  System.out.println("*           ||                       || izquierdo. Resultado 2   *");
                                  System.out.println("******************************************************************");
                                  break;

                              case 5:
                                  System.out.println("******************************************************************");
                                  System.out.println("*******         5. INCREMENTO / DECREMENTO              **********");
                                  System.out.println("******************************************************************");
                                  System.out.println("* Operador  ||           Ejemplo     ||           Detalle        *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    ++     || int a=5; a++;         || Incrementa el valor del  *");
                                  System.out.println("*           ||                       || operando en 1.           *");
                                  System.out.println("*           ||                       || Resultado: 6             *");
                                  System.out.println("*----------------------------------------------------------------*");
                                  System.out.println("*    --     || int a=5; a--;         || Decrementa el valor del  *");
                                  System.out.println("*           ||                       || operando en 1.           *");
                                  System.out.println("*           ||                       || Resultado: 4             *");
                                  System.out.println("******************************************************************");
                              break;
                              default:
                                if
                                (opc4 == 6) {
                                    System.out.println("Si quieres volver al menú Principal presiona enter");
                                    scannerMainFirst.nextLine();
                                    scannerMainFirst.nextLine();

                                }



                          }
                          /*while (!scannerMainFirst.hasNextInt());
                          {
                              System.out.println("Por favor digita una opción valida");
                              scannerMainFirst.next();
                              System.out.println("Ingresa la opción");
                          }*/
                       //   opc4 = scannerMainFirst.nextInt();



                        }while (opc4 != 6);
                   break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:/*
                    System.out.println("******************************************************************");
                    System.out.println("*******             7. TERNARIA                            *******");
                    System.out.println("******************************************************************");
                    System.out.println("******************************************************************");
                    System.out.println("*                                                                *");
                    System.out.println("*  1. Explicación de Ternaria                                    *");
                    System.out.println("*  2. Programa de Ternaria                                       *");
                    System.out.println("*  3. Volver menú inicial                                        *");
                    System.out.println("*                                                                *");
                    System.out.println("******************************************************************");
                    System.out.println("Por favor digita tu mejor opción:  ");
                    int opc7 = scannerMainFirst.nextInt();
                    do{
                    switch (opc7)
                    {
                        case 1;
                        break;

                    }
                    }
                    while*/

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
        while (opcion!=3);
        scannerMainFirst.close();
    }
}