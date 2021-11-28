package DVDRental;

import java.util.Comparator;

//Class that contains all static methods used
public class MergeSortMethod {

    public static <Film extends Comparable<Film>> void sort(Film [] films) {
        mergeSort(films, 0, films.length-1);
    }

    public static <Film> void sort(Film [] films, Comparator<? super Film>comparator) {
        mergeSort(films, 0, films.length-1, comparator);
    }

    //Non comparator
    public static <Film extends Comparable<Film>> void mergeSort(Film[] films, int start, int end) {
        if(start == end) {
            return;
        }
        else {
            int mid = (start + end) / 2;
            //divide the left partition
            mergeSort(films, start, mid);
            //divide the right partition
            mergeSort(films, mid + 1, end);
            //merge the left and right sorted partitions
            merge(films, start, mid + 1, end);

        }

    }

    //Method that divides the array via recursion
    public static <Film> void mergeSort(Film[] films, int start, int end, Comparator<?super Film>comparator) {
        //breaks out of the recursion when there is one element in the array
        if(start == end) {
            return;
        }
        else {
            //creates the midway point in array
            int mid = (start + end) / 2;
            //divide the left partition
            mergeSort(films, start, mid, comparator);
            //divide the right partition
            mergeSort(films, mid + 1, end, comparator);
            //merge the left and right sorted partitions by calling the merge method below
            merge(films, start, mid + 1, end, comparator);
        }
    }

    //Non comparator
    public static <Film extends Comparable<Film>> void merge(Film[] films,int start, int mid, int end) {
        Object[] tempArray = getTempArray(films.length);
        int tempIndex = 0;
        int lowerIndex = start;
        int midIndex = mid - 1;
        int totalItems = end - lowerIndex + 1;

        while(lowerIndex <= midIndex && mid <= end) {
            if(((Comparable<Film>) films[lowerIndex]).compareTo(films[mid]) < 0) {
                tempArray[tempIndex++] = films[lowerIndex++];
            }
            else {
                tempArray[tempIndex++] = films[mid++];
            }
        }

        while(lowerIndex <= midIndex) {
            tempArray[tempIndex++] = films[lowerIndex++];
        }

        while(mid <= end) {
            tempArray[tempIndex++] = films[mid++];
        }

        for(int i = 0; i < totalItems; i++) {
            films[start+i] = (Film) tempArray[i];
        }
    }

    //Sorts the arrays partitions
    public static <Film> void merge(Film[] films,int start, int mid, int end, Comparator<?super Film> comparator) {
        Object[] tempArray = getTempArray(films.length);
        int tempIndex = 0;
        int lowerIndex = start;
        int midIndex = mid - 1;
        int totalItems = end - lowerIndex + 1;

        //traverses through left and right partition and increments by the smallest
        //we are calling the comparator to sort the strings alphabetically
        while(lowerIndex <= midIndex && mid <= end) {
            if(comparator.compare(films[lowerIndex], films[mid]) < 0) {
                tempArray[tempIndex++] = films[lowerIndex++];
            }
            else {
                tempArray[tempIndex++] = films[mid++];
            }
        }

        while(lowerIndex <= midIndex) {
            tempArray[tempIndex++] = films[lowerIndex++];
        }

        while(mid <= end) {
            tempArray[tempIndex++] = films[mid++];
        }

        for(int i = 0; i < totalItems; i++) {
            films[start+i] = (Film) tempArray[i];
        }
    }

    //created seperate method for temp array
    private static Film[] getTempArray(int length) {
        Film[] tempArray = new Film[length];
        return tempArray;
    }

    //Method of printing the whole array
    public static <Film> void printArray(Film[] films) {
        for(Film t : films) {
            System.out.println(t);
        }
    }
}

