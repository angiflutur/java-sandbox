package lab4.lab4_nerezolvat;
import java.util.*;
class Seller {
    private String name;
    private List<String> carBrands = new ArrayList<>();

    public Seller(Seller seller) {
        // TODO
    }

    public Seller(String name, List<String> carBrands) {
        this.name = name;
        this.carBrands = carBrands;
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

    public String getName() {
        return name;
    }

    public List<String> getCarBrands() {
        return carBrands;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", carBrands=" + carBrands +
                '}';
    }
}
