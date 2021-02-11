package DZ3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //TaskOne
        Integer[] arr1={5, 4, 3, 2, 1};
        swap(arr1, 1, 3);

        //TaskTwo
        System.out.println("Task Two");
        Box<Orange> orange1=new Box<>();
        Box<Orange> orange2=new Box<>();
        Box<Apple> apple1=new Box<>();
        Box<Apple> apple2=new Box<>();

        orange1.addFruit(new Orange(), 6);
        orange2.addFruit(new Orange(), 6);
        apple1.addFruit(new Apple(), 9);
        apple2.addFruit(new Apple(), 5);

        System.out.println("First box orange: " + orange1.getWeight());
        System.out.println("Second box orange: " + orange2.getWeight());
        System.out.println("First box apple: " + apple1.getWeight());
        System.out.println("Second box apple: " + apple2.getWeight());
        System.out.println();

        System.out.println("Compare(): ");
        System.out.println("First box orange equals First box apple: " + orange1.compare(apple1));
        System.out.println("Second box orange equals Second box apple: " + orange2.compare(apple2));

        orange1.pour(orange2);
        apple1.pour(apple2);
        System.out.println();
        System.out.println("GetWeight(): ");
        System.out.println("First box orange : " + orange1.getWeight());
        System.out.println("Second box orange: " + orange2.getWeight());
        System.out.println("First box apple: " + apple1.getWeight());
        System.out.println("Second box apple: " + apple2.getWeight());
    }

    public static void swap(Object[] arr, int n1, int n2) {
        System.out.println();
        System.out.println("Task One: " + Arrays.toString(arr));
        Object change=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=change;
        System.out.println("The result of the transfers: " + Arrays.toString(arr));
        System.out.println();
    }

}
