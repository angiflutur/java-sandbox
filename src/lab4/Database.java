package lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Database {
    private static Database instance = null;
    private final List<Seller> sellers = new ArrayList<>();
    private final List<Dealership> dealerships = new ArrayList<>();
    private static int contor = 0;

    public static Database getDatabase() {
        if(instance == null) {
            instance = new Database();
            contor += 1;
        }
        return instance;
    }

    public static int getNumberOfInstances() {
        return contor;
    }

    public List<Seller> getAllSellers() {
        return this.sellers;
    }

    public List<Dealership> getAllDealerships() {
        return this.dealerships;
    }

    public List<Dealership> getDealershipsByBrand(String brand) {
        List<Dealership> dealershipsByBrand = new ArrayList<>();
        for(int i = 0; i < this.dealerships.size(); i++) {
            if(this.dealerships.get(i).getCars().containsKey(brand))
                dealershipsByBrand.add(this.dealerships.get(i));
        }
        return dealershipsByBrand;
    }

    public List<Seller> getSellersByBrand(String brand) {
        List<Seller> sellersByBrand = new ArrayList<>();
        for(int i = 0; i < this.sellers.size(); i++) {
            if(this.sellers.get(i).getName().equals(brand))
                sellersByBrand.add(this.sellers.get(i));
        }
        return sellersByBrand;
    }

    public List<Dealership> getDealershipsByAveragePrice() {
        List<Dealership> sortedDealearhips = new ArrayList<>(this.dealerships);
        sortedDealearhips.sort(Comparator.comparingDouble(Dealership::averagePrice));
        return sortedDealearhips;
    }

    public List<Dealership> getDealershipsByPriceForBrand(String brand) {
        List<Dealership> dealershipsByPriceForBrand = getDealershipsByBrand(brand);
        dealershipsByPriceForBrand.sort(Comparator.comparingDouble(dealership -> dealership.getPriceForBrand(brand)));
        return dealershipsByPriceForBrand;
    }

    public void addSellers(List<Seller> sellers) {
        this.sellers .addAll(sellers);
    }

    public void addDealerships(List<Dealership> dealerships) {
        this.dealerships.addAll(dealerships);
    }

    @Override
    public String toString() {
        return "Database{" +
                "sellers=" + sellers +
                ", dealerships=" + dealerships +
                '}';
    }
}
