package Lesson2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LessonTwo {

    public static void SelectedSortCritery(){
        System.out.println("1-ОЗУ\n2-Объём ЖД\n3-Операционная система\n4-Цвет");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите номер критерии:");
        int selectCritery = scanner.nextInt();

        switch (selectCritery){
            case 1:
                sortNotebookByRAM();
                break;
            case 2:
                sortNetbookByHardware();
                break;
            case 3:
                sortUltrabookByOperationSystem();
                break;
            case 4:
                sortLapTopByColor();
                break;
            default:
                break;
        }
    }
    private static void sortNotebookByRAM(){
        Comparator<Computer> ramComparator = new Notebook();
        Set<Computer> sortedRam = new TreeSet<>(ramComparator);
        Notebook notebook1 = new Notebook(1, 4, 256, "Windows 10", "White");
        Notebook notebook2 = new Notebook(2, 16, 1024, "Windows 10", "Black");
        Notebook notebook3 = new Notebook(3, 32, 2048, "Linux", "Gray");
        Notebook notebook4 = new Notebook(4, 8, 512, "Mac OS", "Black");

        sortedRam.add(notebook1);
        sortedRam.add(notebook2);
        sortedRam.add(notebook3);
        sortedRam.add(notebook4);

        for(var value:sortedRam){
            if(value.ram>4)
                System.out.println(value);
        }
    }

    private static void sortNetbookByHardware(){
        Comparator<Computer> hardwareComparator = new NetBook();

        Set<Computer> sortedRam = new TreeSet<>(hardwareComparator);
        Notebook notebook1 = new Notebook(1, 4, 256, "Windows 10", "White");
        Notebook notebook2 = new Notebook(2, 16, 1024, "Windows 10", "Black");
        Notebook notebook3 = new Notebook(3, 32, 2048, "Linux", "Gray");
        Notebook notebook4 = new Notebook(4, 8, 512, "Mac OS", "Black");

        sortedRam.add(notebook1);
        sortedRam.add(notebook2);
        sortedRam.add(notebook3);
        sortedRam.add(notebook4);

        for(var value:sortedRam){
            if(value.hardware>256)
                System.out.println(value);
        }
    }

    private static void sortUltrabookByOperationSystem(){
        Comparator<Computer> operationSystemComparator = new UltraBook();

        Set<Computer> sortedRam = new TreeSet<>(operationSystemComparator);
        Notebook notebook1 = new Notebook(1, 4, 256, "Windows 10", "White");
        Notebook notebook2 = new Notebook(2, 16, 1024, "Windows 8", "Black");
        Notebook notebook3 = new Notebook(3, 32, 2048, "Linux", "Gray");
        Notebook notebook4 = new Notebook(4, 8, 512, "Mac OS", "Black");

        sortedRam.add(notebook1);
        sortedRam.add(notebook2);
        sortedRam.add(notebook3);
        sortedRam.add(notebook4);

        for(var value:sortedRam){
            if(value.operationSystem.length()>5)
                System.out.println(value);
        }
    }

    private static void sortLapTopByColor(){
        Comparator<Computer> colorComparator = new LapTop();

        Set<Computer> sortedRam = new TreeSet<>(colorComparator);
        Notebook notebook1 = new Notebook(1, 4, 256, "Windows 10", "White");
        Notebook notebook2 = new Notebook(2, 16, 1024, "Windows 10", "Black");
        Notebook notebook3 = new Notebook(3, 32, 2048, "Linux", "Gray");
        Notebook notebook4 = new Notebook(4, 8, 512, "Mac OS", "Yellow");

        sortedRam.add(notebook1);
        sortedRam.add(notebook2);
        sortedRam.add(notebook3);
        sortedRam.add(notebook4);

        for(var value:sortedRam){
            if(value.color.length()>4)
                System.out.println(value);
        }
    }
}
