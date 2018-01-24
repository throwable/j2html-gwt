package j2html.gwt;

import com.google.gwt.junit.client.GWTTestCase;
import junit.framework.Assert;

import static j2html.TagCreator.*;
import static junit.framework.Assert.*;

public class GwtTestHtmlGeneration extends CustomGwtTestCase {
    private static final String CONTROL_HTML = "<!DOCTYPE html><html><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Sample page</title></head><body><p><div>This is a sample page</div></p></body></html>";

    public String getModuleName() {
        return "j2html.J2HtmlTest";
    }


    public void testSampleHtml() {
        String html = document(
                html(
                        head(
                                meta().withCharset("utf-8"),
                                meta().withName("viewport").withContent("width=device-width, initial-scale=1"),
                                title("Sample page")
                        ),
                        body(
                                p(
                                        div("This is a sample page")
                                )
                        )
                )
        );

        assertEquals(CONTROL_HTML, html);
    }
}
