/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagement;

public class ConcertEvent extends Event {
    private final String artist;

    public ConcertEvent(String eventName, String location, String date, String artist) {
        super(eventName, location, date);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("Concert Name: " + getEventName());
        System.out.println("Location: " + getLocation());
        System.out.println("Date: " + getDate());
        System.out.println("Artist: " + artist);
    }
}
