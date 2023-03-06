package view;
import controller.BuildingController;
import model.CreateBuildingBuilder;

public class BuildingView {
    public static void main(String[] args) {
        BuildingController controller = new BuildingController();

        controller.SaveFile(CreateBuildingBuilder.getInstance().setHeight(12.3).setNumberOfFlats(2).setNumberOfStoreys(3).setEntrances(2).build());

        System.out.println(controller.ReadFile());
    }
}
