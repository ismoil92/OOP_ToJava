package service;
import model.Building;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Logger;

public class DataServiceImpl implements DataService{

    private Logger logger = Logger.getAnonymousLogger();
    @Override
    public void SaveBuildingToFile(Building building) {
        try(FileWriter fileWriter = new FileWriter("building.txt"))
        {
            fileWriter.write(building.toString());
        }
        catch (Exception e){
            logger.warning("Что-то пошло не так!");
        }
    }

    @Override
    public String ReadBuildingFromFile() {
        try(FileReader fileReader = new FileReader("building.txt")){
            Scanner scanner = new Scanner(fileReader);
            return scanner.nextLine();
        }
        catch (Exception e){
            logger.warning("Что-то пошло не так!");
        }
        return null;
    }
}
