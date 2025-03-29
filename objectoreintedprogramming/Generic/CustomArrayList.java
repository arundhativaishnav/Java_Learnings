package objectoreintedprogramming.Generic;

import java.util.ArrayList;
import java.util.Arrays;
//here we have created custom arraylist by using oop

public class CustomArrayList {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size =0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];

    }
    public void add(int num ){
        if(isfull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data=temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
        //here we are not actually deleting data we are just decreasing the size
    }

    public int get(int index){
       return data[index];
    }

    public void set(int index , int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(6);
//        list.add(9);
        for (int i = 0; i <12 ; i++) {
            list.add(2*i);
        }
        System.out.println(list);
//here the problem arise is only integer type arraylist is created whereas arraylist can be made for many things such as strings etc
   //to solve this problem we can use generics
    }
}
