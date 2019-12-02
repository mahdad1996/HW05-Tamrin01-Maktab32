package com.Maktab32;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public Main(){
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(3);
        integers.add(7);
        integers.add(9);
        integers.add(2);
        integers.add(5);
        integers.add(5);
        integers.add(8);
        integers.add(5);
        integers.add(6);
        integers.add(3);
        integers.add(4);
        integers.add(7);
        integers.add(3);
        integers.add(1);
        integers.add(8);



        deleteByConsumer(integers);




    }

    public static void main(String[] args) {
	    new Main();
    }

    public void deleteByConsumer(ArrayList<Integer> numbers){
        //print array
        System.out.println(numbers.toString());
        ArrayList<Integer> newList = new ArrayList<>();
        //predicate to check array size
        Predicate<ArrayList<Integer>> arrayListPredicate = s->s.size()%2==0;
        boolean result = arrayListPredicate.test(numbers);
        //consumer to check the pair of numbers
        Consumer<ArrayList<Integer>> delete  =
                lst1 -> {
                    for (int i = 0; i < lst1.size();) {
                        if (lst1.get(i) <= lst1.get(i + 1)) {
                            newList.add(lst1.get(i));
                            newList.add(lst1.get(i + 1));
                        }
                        i+=2;
                    }
                };
        //if array size is even then accept consumer
        if(result)
        delete.accept(numbers);
        //if array size is odd then remove last item and accept consumer
        else{
            numbers.remove(numbers.size()-1);
            delete.accept(numbers);
        }


        System.out.println(newList.toString());


    }




}
