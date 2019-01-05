import java.util.ArrayList;


public class TaskSix {
    public static void main() {
        
    }
}

class Notebook {
    private String title;
    private ArrayList notes = new ArrayList();

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
        notes.add(new Note(note));
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public void editNote(int index, String note) {
        notes.set(index, new Note(note));
    }

    public void showNotes() {
        System.out.println(getTitle());
        int l = notes.size();
        for (int i = 0; i < l; ++i) {
            System.out.printf("%d.    %s\n", i, notes.get(i));
        }
    }
}

class Note {
    private String value;

    public Note(String value) {
        this.value = value;
    }
}
