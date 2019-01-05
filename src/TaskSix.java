import java.util.ArrayList;


public class TaskSix {
    public static void main(String[] args) {
        Notebook book = new Notebook();
        System.out.println("book.showNotes()");
        book.showNotes();
        System.out.println("book.setTitle(\"MyNotebook\")");
        book.setTitle("MyNotebook");
        System.out.println("book.showNotes()");
        book.showNotes();
        System.out.println("book.addNote(\"Купить бананы\")");
        book.addNote("Купить бананы");
        System.out.println("book.addNote(\"Купить людей\")");
        book.addNote("Купить людей");
        System.out.println("book.showNotes()");
        book.showNotes();
        System.out.println("book.removeNote(0)");
        book.removeNote(0);
        System.out.println("book.showNotes()");
        book.showNotes();
        System.out.println("book.editNote(0, \"Найти работу\")");
        book.editNote(0, "Найти работу");
        System.out.println("book.showNotes()");
        book.showNotes();
    }
}

class Notebook {
    private String title;
    private ArrayList<Note> notes = new ArrayList<>();

    public Notebook() {
        setTitle("*Without a title*");
    }

    public Notebook(String title) {
        setTitle(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void addNote(String note) {
        this.notes.add(new Note(note));
    }

    public void removeNote(int index) {
        this.notes.remove(index);
    }

    public void editNote(int index, String note) {
        this.notes.set(index, new Note(note));
    }

    public void showNotes() {
        System.out.println(getTitle());

        int l = this.notes.size();
        if (l == 0) {
            System.out.println("*Empty notebook*");
        } else {
            for (int i = 0; i < l; ++i) {
                System.out.printf("%d.  %s\n", i, this.notes.get(i).getNote());
            }
        }
    }
}

class Note {
    private String value;

    public Note(String value) {
        this.value = value;
    }

    public String getNote() {
        return this.value;
    }
}
