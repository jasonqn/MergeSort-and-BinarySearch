package DVDRental;

import java.util.Arrays;
import java.util.Comparator;
import  DVDRental.Film.*;

public class BinarySearchMethod {

    public static int binarySearch(DVDRental.Film[] films, String key) {

        //creates a copy of the array Film
        Film[] newArray = Arrays.copyOf(films, films.length);

        int first = 0;
        int last = films.length - 1;

        while(first <= last) {
            //define midpoint to split array into left and right
            int mid = (first + last + 1) / 2;


            //checks if the searchKey is in mid
            if(newArray[mid].getTitle().equals(key)) {
                return mid;
            }
            //checks left and right array
            else if(newArray[mid].compareTo(key) < 0) {
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }
        return -1;

    }
}
