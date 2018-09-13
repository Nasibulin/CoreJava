// Automatically generated by sourceAnnotations.ToStringAnnotationProcessor
package corejava.v2ch08.sourceAnnotations;

import corejava.v2ch08.rect.*;

public class ToStrings {
    public static String toString(Point obj) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        result.append(toString(obj.getX()));
        result.append(",");
        result.append(toString(obj.getY()));
        result.append("]");
        return result.toString();
    }
    public static String toString(Rectangle obj) {
        StringBuilder result = new StringBuilder();
        result.append("rect.Rectangle");
        result.append("[");
        result.append(toString(obj.getTopLeft()));
        result.append(",");
        result.append("width=");
        result.append(toString(obj.getWidth()));
        result.append(",");
        result.append("height=");
        result.append(toString(obj.getHeight()));
        result.append("]");
        return result.toString();
    }
    public static String toString(Object obj) {
        return java.util.Objects.toString(obj);
    }
}
