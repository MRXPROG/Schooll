import java.util.ArrayList;

public class School {
    ArrayList<Group> classes;

    public School() {

        classes = new ArrayList<Classes>();
    }

    public void addClass(Group group) {

        this.classes.add(group);
    }
}