package Lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComputerIterator<T extends Computer> implements Iterator<T> {

    private int count;
    private List<T> computersList;

    public ComputerIterator(){
        count=0;
        computersList = new ArrayList<>();
    }

    public void AddComputer(T computer){
        computersList.add(computer);
    }
    @Override
    public boolean hasNext() {
        return count<computersList.size();
    }

    @Override
    public T next() {
        return computersList.get(count++);
    }
}
