package DVDRental;

class Film implements Comparable<Object> {

    private int filmID;
    private String title;
    private String description;
    private int releaseYear;
    private double rentalRate;
    private int length;
    private double replacementCost;
    private String specialFeatures;

    // constructor
    public Film(int filmID, String title, String description, int releaseYear, double rentalRate, int length,
                double replacementCost, String specialFeatures) {
        super();
        this.filmID = filmID;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.specialFeatures = specialFeatures;
    }

    // setters and getters
    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }


    // so the film objects can be compared when sorting/searching
    // NOTE: this will only allow comparisons based on the title of the film
    @Override
    public int compareTo(Object obj) {
        Film films = (Film)obj;
        return title.compareTo(films.getTitle());
    }

    @Override
    public String toString() {
        return "DVDRental.Film [filmID=" + filmID +
                ", title=" + title
                + ", description=" + description +
                ", releaseYear=" + releaseYear +
                ", rentalRate=" + rentalRate +
                ", length=" + length +
                ", replacementCost="
                + replacementCost +
                ", specialFeatures=" + specialFeatures + "]";
    }



}