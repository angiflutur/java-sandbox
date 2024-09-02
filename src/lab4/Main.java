package lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();

        // adding entities to database
        Helpers.addDealerships();
        Helpers.addSellers();

        // tests
        Dealership testDealership = Database.getDatabase().getAllDealerships().get(0);
        Seller testSeller = Database.getDatabase().getAllSellers().get(0);

        switch(task) {
            case 1:
                System.out.println(testDealership.getName());
                System.out.println(testSeller.getName());
                break;

            case 2:
                System.out.println(testDealership.averagePrice());
                System.out.println(testDealership.getPriceForBrand("Chevrolet"));
                break;

            case 3:
                Seller testSellerCopy = new Seller(testSeller);
                System.out.println(testSellerCopy);
                break;

            case 4:
                for (Dealership dealership : Database.getDatabase().getAllDealerships()) {
                    System.out.println(dealership.getName());
                }
                System.out.println("------------------------------");
                for (Seller seller : Database.getDatabase().getAllSellers()) {
                    System.out.println(seller.getName());
                }
                System.out.println("------------------------------");
                for (Dealership dealership : Database.getDatabase().getDealershipsByBrand("Honda")) {
                    System.out.println(dealership.getName());
                }
                System.out.println("------------------------------");
                for (Seller seller : Database.getDatabase().getSellersByBrand("Toyota")) {
                    System.out.println(seller.getName());
                }
                System.out.println("------------------------------");
                for (Dealership dealership : Database.getDatabase().getDealershipsByAveragePrice()) {
                    System.out.println(dealership.getName());
                }
                System.out.println("------------------------------");
                for (Dealership dealership : Database.getDatabase().getDealershipsByPriceForBrand("Lexus")) {
                    System.out.println(dealership.getName());
                }
                break;

            case 5:
                System.out.println("TESTING SELLER FUNCTIONALITIES:\n");

                for (Seller seller : testSeller.getAllSellers()) {
                    System.out.println(seller.getName());
                }
                System.out.println("------------------------------");
                for (Seller seller : testSeller.getSellersByBrand("Toyota")) {
                    System.out.println(seller.getName());
                }
                System.out.println("------------------------------");
                for (Seller seller : testSeller.getSellersByBrand("Mercedes-Benz")) {
                    System.out.println(seller.getName());
                }
                System.out.println("------------------------------");
                for (Dealership dealership : testSeller.getAllDealerships()) {
                    System.out.println(dealership.getName());
                }

                System.out.println("\nTESTING MUTABILITY FOR SELLERS:\n");

                testSeller.getAllDealerships().get(0).setName("New Dealership");
                for (Dealership dealership : testSeller.getAllDealerships()) {
                    System.out.println(dealership.getName());
                }
                System.out.println("------------------------------");
                for (Dealership dealership : testSeller.getDealershipsByBrand("Nissan")) {
                    System.out.println(dealership.getName());
                }
                for (Dealership dealership : testSeller.getDealershipsByAveragePrice()) {
                    System.out.println(dealership.getName());
                }
                System.out.println("------------------------------");
                for (Dealership dealership : testSeller.getDealershipsByPriceForBrand("Kia")) {
                    System.out.println(dealership.getName());
                }
                break;

            case 6:
                System.out.println("TESTING DEALERSHIP FUNCTIONALITIES:\n");

                for (Seller seller : testDealership.getAllSellers()) {
                    System.out.println(seller.getName());
                }
                System.out.println("------------------------------");
                for (Seller seller : testDealership.getSellersByBrand("Nissan")) {
                    System.out.println(seller.getName());
                }
                System.out.println("------------------------------");
                for (Seller seller : testDealership.getSellersByBrand("Kia")) {
                    System.out.println(seller.getName());
                }
                System.out.println("------------------------------");
                for (Dealership dealership : testDealership.getAllDealerships()) {
                    System.out.println(dealership.getName());
                }
                break;

            case 7:
                try {
                    // testing immutability for Dealership
                    testDealership.getAllDealerships().get(0).setName("New Dealership");

                    // it should throw an error if getAllDealerships() from Dealership is completely immutable
                    testDealership.getAllDealerships().add(new Dealership(testDealership));
                }
                catch(Exception e) {
                    System.out.println("Dealership immutability test passed!");
                }
                break;

            case 8:
                System.out.println(Database.getNumberOfInstances());
                break;
        }

    }
}
