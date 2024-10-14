/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managementsystem;

/**
 *
 * @author Aspire 3
 */
public class Conference extends BaseEvent {
    private final String keynoteSpeaker;

    public Conference(String eventName, String location, String date, String keynoteSpeaker) {
        super(eventName, location, date);
        this.keynoteSpeaker = keynoteSpeaker;
    }

    public String getKeynoteSpeaker() {
        return keynoteSpeaker;
    }

    @Override
    public void displayEventType() {
        System.out.println("This is a Conference event.");
        System.out.println("Keynote Speaker: " + keynoteSpeaker);
    }
}
