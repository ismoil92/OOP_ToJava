package model;

public class Building {
    private double height;
    private int numberOfStoreys;
    private int numberOfFlats;
    private int entrances;

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public int getNumberOfStoreys(){
        return this.numberOfStoreys;
    }

    public void setNumberOfStoreys(int numberOfStoreys){
        this.numberOfStoreys=numberOfStoreys;
    }

    public int getNumberOfFlats(){
        return this.numberOfFlats;
    }

    public void setNumberOfFlats(int numberOfFlats){
        this.numberOfFlats=numberOfFlats;
    }

    public int getEntrances(){
        return this.entrances;
    }

    public void setEntrances(int entrances){
        this.entrances=entrances;
    }

    @Override
    public String toString() {
        return "Building{" +
                "height=" + height +
                ", numberOfStoreys=" + numberOfStoreys +
                ", numberOfFlats=" + numberOfFlats +
                ", entrances=" + entrances +
                '}'+"\n";
    }
}
