package lab4.lab4_nerezolvat;
import java.util.*;
class Database {
    private List<Seller> sellers = new ArrayList<>();
    private List<Dealership> dealerships = new ArrayList<>();

    // TODO: make it Singleton
    public static Database getDatabase() {
        return null;
    }

    public static int getNumberOfInstances() {
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

    public void addSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    public void addDealerships(List<Dealership> dealerships) {
        this.dealerships = dealerships;
    }

    @Override
    public String toString() {
        return "Database{" +
                "sellers=" + sellers +
                ", dealerships=" + dealerships +
                '}';
    }
}
