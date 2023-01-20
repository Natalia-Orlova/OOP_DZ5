package lesson5.Core.MVP;

public class Presenter {
    Model model;
    View view;

    public Presenter (View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }
}
