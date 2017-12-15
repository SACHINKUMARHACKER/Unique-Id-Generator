
/**
 * Write a description of class Solution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Solution
{   char[] Arr;
    char[] Arr1;
    String arr1;
    void Name(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String arr = scan.next();
        arr = arr.toLowerCase();
         Arr = arr.toCharArray();
        
    }
    void Gen1(){
        Arr1 = new char[Arr.length];
    }
    void Gen(){
        for(int i = 0; i<Arr.length;i++){
            switch(Arr[i]){
            case 'a': Arr1[i]='c';break;
            case 'b': Arr1[i]='d';break;
            case 'c': Arr1[i]='e';break;
            case 'd': Arr1[i]='f';break;
            case 'e': Arr1[i]='g';break;
            case 'f': Arr1[i]='h';break;
            case 'g': Arr1[i]='i';break;
            case 'h': Arr1[i]='j';break;
            case 'i': Arr1[i]='k';break;
            case 'j': Arr1[i]='l';break;
            case 'k': Arr1[i]='m';break;
            case 'l': Arr1[i]='n';break;
            case 'm': Arr1[i]='o';break;
            case 'n': Arr1[i]='p';break;
            case 'o': Arr1[i]='q';break;
            case 'p': Arr1[i]='r';break;
            case 'q': Arr1[i]='s';break;
            case 'r': Arr1[i]='t';break;
            case 's': Arr1[i]='u';break;
            case 't': Arr1[i]='v';break;
            case 'u': Arr1[i]='w';break;
            case 'v': Arr1[i]='x';break;
            case 'w': Arr1[i]='y';break;
            case 'x': Arr1[i]='z';break;
            case 'y': Arr1[i]='a';break;
            case 'z': Arr1[i]='b';break;
            }
            arr1 = Arr1.toString();
            
        }
    }
    void Sys(){
     System.out.println("Your Unique Id is "+arr1);
    }
    public static void main(String arg[]){
        Solution obj = new Solution();
        obj.Name();
        obj.Gen1();
        obj.Gen();
        obj.Sys();
       
    
    }
}
