/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managementsystem;

/**
 *
 * @author Aspire 3
 */
public class Workshop extends BaseEvent {
    private final String skillLevel;

    public Workshop(String eventName, String location, String date, String skillLevel) {
        super(eventName, location, date);
        this.skillLevel = skillLevel;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    @Override
    public void displayEventType() {
        System.out.println("This is a Workshop event.");
        System.out.println("Skill Level: " + skillLevel);
    }
}
