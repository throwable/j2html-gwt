package j2html.tags;

import com.google.gwt.core.shared.GwtIncompatible;
import j2html.Config;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import static j2html.TagCreator.rawHtml;
import static j2html.TagCreator.script;
import static j2html.TagCreator.style;

/**
 * This file is based on the original version of j2html.tags.InlineStaticResource
 * and disables incompatible members for GWT
 */
public class InlineStaticResource {

    public enum TargetFormat {CSS_MIN, CSS, JS_MIN, JS}

    public static ContainerTag get(String path, TargetFormat format) {
        String fileString = getFileAsString(path);
        switch (format) {
            case CSS_MIN:
                return style().with(rawHtml(Config.cssMinifier.minify(fileString)));
            case JS_MIN:
                return script().with(rawHtml(Config.jsMinifier.minify((fileString))));
            case CSS:
                return style().with(rawHtml(fileString));
            case JS:
                return script().with(rawHtml(fileString));
            default:
                throw new RuntimeException("Invalid target format");
        }
    }

    public static String getFileAsString(String path) {
        throw new RuntimeException("Method is not GWT-compatible");
    }
}
