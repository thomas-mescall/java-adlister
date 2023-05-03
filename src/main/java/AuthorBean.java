import java.io.Serializable;

public class AuthorBean implements Serializable {
    private int id;
    private String first_name;
    private String last_name;
    private int author_id;

    public AuthorBean() {}

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }
}
