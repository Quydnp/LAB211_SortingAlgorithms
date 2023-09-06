
import Common.Library;
import Common.SortingAlgorithms;
import Controller.SortingProgramming;
import Model.Element;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HI
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setArraySize(library.getIntData("Enter number of elements in the array: ", 1, 100));
        //2. Create array by generate random integer in range
        element.getRandomArray(0, 100);
        new SortingProgramming(element).run();
    }
}
