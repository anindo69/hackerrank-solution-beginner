//link to this problem is here :: "https://hackerrank-challenge-pdfs.s3.amazonaws.com/14556-java-int-to-string-English?AWSAccessKeyId=AKIAR6O7GJNX5DNFO3PV&Expires=1614756242&Signature=UC%2FKnf5YvL9e%2BlilcwsiUvJ746I%3D&response-content-disposition=inline%3B%20filename%3Djava-int-to-string-English.pdf&response-content-type=application%2Fpdf"
import java.util.Scanner;
import java.security.*;
public class solution {
public static void main(String[] args) {


 
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below

       String s = String.valueOf(n);// here we can also solve this in two ways // u can use these two approach also;
                                     //no 1 is : String s = ""+n; it adds the int value 
                                    //no 2 is : string s = n+""; same.

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
 }
}  


