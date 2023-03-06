package service;
import model.Building;

public interface DataService {
    void SaveBuildingToFile(Building building);
    String ReadBuildingFromFile();
}
