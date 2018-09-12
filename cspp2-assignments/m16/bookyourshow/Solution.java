import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;



/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method to drive program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                              replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
            case "add":
                int k = 2;
                String[] seats = new String[tokens.length - 2];
                for (int j = 0; j < seats.length; j++) {
                    seats[j] = tokens[k++];
                }
                bys.addAShow(new Show(check[1], tokens[1], seats));
                break;

            case "book":
                k = 2 + 2;
                seats = new String[tokens.length - 2 - 2];
                for (int j = 0; j < seats.length; j++) {
                    seats[j] = tokens[k++];
                }
                bys.bookAShow(check[1], tokens[1],
                              new Patron(tokens[2], tokens[2 + 1]), seats);
                break;

            case "get":
                Show show = bys.getAShow(check[1], tokens[1]);
                if (show != null) {
                    System.out.println(show);
                } else {
                    System.out.println("No show");
                }
                break;

            case "print":
                bys.printTicket(check[1], tokens[1], tokens[2]);
                break;

            case "showAll":
                bys.showAll();
                break;

            default:
                break;
            }
        }
    }
}
/**
 * Class for show.
 */
class Show {
    /**
     * string movie.
     */
    private String movie;
    /**
     * string showtime.
     */
    private String showTime;
    /**
     * stringlist seats.
     */
    private String[] seats;
/**
 * Constructs the object.
 *
 * @param      movies     The movies
 * @param      showTime1  The show time 1
 * @param      seats1    The seats1
 */
    Show(final String movies, final String showTime1, final String[] seats1) {
        this.movie = movies;
        this.showTime = showTime1;
        this.seats = seats1;
    }

    String getMovie() {
        return movie;
    }

    String getShowTime() {
        return showTime;
    }

  String[] getSeats()  {
        return seats;
    }

    void setSeatNA(final int index) {
        seats[index] = "N/A";
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
 public String toString() {
        return movie + "," + showTime;
    }
}

class Patron {
    /**
     * variable name description.
     */
    private String name;
    /**
     * variable mobile description.
     */
    private String mobile;
    /**
     * Constructs the object.
     *
     * @param      nameMov    The name mov
     * @param      mobileNum  The mobile number
     */
    Patron(final String nameMov, final  String mobileNum) {
        this.name = nameMov;
        this.mobile = mobileNum;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    String getName() {
        return name;
    }
    /**
     * Gets the mobile.
     *
     * @return     The mobile.
     */
    String getMobile() {
        return mobile;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return name + " " + mobile;
    }
}
/**
 * Class for book your show.
 */
class BookYourShow {
    /**
     * var_description.
     */
    private ArrayList<Show> showList;
    /**
     * variable description.
     */
    private ArrayList<String> ticketList;
    /**
     * Constructs the object.
     */
    BookYourShow() {
        showList = new ArrayList<>();
        ticketList = new ArrayList<>();
    }
/**
 * Adds a show.
 *
 * @param      show  The show
 */
    void addAShow(final Show show) {
        showList.add(show);
    }
/**
 * Gets a show.
 *
 * @param      movie     The movie
 * @param      showTime  The show time
 *
 * @return     A show.
 */
    Show getAShow(final String movie, final String showTime) {
        for (Show show : showList) {
            if (show.getMovie().equals(movie)
                && show.getShowTime().equals(showTime)) {
                return show;
            }
        }
        return null;
    }
/**
 * books the show.
 *
 * @param      movie     The movie
 * @param      showTime  The show time
 * @param      patron    The patron
 * @param      seats     The seats
 */
    void bookAShow(final String movie, final String showTime,
        final Patron patron, final String[] seats) {
        Show show = getAShow(movie, showTime);
        if (show == null) {
            System.out.println("No show");
            return;
        }
        boolean flag = false;
        String[] sseats = show.getSeats();
        for (String seat : seats) {
            for (int i = 0; i < sseats.length; i++) {
                if (seat.equals(sseats[i])) {
                    show.setSeatNA(i);
                    flag = true;
                }
            }
        }


        if (flag) {
            ticketList.add(patron.getMobile() + " " + movie + " " + showTime);
        }
    }
    /**
     * Prints ticket with movie name, date - time and number.
     *
     * @param      movie     The movie
     * @param      showTime  The show time
     * @param      mobile    The mobile
     */
    void printTicket(final String movie, final String showTime,
        final String mobile) {
        /**
         * prints what are present.
         */
        String t = mobile + " " + movie + " " + showTime;
        if (ticketList.contains(t)) {
            System.out.println(t);
        } else {
            System.out.println("Invalid");
        }
    }
/**
 * Shows all.
 */
    void showAll() {
        /**
         * print what shows are present.
         */
        for (Show show : showList) {
            System.out.println(show.toString() + ","
                + Arrays.toString(show.getSeats()).replace(" ", ""));
        }
    }
}



