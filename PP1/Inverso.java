public class Inverso { //Clase

    public static void main(String[] args) { //main
        if (args.length == 0) { // Se agrega para asegurarse que se ponga un valor en la consola
            System.out.println("Uso: java Inverso <numero>"); 
            return; 
        }

        int n = Integer.parseInt(args[0]);
        int invertido = invertir(n);
        System.out.println(n + " -> " + invertido);
    }

    public static int invertir(int n) {
        return invertirAux(n, 0);
    }

    private static int invertirAux(int n, int acumulado) {
        if (n == 0) {
            return acumulado;
        }

        int residuo = n % 10;
        int cociente = n / 10;
        int nuevoAcumulado = acumulado * 10 + residuo;

        return invertirAux(cociente, nuevoAcumulado);
    }
}
