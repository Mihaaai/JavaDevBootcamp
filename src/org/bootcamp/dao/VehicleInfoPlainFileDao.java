package org.bootcamp.dao;

import org.bootcamp.formula.Formula;
import org.bootcamp.model.VehicleInfo;
import org.bootcamp.vehicle.Vehicle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleInfoPlainFileDao implements VehicleInfoDao {

    private final String filePath;

    private static final String SEPARATOR = ";";

    private static final int VEHICLE_TYPE = 1;
    private static final int VEHICLE_AGE = 3;
    private static final int VEHICLE_MILES = 4;
    private static final int VEHICLE_IS_DIESEL = 5;
    private static final int VEHICLE_FORMULA = 2;
    private static final int VEHICLE_ID = 0;




    public VehicleInfoPlainFileDao(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<VehicleInfo> getAllVehicles() {

        List<VehicleInfo> vehicleInfoList = new ArrayList<>();

        final File inputFile = new File(this.filePath);
        try {
            final InputStream inputStream = new FileInputStream(inputFile);
            final Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNextLine())
            {
                final String line =  scanner.nextLine();

                final String[] tokens = line.split(SEPARATOR);

                vehicleInfoList.add(new VehicleInfo(tokens[VEHICLE_ID],tokens[VEHICLE_TYPE],
                        tokens[VEHICLE_FORMULA], Integer.parseInt(tokens[VEHICLE_AGE]),
                        Long.parseLong(tokens[VEHICLE_MILES]),Boolean.parseBoolean(tokens[VEHICLE_IS_DIESEL])));
            }

        }
        catch (FileNotFoundException noFileFound)
        {
            System.err.println(noFileFound.getMessage());
        }

        return vehicleInfoList;
    }
}
