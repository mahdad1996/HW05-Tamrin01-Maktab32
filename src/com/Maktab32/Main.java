package com.Maktab32;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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



        delete(integers);


    }

    public static void main(String[] args) {
	    new Main();
    }

    public void delete(ArrayList<Integer> numbers){
        System.out.println(numbers.toString());
        ArrayList<Integer> newList = new ArrayList<>();

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
        delete.accept(numbers);
        System.out.println(newList.toString());
    }
}
