import Lesson4.ComputerIterator;
import Lesson4.NoteBook;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook(1, 4, 256, "Windows 10", "White");
        NoteBook notebook2 = new NoteBook(2, 16, 1024, "Windows 10", "Black");
        NoteBook notebook3 = new NoteBook(3, 32, 2048, "Linux", "Gray");
        NoteBook notebook4 = new NoteBook(4, 8, 512, "Mac OS", "Black");

        ComputerIterator<NoteBook> notebookIterator = new ComputerIterator<>();

        notebookIterator.AddComputer(notebook1);
        notebookIterator.AddComputer(notebook2);
        notebookIterator.AddComputer(notebook3);
        notebookIterator.AddComputer(notebook4);

        while (notebookIterator.hasNext()){
            System.out.println(notebookIterator.next());
        }
    }
}