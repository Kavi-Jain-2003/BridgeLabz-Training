//textstate node class
class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
public class RedoUndo {

    private TextState head = null;
    private TextState tail = null;
    private TextState current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new text state
    void addState(String content) {
        TextState newState = new TextState(content);

        // If undo was used, clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = countNodes();
        }

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Maintain history limit
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }
        current = current.prev;
    }

    // Redo operation
    void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }
        current = current.next;
    }

    // Display current text
    void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty");
            return;
        }
        System.out.println("Current Text: " + current.content);
    }

    // Helper method to count nodes
    private int countNodes() {
        int count = 0;
        TextState temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {

        RedoUndo editor = new RedoUndo();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello Java");
        editor.displayCurrentState();

        editor.redo(); // should not work
    }
}

