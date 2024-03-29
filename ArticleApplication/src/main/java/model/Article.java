package model;

public class Article {


    private String id;
    private String name;
    private String description;

    public Article(String id, String name, String description) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
