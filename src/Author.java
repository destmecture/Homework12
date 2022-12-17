public class Author {

    private String name;
    private String surName;
    private String authorFullName;




    public Author(String authorFullName) {
        this.authorFullName = authorFullName;
        String[] separateAuthorName = authorFullName.split(" ");
        this.name = separateAuthorName[0];
        this.surName = separateAuthorName[1];

    }

    public String getAuthorName(){
        return name;
    }

    public String getAuthorSurname() {
        return surName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }


}
