package model;

public class Note {
    private String id;
    private String title;
    private String content;
    private String date;

    public Note(String id, String title, String content, String date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s / %s /  %s / %s", this.getId(), this.getTitle(), this.getContent(), this.getDate());
    }
}
