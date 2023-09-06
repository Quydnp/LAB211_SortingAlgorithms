/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import Common.SortingAlgorithms;
import Model.Element;
import view.Menu;

/**
 *
 * @author HI
 */
public class SortingProgramming extends Menu<String>{
    static String[] mc = {"Sort", "Exit"};

    protected Library library;
    protected SortingAlgorithms algorithm;
    protected int[] array;
    protected int size_array;

    public SortingProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new SortingAlgorithms();
        size_array = element.getArraySize();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                sort();
                break;
            case 2:
                System.exit(0);
        }
    }

    private void sort() {
        final String[] mcSort = {"Buddle Sort", "Quick Sort", "Exit"};
        class SortMenu extends Menu<String> {

            public SortMenu() {
                super("Sort Option", mcSort);
            }

            @Override
            public void execute(int n) {
                System.out.println("Unsorted array: ");
                library.displayArray(array);
                switch (n) {
                    case 1:
                        algorithm.bubbleSort(array);
                        System.out.println("\nSorted array by Buddle Sort: ");
                        library.displayArray(array);
                        System.out.println("");
                        break;
                    case 2:
                        algorithm.quickSort(array, 0, size_array - 1);
                        System.out.println("\nSorted array by Quick Sort: ");
                        library.displayArray(array);
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SortMenu sm = new SortMenu();
        sm.run();
    }

    
}
