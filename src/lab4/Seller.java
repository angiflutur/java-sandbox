package lab4;

import java.util.ArrayList;
import java.util.List;
class Seller {
    private String name;
    private List<String> carBrands = new ArrayList<>();

    public Seller(Seller seller) {
        this.name = seller.getName();
        this.carBrands = seller.getCarBrands();
    }

    public Seller(String name, List<String> carBrands) {
        this.name = name;
        this.carBrands = carBrands;
    }

    public List<Seller> getAllSellers() {
        return Database.getDatabase().getAllSellers();
    }

    public List<Dealership> getAllDealerships() {
        return Database.getDatabase().getAllDealerships();
    }

    public List<Dealership> getDealershipsByBrand(String brand) {
        return Database.getDatabase().getDealershipsByBrand(brand);
    }

    public List<Seller> getSellersByBrand(String brand) {
        return Database.getDatabase().getSellersByBrand(brand);
    }

    public List<Dealership> getDealershipsByAveragePrice() {
        return Database.getDatabase().getDealershipsByAveragePrice();
    }

    public List<Dealership> getDealershipsByPriceForBrand(String brand) {
        return Database.getDatabase().getDealershipsByPriceForBrand(brand);
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
