package io.github.tannenfels.entity.types;

/**
 * ChatColorType.
 *
 * @author javastream
 */
public enum ChatColorType {
    RED("RED"),
    GREEN("GREEN"),
    MINT("MINT"),
    LIGHT_BLUE("LIGHT_BLUE"),
    DARK_BLUE("DARK_BLUE"),
    PURPLE("PURPLE"),
    AQUA("AQUA"),
    PINK("PINK"),
    LIME("LIME"),
    BROWN("BROWN"),
    AZURE("AZURE"),
    KHAKI("KHAKI"),
    SAND("SAND"),
    MARENGO("MARENGO"),
    GRAY("GRAY"),
    GRAPHITE("GRAPHITE");

    private String code;

    ChatColorType(String code){
        this.code = code;
    }

    public String getCode(){ return code;}
}
