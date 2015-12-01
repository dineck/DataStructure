/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure3sorting;

/**
 *
 * @author Dinu.Gurita
 */
public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 10000; // Размер массива
        ArraySel arr; // Ссылка на массив
        arr = new ArraySel(maxSize); // Создание массива
        
 /*
        arr.insert(77); // Вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
*/
        for(int j=0; j<maxSize; j++) {
            long n=j;
            arr.insert(n);
        }
        //arr.display(); // Вывод элементов
        
        arr.selectionSort(); // Сортировка методом выбора
        //arr.display(); // Повторный вывод
    }
}
