package toong.vn.androidlinkedlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        testAdd();
        //        testRemove();
    }

    private void testAdd() {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("A"); // A
        linkedList.add("B"); // A -> B
        linkedList.add("C"); // A -> B -> C
        linkedList.add(1, "D"); // Value  A -> D -> B -> C
        linkedList.add(5, "E"); // Method threw 'java.lang.IndexOutOfBoundsException' exception.
    }

    private void testRemove() {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("A"); // A
        linkedList.add("B"); // A -> B
        linkedList.add("C"); // A -> B -> C
        linkedList.remove(1); // A -> C
        linkedList.remove(1); // A
        linkedList.remove(1); // Method threw 'java.lang.IndexOutOfBoundsException' exception.
    }
}
