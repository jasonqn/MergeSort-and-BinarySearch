package DVDRental;

import java.util.Arrays;

import static DVDRental.MergeSortMethod.printArray;
import static DVDRental.MergeSortMethod.sort;
import static java.util.Arrays.binarySearch;

public class BinaryTimeMethod {

    public static void binaryTime(Film[] films){
        //make copies of original array with new lengths to benchmark
        Film[] array10 = Arrays.copyOf(films, films.length -990);
        Film[] array100 = Arrays.copyOf(films, films.length -900);
        Film[] array500 = Arrays.copyOf(films, films.length -500);
        Film[] array1000 = Arrays.copyOf(films, films.length);

        //define the film to be searched, search is based off title and returns index place
        Film films1 = new Film(671, "SWARM GOLD","A Intrepid Panorama of a Mad Scientist And a Boy who must Redeem a Boy in A Monastery",2010,4.99,50,18.99,"Trailers+Commentaries+Behind the Scenes");
        int bin = binarySearch(films, films1);


        //benchmark for 10 items to find the film
        //starts timer
        long startTime10 = System.currentTimeMillis();
        //sorts array before binary search initiated
        sort(array10, new TitleComparator());
        //gets the filmID and index number from the array
        System.out.println("Film " + films1.getTitle() + " found at index: " + bin);
        //ends the timer
        long endTime10 =  System.currentTimeMillis();
        //calculates how long the search took for benchmarking
        System.out.println("This search took: " + ((double)endTime10 - startTime10)/1000 + " seconds\n");


        //benchmark for 100 items to find the film - same methods as above
        long startTime100 = System.currentTimeMillis();
        sort(array100, new TitleComparator());
        System.out.println("Film " + films1.getTitle() + " found at index: " + bin);
        long endTime100 =  System.currentTimeMillis();
        System.out.println("This search took: " + ((double)endTime100 - startTime100)/1000 + " seconds\n");

        //benchmark for 500 items to find the film - same methods as above
        long startTime500 = System.currentTimeMillis();
        sort(array500, new TitleComparator());
        System.out.println("Film " + films1.getTitle() + " found at index: " + bin);
        long endTime500 =  System.currentTimeMillis();
        System.out.println("This search took: " + ((double)endTime500 - startTime500)/1000 + " seconds\n");

        //benchmark for 1000 items to find the film - same methods as above
        long startTime = System.currentTimeMillis();
        sort(array1000, new TitleComparator());
        System.out.println("Film " + films1.getTitle() + " found at index: " + bin);
        long endTime =  System.currentTimeMillis();
        System.out.println("This search took: " + ((double)endTime - startTime)/1000 + " seconds\n");

    }

}
