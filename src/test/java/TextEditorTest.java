import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static java.awt.SystemColor.text;
import static org.junit.Assert.assertEquals;

public class TextEditorTest {
    @BeforeEach
    void initialization(){
        TextEditor editor = new TextEditor();
        String text = "Lorem Ipsum is simply dummy text of" +
                " the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's " +
                "standard dummy text ever since the 1500s," +
                " when an unknown printer took a galley" +
                " of type and scrambled it to make a type specimen book.";
    }
}
