import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner g=new Scanner(System.in);
        int num=g.nextInt();
        int count=0;
        int res=0;
        System.out.println("Enter a number");
        System.out.println(num);
        while(num!=1)
        {
            if(num%2==0)
            {
                num=num/2;
            }
            else
            {
                num=(3*num)+1;
            }
            count++;
            System.out.println(num);
        }
        System.out.println("count:"+count);
    }
}
