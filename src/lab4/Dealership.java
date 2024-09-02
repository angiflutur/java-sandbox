package lab4;

import java.util.Collections;
import java.util.List;
import java.util.Map;

class Dealership {
    private String name;
    private Map<String, Integer> cars;

    public Dealership(Dealership dealership) {
        this.name = dealership.name;
        this.cars = dealership.cars;
    }

    public Dealership(String name, Map<String, Integer> cars) {
        this.name = name;
        this.cars = cars;
    }

    public double averagePrice() {
        if (cars == null || cars.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        int count = 0;

        for (Integer price : cars.values()) {
            if (price != null) {
                sum += price;
                count++;
            }
        }

        return (count == 0) ? 0.0 : sum / count; // Evităm împărțirea la 0
    }

    public int getPriceForBrand(String brand) {
        if (brand == null || cars == null) {
            return 0;
        }

        Integer price = cars.get(brand);
        if (price == null) {
            return 0;
        }

        return price;
    }

    public List<Seller> getAllSellers() {
        return Collections.unmodifiableList(Database.getDatabase().getAllSellers());
    }

    public List<Dealership> getAllDealerships() {
        return Collections.unmodifiableList(Database.getDatabase().getAllDealerships());
    }

    public List<Dealership> getDealershipsByBrand(String brand) {
        return Collections.unmodifiableList(Database.getDatabase().getDealershipsByBrand(brand));
    }

    public List<Seller> getSellersByBrand(String brand) {
        return Collections.unmodifiableList(Database.getDatabase().getSellersByBrand(brand));
    }

    public List<Dealership> getDealershipsByAveragePrice() {
        return Collections.unmodifiableList(Database.getDatabase().getDealershipsByAveragePrice());
    }

    public List<Dealership> getDealershipsByPriceForBrand(String brand) {
        return Collections.unmodifiableList(Database.getDatabase().getDealershipsByPriceForBrand(brand));
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

