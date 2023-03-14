package io.github.tannenfels.entity.types;

/**
 * ChatNotificationType.
 *
 * @author javastream
 */
public enum ChatNotificationType {
    YES("Y"),
    NOT("N");

    private String code;

    ChatNotificationType(String code){
        this.code = code;
    }

    public String getCode(){ return code;}
}