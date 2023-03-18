/*Клас повинен мати методи:
- відображення масиву на екран
- визначення мінімального та максимального елементів (серед значень функції)
- відображення на екрані мінімального та максимального елементів (серед значень функції)
- визначення суми та С.А. елементів (значень функції)
- відображення на екрані суми та С.А. елементів (значень функції)
- сортування масиву одним з методів
*/

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class LB4{
    
    public static void main(String[] args) {

        Masiv masiv = new Masiv(); // создание объекта
        System.out.println("Масив 1:");
        masiv.displayInfo();
        System.out.println('\n'+"Масив 2:");
        masiv.display(4, 6);
        System.out.println('\n'+"Масив 3:");
        masiv.displayMinMax();
        System.out.println('\n'+"Сортування масиву:");
        masiv.displaysort();
    }
}
class Masiv{
	int[][] vv;
	int x;
	int y;
    void displayInfo()
    {
    	this.vv = new int [5][5];
	    for (x = 0; x < vv.length; x++)
        {
            for (y = 0; y < vv.length; y++)
            {
            	vv[x][y] = ((int)(Math.random()*15));
                System.out.println(vv[x][y]);
            }
        }
    }
    void display(int a, int b)
    {
    	this.vv = new int [5][5];
	    for (x = 0; x < vv.length; x++)
        {
            for (y = 0; y < vv.length; y++)
            {
            	vv[x][y] = ((int)(Math.random()*15));
            	double rez1 = Math.sqrt(x + b - a) + Math.log10(y);
		        double rez2 = Math.atan(b + a);
		        double K = rez1 / rez2;
		        if (x < 0)
		        {
		            if (y < 0)
		            {
		                System.out.println("["+x+"]["+y+"]="+'0');
		            }
		        }
		        else 
		        {
		            System.out.println("["+x+"]["+y+"]="+K);
		        }
            }
        }
    }
    void displayMinMax()
    {
        int min = vv[0][0];
        int max = vv[0][0];
        
        for(int x = 0; x < vv.length; x++){
            for(int y = 0; y < vv[0].length; y++){
                if(min > vv[x][y]){
                    min = vv[x][y]; 
                }
                if(max < vv[x][y]){
                    max = vv[x][y];  
                }
            } 
            System.out.print("Максимальний елемент "+max+" Мінімальний елемент "+min+" \n");  
        }
    }
    void displaysort()
    {
    	for ( x = 0; x < vv.length; ++x ) {
            for ( y = 0; y < vv[x].length; ++y ) {
                int lastC = y + 1;
                for ( int lastR = x; lastR < vv.length; ++lastR ) {
                    while ( lastC < vv[lastR].length) {
                        if ( vv[lastR][lastC] < vv[x][y] ) {
                            int tmp = vv[x][y];
                            vv[x][y] = vv[lastR][lastC];
                            vv[lastR][lastC] = tmp;
                        }
                        ++lastC;
                    }
                    lastC = 0;
                }
            }
        }
        
        for ( int i = 0; i < vv.length; ++i )
            System.out.println(java.util.Arrays.toString(vv[i]));
    }
}