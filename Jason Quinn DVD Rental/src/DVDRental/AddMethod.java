package DVDRental;

import java.util.Arrays;
import java.util.Scanner;

import static DVDRental.MergeSortMethod.printArray;
import static DVDRental.MergeSortMethod.sort;

public class AddMethod {

    //=========================== Question 5 Adding Object to Array 1001 ===========================
    public static void addFilm(Film[] films, Scanner input) throws Exception {

        Boolean valid = false;



        //Make a copy of the array and set its length to original length plus 1 to accommodate new film entry
        Film[] newArray = Arrays.copyOf(films, films.length + 1);

        //Creates the new film Object to be inserted into the array
        Film addFilm = new Film(0,"","",0,0,0,0,"");

        //User inputs the elements for the new object

        //Set Film ID using positive integer
        System.out.println("Please set film ID using a positive integer:");
        addFilm.setFilmID(input.nextInt());
        //Throws exception for negative integers
        if(addFilm.getFilmID() < 0) {
            throw new ArithmeticException("Please enter a positive integer!");
        }
        input.nextLine();

        //Set film title
        System.out.println("Please enter title: ");
        addFilm.setTitle(input.nextLine());
        //throws exception for character limit
        if(addFilm.getTitle().length() > 20) {
            throw new Exception("Title length too long, please stay within 20 characters");
        }

        //set film description
        System.out.println("Enter Description");
        addFilm.setDescription(input.nextLine());

        //set release year
        System.out.println("Enter release year: ");
        addFilm.setReleaseYear(input.nextInt());
        //throws exception for invalid date
        if(addFilm.getReleaseYear() > 2021 ||addFilm.getReleaseYear() < 1900) {
            throw new Exception("Please enter a film from 1900 - 2021");
        }
        input.nextLine();

        //set rental rate
        System.out.println("Set Rental Rate: ");
        addFilm.setRentalRate(input.nextDouble());
        //throws exception for setting the rental rate too high
        if(addFilm.getRentalRate() > 10.00) {
            throw new Exception("Replacement cost too high, please keep below €10");
        }
        input.nextLine();

        //set film length
        System.out.println("Set film length: ");
        addFilm.setLength(input.nextInt());
        input.nextLine();

        //set replacement cost
        System.out.println("Set replacement cost:");
        addFilm.setReplacementCost(input.nextDouble());
        input.nextLine();

        //set special features
        System.out.println("Detail special features");
        addFilm.setSpecialFeatures(input.nextLine());

        //confirmation for adding film
        System.out.println("Film added!");

        //adding the new film to the array after the user inputs the required elements
        newArray[films.length] = addFilm;

        //sorts the new array alphabetically once the new film is added
        sort(newArray, new TitleComparator());

        //prints the new array using the print array method from Film class
        printArray(newArray);

    }

}
