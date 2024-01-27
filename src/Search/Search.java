/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Search;

import java.util.Random;

/**
 *
 * @author Ronaldo
 */
public class Search {
    public static int arrayLenght=2500;
    
    //To display Array
    public static void printAray(int[] a){
            for(int i=0;i<a.length;++i)
                System.out.print(a[i] +" ");
    }
    
    //Generate Random Array
    public static int[] getIntAray(){
        //Initialze Array and Random Variable
        Random rand = new Random();
        int[] a = new int[arrayLenght];
        
        //Inser Records in Int Array
        for(int i=0;i<a.length;++i)
            a[i]= rand.nextInt(1000);
        
        //Return the Array
        return a;
    }
    
    //Liner Search Logic
    public static void lenearSearch(int[] a , int num){
        long startTime = System.nanoTime();
        boolean found = false;
        for(int i=0;i<a.length;++i)
            if(a[i]==num) found =true;
        
        if(found) System.out.println("Number Found");
        else System.out.println("Number Not Found"); 
        
        long endTime = System.nanoTime();
        long searchTime = endTime - startTime;
        System.out.println("Time taken for Lenear Search :" + searchTime);
    }
    
    //Binary Search Logic
    public static void searchBinary(int[] a, int num){
        long startTime = System.nanoTime();
        boolean found = false;
        int left =0;
        int right = a.length -1;
        
        while(left<=right){
            int mid = (left+right)/2;
            
            if(a[mid] == num) found =true;
            else if(a[mid] < num) left = mid+1;
            else right = mid-1;
        }
        if(found) System.out.println("Number Found");
        else System.out.println("Number Not Found");  
        
        long endTime = System.nanoTime();
        long searchTime = endTime - startTime;
        System.out.println("Time taken for Binary Search :" + searchTime);
    }
    
    //Quick Sort Logic
    
    
    public static void main(String[] args){
        Random rand = new Random();
        int[] a = Search.getIntAray();
        int index = rand.nextInt(arrayLenght);
        int num = a[index];
        //Search.printAray(a);
        System.out.println("Number for Search :" + num);
        Search.lenearSearch(a, num);
        Search.searchBinary(a, num);
    }
}
