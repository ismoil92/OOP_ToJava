package controller;

import model.Building;
import service.DataService;
import service.DataServiceImpl;

public class BuildingController {
    DataService dataService = new DataServiceImpl();

    public void SaveFile(Building building){
        dataService.SaveBuildingToFile(building);
    }

    public String ReadFile(){
        String result = dataService.ReadBuildingFromFile();
        return result;
    }
}
