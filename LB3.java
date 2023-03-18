//Рядок S, у якому всі літери розділені проміжком, та навпаки

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String S;
        S = in.next();
        
        char[] SToArray = S.toCharArray(); 
        for(int i = 0; i < SToArray.length; i++) 
        {
            System.out.print(SToArray[i]+" ");
        } 
        
        System.out.print("\n");
        String result = new StringBuilder(S).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);
    }
}