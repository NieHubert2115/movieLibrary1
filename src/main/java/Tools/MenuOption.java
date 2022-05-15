package Tools;

public enum MenuOption {

    DISPLAYINFORMATIONABOUTRANDOMMOVIE(1),
    DISPLAYACTORS(2),
    QUIT(3);
    int action;

    MenuOption(int action) {
        this.action = action;
    }

}
