package ru.mirea.task21;

public class ArrOfAny <T>{

        private T [] arr;

        public T getArrIndex(int i){
            return  arr[i] ;
        }

        public void setArr( T [] arr){
            this.arr =  arr;
        }

        public int getLength(){
            return  arr.length ;
        }
        public String toString(){
            String s="";
            for (T i: arr){
                s =s+ i+" ";
            }
            return s;
        }
        public static void main(String [] args){
            ArrOfAny<String> a = new ArrOfAny<String>();
            a.setArr(new String []{"1", "2", "3", "4", "5"});
            System.out.println(a.toString());

            ArrOfAny<Double> b = new ArrOfAny<Double>();
            b.setArr(new Double[]{12.3,42.5, 2.6, 7.3, 9.75 });
            System.out.println(b.toString());
        }




}
