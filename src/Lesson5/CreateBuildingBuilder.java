package Lesson5;

public class CreateBuildingBuilder {
    private static int id=0;
    private static CreateBuildingBuilder builder;
    Building building;

    public static CreateBuildingBuilder getInstance(){
        if(builder == null)
            builder = new CreateBuildingBuilder();
        builder.building = new Building();
        id++;
        return builder;
    }

    public CreateBuildingBuilder setHeight(double height){
        this.building.setHeight(height);
        return this;
    }

    public CreateBuildingBuilder setNumberOfStoreys(int numberOfStoreys){
        this.building.setNumberOfStoreys(numberOfStoreys);
        return this;
    }

    public CreateBuildingBuilder setNumberOfFlats(int numberOfFlats){
        this.building.setNumberOfFlats(numberOfFlats);
        return this;
    }

    public CreateBuildingBuilder setEntrances(int entrances){
        this.building.setEntrances(entrances);
        return this;
    }

    public Building build(){
        return building;
    }

    @Override
    public String toString() {
        return String.format("ID:%d, Building:%s", id, building.toString());
    }
}
