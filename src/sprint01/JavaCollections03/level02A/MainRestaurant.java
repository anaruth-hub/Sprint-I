package sprint01.JavaCollections03.level02A;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainRestaurant {
    public static void main(String[] args) {

        Set<Restaurant> restaurants = createInitialRestaurants();

        printRestaurants("Initial restaurants (no duplicates)", restaurants);

        Restaurant exactDuplicate = new Restaurant("Rikos", 6);
        boolean addedExactDuplicate = restaurants.add(exactDuplicate);

        System.out.println("\nTrying to add EXACT duplicate: " + exactDuplicate);
        System.out.println("Was it added? " + addedExactDuplicate);
        printRestaurants("After trying to add exact duplicate", restaurants);

        Restaurant sameNameDifferentScore = new Restaurant("Rikos", 9);
        boolean addedSameNameDifferentScore = restaurants.add(sameNameDifferentScore);

        System.out.println("\nTrying to ad SAME name but DIFFERENT score:" + sameNameDifferentScore);
        System.out.println("Was it added? " + addedSameNameDifferentScore);
        printRestaurants("After adding same name with different score", restaurants);

        Restaurant sameScoreDifferentName = new Restaurant("La Terraza", 6);
        boolean addedSameScoreDifferentName = restaurants.add(sameScoreDifferentName);

        System.out.println("\nTriyin to add DIFFERENT name but SAME score: " + sameScoreDifferentName);
        System.out.println("Was it added? " + addedSameScoreDifferentName);
        printRestaurants("After adding different name with same score", restaurants);

    }


    private static Set<Restaurant> createInitialRestaurants() {
        Set<Restaurant> restaurants = new LinkedHashSet<>();

        restaurants.add(new Restaurant("Manus Bistrot", 7));
        restaurants.add(new Restaurant("Tentación Criolla", 8));
        restaurants.add(new Restaurant("Máncora", 8));
        restaurants.add(new Restaurant("Rikos", 6));
        restaurants.add(new Restaurant("Brasa y Leña", 5));
        restaurants.add(new Restaurant("La Mar", 10));

        return restaurants;

    }


    private static void printRestaurants(String title, Set<Restaurant> restaurants) {
        System.out.println("\n--- " + title + " ---");
        restaurants.forEach(System.out::println);
        System.out.println("Total restaurants: " + restaurants.size());
    }
}
