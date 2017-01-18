package edu.matc.entity;

import java.time.LocalDate;
import java.time.Period;

/**
 * A class to represent a user.
 *
 * @author pwaite
 */
public class User {
    private String firstName;
    private String lastName;
    private String userid;
    private String dateOfBirth;
    private boolean userFound;
    private int age;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userid    the userid
     */
    public User(String firstName, String lastName, String userid, String dateOfBirth, boolean userFound) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userid = userid;
        this.dateOfBirth = dateOfBirth;
        this.userFound = userFound;
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * Gets date of birth.
     *
     * @return the date of birth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets date of birth.
     *
     * @param dateOfBirth the date of birth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    /**
     * Is user found boolean.
     *
     * @return the boolean
     */
    public boolean isUserFound() {
        return userFound;
    }

    /**
     * Sets user found.
     *
     * @param userFound the user found
     */
    public void setUserFound(boolean userFound) {
        this.userFound = userFound;
    }



    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userid='" + userid + '\'' +
                '}';
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return calculateAge();
    }

    /**
     * Sets age.
     */
    public void setAge() {
        this.age = calculateAge();
    }

    /**
     * Calculate age int.
     *
     * @return the int
     */
    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate localDateOfBirth = LocalDate.parse(dateOfBirth);

        return Period.between(localDateOfBirth, currentDate).getYears();
    }

}