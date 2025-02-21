public class Author {
    private String name;
    private String email;
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Author() {

    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
