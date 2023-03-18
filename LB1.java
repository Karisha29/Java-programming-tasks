//Цільова величина або елементи масиву чи їх номери номери тих елементів масиву, які менші від С.А. всіх елементів (у рядку зі значеннями функції)
//Метод сортування бульбашки
//Напрям сортування за спаданням
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Main {
	
public static void main(String[] args) {
    int [] vv =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		double n = 7;
		double K;
		int x;
		int tmp;
		double b = 4;
		double a = 6;
		double y = 2;
		
		for (x=0; x<vv.length; x++){
		    vv[x]=(int)(Math.random());
		}
		System.out.println("Вхідний масив:");
		
		for (x=0; x<vv.length; x++){
		    double rez1 = Math.sqrt(x + b - a) + Math.log10(y);
		    double rez2 = Math.atan(b + a);
		    K = rez1 / rez2;
		    if (x < 0) {
		        System.out.println("["+x+"]=0");
		    } else {
		        System.out.println("["+x+"]="+K);
		    }
		}
		
		double rez1 = Math.sqrt(x + b - a) + Math.log10(y);
		double rez2 = Math.atan(b + a);
		double f = rez1 / rez2;
		
		System.out.println("Сортування масиву:");
		boolean isSorted = false;
        int buf;
        while(!isSorted)   {
            isSorted = true;
            for (x=0; x<vv.length-1; x++)   {
                
		    if (f < 0)
                if(vv[x] > vv[x+1]) {
                    isSorted = false;
                    buf = vv[x];
                    vv[x] = vv[x+1];
                    vv[x+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(vv));    
    }
}