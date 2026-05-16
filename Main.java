import java.util.ArrayList;
import java.util.Arrays;

import java.util.Iterator;
public class Main{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("ABDUL","MALIK","King"));
        ArrayList<Integer> numbers = new ArrayList<Integer> (Arrays.asList(12,13,14,15));
        System.out.println(arrayList);
        System.out.println(numbers);
        numbers.add(123);
        System.out.println("after appending: " + numbers);
        numbers.add(3,2000);
        System.out.println(numbers);
        numbers.add(6,2003);
        System.out.println(numbers);
        arrayList.add(0,"URuza");
        System.out.println(arrayList);
        int result=numbers.get(0);
        System.out.println(result);
        System.out.println(numbers.size()); //to find the length of arrayList
         for(int i=0;i<numbers.size();i++){
            System.out.println("traversal using for loop: " + numbers.get(i));
         }

         for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
         }


         //traversal using for-each loop 

         for(int num:numbers){
            System.out.println(" for each loop: " + num);
         }
         for(String str: arrayList){
            System.out.println(" string: " + str);
         }

         //traversal using iterator 

         Iterator<Integer> ite = numbers.iterator();
         while(ite.hasNext()){
            Integer num=ite.next();
            System.out.println(num);
         }

         //searching the elments 
         for(String arr:arrayList){
            if(arr.equals("MALIK")){
                System.out.println("element is found ");
                break;
            }
         }
    }
}