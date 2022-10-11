package Week_8;

import java.util.ArrayList;
import java.util.List;

public class Person {
        private String name;
        private String address;
        List<Vehicle> vehicleList = new ArrayList<>();

        /**
         * Constructor.
         * @param name name.
         * @param address address.
         */
        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        /**
         * Create addVehicle method.
         * @param vehicle vehicle.
         */
        public void addVehicle(Vehicle vehicle) {
            vehicleList.add(vehicle);
        }

        /**
         * Create method to remove vehicle.
         * @param registrationNumber resNum.
         */
        public void removeVehicle(String registrationNumber) {
            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                    vehicleList.remove(vehicleList.get(i));
                    break;
                }
            }
        }

        /**
         * Create method to get vehicle info.
         * @return info.
         */
        public String getVehiclesInfo() {
            if (vehicleList.isEmpty()) {
                return name + " has no vehicle!";
            } else {
                StringBuilder vehicleInfo = new StringBuilder(name + " has:\n\n");
                for (Vehicle vehicle : vehicleList) {
                    vehicleInfo.append(vehicle.getInfo()).append("\n");
                }
                return vehicleInfo.toString();
            }
        }

    /**
     * Create getter method for name.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Create setter method for name.
     * @param name name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Create getter method for address.
     * @return address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Create setter method for address.
     * @param address address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Override toString method.
     * @return string.
     */
    @Override
    public String toString() {
        return name + " - " + address;
    }
}
