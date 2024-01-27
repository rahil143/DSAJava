/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import java.util.Random;

/**
 *
 * @author Ronaldo
 */
public class Sorting {
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
    
    //Logic for BubbleSort
    public static void doBubblesort(int[] a){
        long startTime = System.nanoTime();
        for(int i=0;i<a.length-1;++i){ //n-1
            for(int j=0;j<a.length-(i+1);++j){ // (n-1)*(n-2)
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long searchTime = endTime - startTime;
        System.out.println("Total Time to execute Bubble Sort : "+searchTime);
    }
    
    //Logic For Selection Sort
    public static void doSelectionSort(int[] a){
        long startTime = System.nanoTime();
        for(int i=0;i<a.length-1;++i){ //n-1
            int smallest =i;
            for(int j=i+1;j<a.length;++j){
                if(a[smallest]>a[j]){
                   smallest = j;     
                }
            }
            int temp = a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
        long endTime = System.nanoTime();
        long searchTime = endTime - startTime;
        System.out.println("Total Time to execute Selection Sort: "+searchTime);
    }
    
    //Logic for Insertion Sort
    public static void doInsertionSort(int[] a){
        long startTime = System.nanoTime();
        for(int i=1;i<a.length-1;++i){ //n-1
            int current =a[i];
            int j =i-1;
            while(j>=0 && current >a[j]){
                a[j+1] = a[j];
                j--;
                
                //placement
                a[j+1]=current;
            }
        }
        long endTime = System.nanoTime();
        long searchTime = endTime - startTime;
        System.out.println("Total Time to execute Insertion Sort: "+searchTime);
    }
    
    public static void main(String[] args){
        Random rand = new Random();
        int[] a = Sorting.getIntAray();
        Sorting.doBubblesort(a);
        Sorting.doInsertionSort(a);
        Sorting.doSelectionSort(a);
    }
}
