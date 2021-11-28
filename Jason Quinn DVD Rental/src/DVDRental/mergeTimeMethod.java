package DVDRental;

import java.util.Arrays;

import static DVDRental.MergeSortMethod.printArray;
import static DVDRental.MergeSortMethod.sort;

public class mergeTimeMethod {

    //=========================== Question 2 Merge Sort benchmarking ===========================
    public static void mergeTime(Film[] films){
        //make copies of original array with new lengths to benchmark
        Film[] array10 = Arrays.copyOf(films, films.length -990);
        Film[] array100 = Arrays.copyOf(films, films.length -900);
        Film[] array500 = Arrays.copyOf(films, films.length -500);
        Film[] array1000 = Arrays.copyOf(films, films.length);

        //benchmark for 10 items to sort and print
        long startTime10 = System.currentTimeMillis();
        sort(array10, new TitleComparator());
        printArray(array10);
        long endTime10 =  System.currentTimeMillis();
        System.out.println("\nThis sort took: " + ((double)endTime10 - startTime10)/1000 + " seconds\n");

        //benchmark for 100 items to sort and print
        long startTime100 = System.currentTimeMillis();
        sort(array100, new TitleComparator());
        printArray(array100);
        long endTime100 =  System.currentTimeMillis();
        System.out.println("\nThis sort took: " + ((double)endTime100 - startTime100)/1000 + " seconds\n");

        //benchmark for 500 items to sort and print
        long startTime500 = System.currentTimeMillis();
        sort(array500, new TitleComparator());
        printArray(array500);
        long endTime500 =  System.currentTimeMillis();
        System.out.println("\nThis sort took: " + ((double)endTime500 - startTime500)/1000 + " seconds\n");

        //benchmark for 1000 items to sort and print
        long startTime = System.currentTimeMillis();
        sort(array1000, new TitleComparator());
        printArray(array1000);
        long endTime =  System.currentTimeMillis();
        System.out.println("\nThis sort took: " + ((double)endTime - startTime)/1000 + " seconds\n");

    }
}
