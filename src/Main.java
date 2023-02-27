import Lesson5.Building;
import Lesson5.CreateBuildingBuilder;

public class Main {
    public static void main(String[] args) {

        Building building = CreateBuildingBuilder.getInstance().setHeight(12.3).setNumberOfStoreys(2).setNumberOfFlats(3).setEntrances(5).build();

        System.out.println(building);
    }
}