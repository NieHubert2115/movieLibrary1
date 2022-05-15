import Tools.Menu;
import Tools.UserInputHandler;
import models.Actor;
import models.MovieLibrary;

public class MovieLibraryApp {

    public static void main(String[] args) {
        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();
        while(true) {
            Menu.printMenu();

            switch (UserInputHandler.getMenuOptionFromUser()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                    movieLibrary.getRandomMovieInformation();
                    break;
                case DISPLAYACTORS: //Display all movies for selected actor
                    movieLibrary.printActorFilmography();
                    break;
                case QUIT: //to exit
                    System.out.println("Bye");
                    System.exit(1);
                    break;
            }
        }
    }


}
