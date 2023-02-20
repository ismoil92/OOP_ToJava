package Lesson2;

import java.util.Comparator;

public class UltraBook extends Computer implements ComputerInterface, Comparator<Computer> {

    public UltraBook(){

    }

    public UltraBook(int id, int ram, int hardware, String operSys, String color){
        super.id=id;
        super.ram=ram;
        super.hardware=hardware;
        super.operationSystem=operSys;
        super.color=color;
    }
    @Override
    public int getRAM() {
        return super.ram;
    }

    @Override
    public int getHardware() {
        return super.hardware;
    }

    @Override
    public String getOperationSystem() {
        return super.operationSystem;
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public int compare(Computer c1, Computer c2) {
        return c1.operationSystem.compareTo((c2.operationSystem));
    }

    @Override
    public String toString() {
        return String.format("ID:%d, RAM:%d, Hardware:%d, Operation System:%s, Color:%s",super.id,super.ram, super.hardware, super.operationSystem, super.color);
    }
}
