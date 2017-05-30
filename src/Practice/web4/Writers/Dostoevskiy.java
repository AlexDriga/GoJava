package Practice.web4.Writers;

import Practice.web4.Write;

/**
 * Created by Alex-Plut on 17.02.2017.
 */
public abstract class Dostoevskiy implements Write {

    private int amount;

    public Dostoevskiy(int amount) {
        this.amount = amount;
    }

    public abstract void writePen (String str);

}
