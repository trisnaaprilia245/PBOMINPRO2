/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managementsystem;

/**
 *
 * @author Aspire 3
 */
public abstract class BaseEvent {
    private final String eventName;
    private String location;
    private String date;

    public BaseEvent(String eventName, String location, String date) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
    }

    public String getEventName() {
        return eventName; 
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Abstract method
    public abstract void displayEventType();

    void displayEventDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
