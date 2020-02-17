import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class MainQuick {
    
    public static void main(String[] args) throws IOException {
        
        Quick qui = new Quick();
        FileWriter writer = new FileWriter("Numeros.txt");
		PrintWriter emptier = new PrintWriter("Numeros.txt");
		emptier.write("");
		emptier.close();
		Random randomizer = new Random();
		String cadena = "";
		//Se genera la lista aleatoria
		int inicio = 0;
		//se generan 3000 numeros
		while (inicio <= 9){
			//los numeros se generan de 0 a 9
			int min = 0;
			int max = 9;
			int randomnum = randomizer.nextInt((max - min)+1)+min;
			cadena = cadena + randomnum;
			inicio += 1;
		}
		
		writer.write(cadena);
		writer.close();
		
        BufferedReader reader = new BufferedReader(new FileReader("Numeros.txt"));
		String numeros = reader.readLine();
		System.out.println(numeros);
		//se almacenan los numeros en lista
		int[] data = new int[10];
		numeros.split(" ");
		
		int i = 0;
		int f = 1;
		while(i < (numeros.length()-1)){
			int a = Integer.parseInt(numeros.substring(i,f));
			f++;
			data[i] = a;
			i++;	
		}
        qui.quickSort(data, 0,9);
        for (int element: data) 
        {
           System.out.println(element);
        }
    }
}
