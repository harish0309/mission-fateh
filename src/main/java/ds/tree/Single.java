package ds.tree;

/**
 * Created by HARISH on 10- 06- 2018
 */
public class Single {
    private static Single ourInstance = new Single();

    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
}
