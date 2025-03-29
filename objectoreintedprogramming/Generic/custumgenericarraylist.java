package objectoreintedprogramming.Generic;

import java.util.Arrays;

public class custumgenericarraylist <T>{


        private Object[] data;
        private static int  DEFAULT_SIZE = 10;
        private int size =0;

        public custumgenericarraylist(){
            this.data = new Object[DEFAULT_SIZE];

        }
        public void add(T num ){
            if(isfull()){
                resize();
            }
            data[size++] = num;
        }

        private void resize() {
            Object[] temp = new Object[data.length * 2];

            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[i];
            }
            data=temp;
        }

        private boolean isfull() {
            return size == data.length;
        }

        public T remove(){
            T removed =  (T) data[--size];//CASTED
            return removed;
            //here we are not actually deleting data we are just decreasing the size
        }

        public T get(int index){
            return (T)data[index];
        }

        public void set(int index , T value){
            data[index] = value;
        }

        @Override
        public String toString() {
            return "custumgenericarraylist{" +
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
//            for (int i = 0; i <12 ; i++) {
//                list.add(2*i);
//            }
//            System.out.println(list);
//here the problem arise is only integer type arraylist is created whereas arraylist can be made for many things such as strings etc
            //to solve this problem we can use generics

            custumgenericarraylist<Integer> list1 = new custumgenericarraylist<>();
            for (int i = 0; i <12 ; i++) {
               list.add(2*i);
            }
            System.out.println(list);

        }
    }


