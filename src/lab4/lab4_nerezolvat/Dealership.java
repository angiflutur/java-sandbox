package lab4.lab4_nerezolvat;
import java.util.*;
class Dealership {
    private String name;
    private Map<String, Integer> cars;

    public Dealership(Dealership dealership) {
        // TODO
    }

    public Dealership(String name, Map<String, Integer> cars) {
        this.name = name;
        this.cars = cars;
    }

    public double averagePrice() {
        // TODO
        return 0;
    }

    public int getPriceForBrand(String brand) {
        // TODO
        return 0;
    }

    public List<Seller> getAllSellers() {
        // TODO
        return null;
    }

    public List<Dealership> getAllDealerships() {
        // TODO
        return null;
    }

    public List<Dealership> getDealershipsByBrand(String brand) {
        // TODO
        return null;
    }

    public List<Seller> getSellersByBrand(String brand) {
        // TODO
        return null;
    }

    public List<Dealership> getDealershipsByAveragePrice() {
        // TODO
        return null;
    }

    public List<Dealership> getDealershipsByPriceForBrand(String brand) {
        // TODO
        return null;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }
}

