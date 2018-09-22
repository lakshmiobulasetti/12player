import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
	
          class NewClass3
          {

 public static void main (String args[])
 {

 int a [] = {1,2,3};

 int temp ;

 for(int i = 0; i<a.length -1; i++)
 {

     temp = a[i];
     a[i] = a[i+1];
     a[i+1] = temp;

 }

 for(int p : a)
 System.out.print(p);
 }

}
	
