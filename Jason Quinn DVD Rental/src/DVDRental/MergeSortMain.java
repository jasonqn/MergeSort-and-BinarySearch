package DVDRental;


import java.io.*;
import java.util.*;

import static DVDRental.AddMethod.addFilm;
import static DVDRental.BinaryTimeMethod.binaryTime;
import static DVDRental.MergeSortMethod.*;
import static DVDRental.mergeTimeMethod.mergeTime;
import static java.util.Arrays.binarySearch;


public class MergeSortMain {

    public static void main(String[] args) throws Exception {
        //scanner to retrieve the data within the CSV and puts data into Film (object)
        Scanner sc = new Scanner(new File("C:\\Users\\Jason\\Desktop\\Sort Algorithms\\AAP DVD Rental\\film_data.csv"));
        Film[] films = new Film[1000];

        // this will print the header in CSV file
        sc.nextLine();

        //iterates through the Film (object) parsing the data as we have defined in our Film class
        int i = 0;
        String st = "";
        while (sc.hasNextLine()) {
            st = sc.nextLine();
            String[] data = st.split(",");
            films[i] = new Film(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), Double.parseDouble(data[4]), Integer.parseInt(data[5]), Double.parseDouble(data[6]), data[7]);
            i++;
        }

        //closes scanner
        sc.close();

        //=========================== Question 1 Merge Sorting Array alphabetically ===========================
        System.out.println("Sorting in ascending order by Title \n");
        sort(films, new TitleComparator());
        printArray(films);



        //=========================== Question 2 Merge Sort benchmarking ===========================
        mergeTime(films);

        //=========================== Question 3 Binary Search ===========================
        //Change the title to find the film index
        Film films1 = new Film(671, "WONDERFUL DROP","A Intrepid Panorama of a Mad Scientist And a Boy who must Redeem a Boy in A Monastery",2010,4.99,50,18.99,"Trailers+Commentaries+Behind the Scenes");

        int bin = binarySearch(films, films1);
        System.out.println("Film 'Wonderful drop' found at index: " + bin);

        //=========================== Question 4 Binary Search benchmarking ===========================
        binaryTime(films);

        //=========================== Question 5 Adding Object to Array 1001 ===========================
        Scanner input = new Scanner(System.in);
        addFilm(films, input);





    }



}

