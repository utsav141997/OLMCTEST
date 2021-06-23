package edu.cqu.olmclibrarysystem.model;

/**
 * Author: Model class for Author registration
 *
 * @author Lenovo
 */
// Author Details
public class Author {

    private int authorId; // Id is Unique
    private String fullName; // Author Full Name

    // default constructor
    public Author() {
    }

    // parameterized constructor
    // Author Name
    // GET-SET for Author
    public Author(String fullName) {
        this.fullName = fullName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return this.fullName;
    }
}
