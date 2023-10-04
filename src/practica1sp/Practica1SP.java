package practica1sp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica1SP {

    public static BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    // Regresa UN double y recibe un double como parámetro
    public static double calcularPromedioGrupo(double[] p){
        double suma = 0;
        for(int i = 0; i < p.length; i++)
            suma = suma + p[i];
        
        return suma / p.length;
    }
    
    // Método que regresa un arreglo de double y recibe un parámetro entero
    public static double leerPromedios(int n, String salon) throws IOException{
        double[] proms = new double[n];
        System.out.println("Introducción de los promedios individuales de cada estudiante de " + salon + ".");
        for(int i = 0; i < n; i++){
            System.out.println("Escribe el promedio de estudiante con el ID " + (i+1) + ": ");
            entrada = bufer.readLine();
            proms[i] = Double.parseDouble(entrada);
        }
        
        return calcularPromedioGrupo(proms); // Regresa todos los elementos del arreglo proms
    }
    
    // Método que no regresa valores y recibe un arreglo
    public static void imprimirPromedios(double[] proms){
        int i=0;
        System.out.println("Promedios de los 5 salones");
        System.out.println("IDAlumno       Promedio Individual");
        System.out.println("------------------------------------");
        for(double prom: proms){ // for extendido
            System.out.println("     " + i + "          " + prom);
            i++;
        }
    }
    
    public static void main(String[] args) throws IOException {
        int t;
        System.out.println("Escribe el tamaño del salon 1A: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        double Salon1A = leerPromedios(t, "1A");
        System.out.println("El promedio de este grupo es: " + Salon1A);
        System.out.println("");
        System.out.println("Escribe el tamaño del salon 1B: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        double Salon1B = leerPromedios(t, "1B");
        System.out.println("El promedio de este grupo es: " + Salon1B);
        System.out.println("");
        System.out.println("Escribe el tamaño del salon 4A: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        double Salon4A = leerPromedios(t, "4A");
        System.out.println("El promedio de este grupo es: " + Salon4A);
        System.out.println("");
        System.out.println("Escribe el tamaño del salon 4B: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        double Salon4B = leerPromedios(t, "4B");
        System.out.println("El promedio de este grupo es: " + Salon4B);
        System.out.println("");
        System.out.println("Escribe el tamaño del salon 4C: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);
        double Salon4C = leerPromedios(t, "4C");
        System.out.println("El promedio de este grupo es: " + Salon4C);
        
        double[] promedios = {Salon1A, Salon1B, Salon4A, Salon4B, Salon4C};
        
        System.out.println("El promedio general es: " + calcularPromedioGrupo(promedios));
    }
    
}
