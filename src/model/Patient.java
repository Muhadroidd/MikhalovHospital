package model;

/**
 * Created by muha on 11.09.17.
 */
public class Patient {
    private String firstName;
    private String lastName;
    private String timeOfVisit;

    public Patient(String firstName, String lastName, String timeOfVisit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.timeOfVisit = timeOfVisit;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTimeOfVisit() {
        return timeOfVisit;
    }

    public void setTimeOfVisit(String timeOfVisit) {
        this.timeOfVisit = timeOfVisit;
    }


}
