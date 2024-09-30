/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagement;

public class Event {
    private final String eventName;
    private final String location;
    private final String date;

    // Constructor
    public Event(String eventName, String location, String date) {
        this.eventName = eventName;
        this.location = location;
        this.date = date;
    }

    // Getter methods
    public String getEventName() {
        return eventName;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    // Metode untuk menampilkan detail event
    public void displayEventDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
    }
}
