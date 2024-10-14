/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagement;

/**
 *
 * @author Aspire 3
 */
public class SeminarEvent extends Event {
    private final String speaker;

    public SeminarEvent(String eventName, String location, String date, String speaker) {
        super(eventName, location, date);
        this.speaker = speaker;
    }

    public String getSpeaker() {
        return speaker;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("Seminar Name: " + getEventName());
        System.out.println("Location: " + getLocation());
        System.out.println("Date: " + getDate());
        System.out.println("Speaker: " + speaker);
    }
}