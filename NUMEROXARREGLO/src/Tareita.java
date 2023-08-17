import java.util.HashSet;
import java.util.Set;

public class Tareita {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] A = new int[args.length - 1]; // CREAR UN ARREGLO []A DE ENTEROS

        //llenar el arreglo con los numeros del argumento
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(args[i + 1]);
        }
        //Aqui se imprime el arreglo
        System.out.print("El arreglo A[] es: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        //Verfica si existen un par de numeros en el arreglo, que la suma sea igual a x
        if (hasSumPair(A, x)) {
            System.out.println("\nSi existen dos elementos cuya suma sea exactamente igual a x"); //Existe
        } else {
            System.out.println("\nNo existen dos elementos cuya suma sea exactamente igual a x");//Noexiste
        }
    }
        //verificacion
    public static boolean hasSumPair(int[] numeros, int ObjetivoSuma) {
        Set<Integer> numerosvistos = new HashSet<>(); //Conjunto para almacenar numeros vistos

        for (int num1 : numeros) {
            int complemento = ObjetivoSuma - num1;//complement
            //Si se encuentra en el conjunto, entonces existe un par
            if (numerosvistos.contains(complemento)) {
                return true;
            }
            numerosvistos.add(num1); //agregar el numero
        }

        return false;//No se encontro nada
    }
}
