/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author brand
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class Revert {

    public static void main(String[] args) {
        // Crear la pila para los caracteres
        Stack<Character> stack = new Stack<>();

        // Abrir los archivos con try-with-resources
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("output.txt")) {

            int data;
            // Leer cada carácter y ponerlo en la pila
            while ((data = reader.read()) != -1) {
                stack.push((char) data);
            }

            // Sacar los caracteres de la pila y escribirlos en el archivo de salida
            while (!stack.isEmpty()) {
                writer.write(stack.pop());
            }

            System.out.println("Archivo invertido correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
