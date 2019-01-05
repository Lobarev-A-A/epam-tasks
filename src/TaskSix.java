public class TaskSix {
    public static void main() {

    }
}

class Notebook {
    private String title;

    public Notebook() {
        setTitle("Without a title");
    }

    public Notebook(String title) {
        setTitle(title);
    }

    public void setTitle(String title) {
        if (title == null) {
            this.title = "no title";
        } else {
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }

    public void addNote(String note) {

    }

    public void removeNote(int index) {

    }

    public void editNote(int index, String note) {

    }

    public void showNotes() {

    }
}
