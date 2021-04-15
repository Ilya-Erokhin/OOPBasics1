package ru.netology.domain;

public class AttachmentsInfo {
    private String typeAttachments; //Типы вложений (Фото, видео, гифка и т.д.)
    private String linksAttachments; //Ссылочка

    public String getTypeAttachments() {
        return typeAttachments;
    }

    public void setTypeAttachments(String typeAttachments) {
        this.typeAttachments = typeAttachments;
    }

    public String getLinksAttachments() {
        return linksAttachments;
    }

    public void setLinksAttachments(String linksAttachments) {
        this.linksAttachments = linksAttachments;
    }
}
