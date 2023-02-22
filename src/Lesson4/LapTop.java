package Lesson4;

public class LapTop extends Computer{
    public LapTop(int id, int ram, int hardware, String operSys, String color){
        super.id=id;
        super.ram=ram;
        super.hardware=hardware;
        super.operationSystem=operSys;
        super.color=color;
    }

    @Override
    public String toString() {
        return String.format("ID:%d, RAM:%d, Hardware:%d, Operation System:%s, Color:%s",super.id,super.ram, super.hardware, super.operationSystem, super.color);
    }
}
