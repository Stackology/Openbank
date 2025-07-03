package com.Stackology.Openbank.model;

/**
 * User is a class that represents a system user with basic authentication data.
 *
 * Palavra nova em inglês: "authentication" (autenticação)
 * Exemplo de uso: "The user needs authentication to access the system."
 */
public class User {

    private String name;
    private String email;
    private String password;

    /**
     * Constructor for User.
     * @param name user's name
     * @param email user's email
     * @param password user's password
     */
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Gets the user's name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the user's name.
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the user's email.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email.
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the user's password.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the user's password.
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
