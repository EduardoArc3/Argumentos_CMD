import java.util.ArrayList;
import java.util.List;

public class SumaPrefija { //CLASE SUMA PREFIJA
    public static void main(String[] args) {
        List<Integer> ContadorNumeros //INSTANCIA del main que guarda los numeros en el arraylist
                = new ArrayList<>();
        for (String argumento : args) { //FOR
            boolean numeroValidoOno = true; // declaramos si el numero es valido
            for (int i = 0; i < argumento.length(); i++) {//RECORRER LOS CARACTERES  DEL ARGUMENTO DEL CMD
                if (!Character.isDigit(argumento.charAt(i)) && (i != 0 || argumento.charAt(i) != '-')) { //verificar si es un digito
                    numeroValidoOno = //ARGUMENTO FALSEANDO
                            false;
                    break;
                }
            }
            if (numeroValidoOno) {//ARGUMENTO
                ContadorNumeros.add(Integer.parseInt(argumento));
            } else {
                //ERROR
                System.out.println("Estas equivocado: " + argumento + " este no es un numero correcto");
            }
        } //nUMEROS VALIDOS
        System.out.println("Numeros chilos permitidos: ");
        for (int numero : ContadorNumeros) {
            System.out.println(numero);


        }
        //AQUÍ SE CALCULA LA SUMA PREFIJA
        System.out.println("Suma Prefija:");
        int suma = 0;
        for (int i = 0; i <ContadorNumeros.size(); i++) {
            suma+= ContadorNumeros.get(i);//CALCULAR LA SUMA PREFIJA  HASTA LA POSICION ACTUAL
            System.out.println("Sumaaa" + i + ": "+ suma);
            
        }

    }
}