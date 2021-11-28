package DVDRental;

import java.util.Comparator;

//comparator method for sorting the Films array by title
public class TitleComparator implements Comparator<Film> {

    @Override
    public int compare(Film o1, Film o2){
        if(o1.getTitle().compareTo(o2.getTitle()) > 0){
            return 1;
        }
        else if(o1.getTitle().compareTo(o2.getTitle()) < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
