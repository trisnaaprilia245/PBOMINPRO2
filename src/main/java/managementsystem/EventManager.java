/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managementsystem;

import eventmanagement.Event;
import java.util.ArrayList;
import java.util.Scanner;

public class EventManager { 
    private static final ArrayList<Event> events = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    // Tambah event baru
    public static void addEvent() {
        System.out.println("Enter Event Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Event Location: ");
        String location = scanner.nextLine();
        System.out.println("Enter Event Date (dd-mm-yyyy): ");
        String date = scanner.nextLine();

        Event newEvent = new Event(name, location, date);
        events.add(newEvent);
        System.out.println("Event successfully added.");
    }

    // Lihat semua event
    public static void viewEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
            return;
        }
        System.out.println("List of Events:");
        for (Event event : events) {
            event.displayEventDetails();
            System.out.println("----------------");
        }
    }

    // Hapus event berdasarkan nama
    public static void deleteEvent() {
        System.out.println("Enter the name of the event to delete: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getEventName().equalsIgnoreCase(name)) {
                events.remove(i);
                System.out.println("Event '" + name + "' has been deleted.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Event not found.");
        }
    }

    // Update event berdasarkan nama
    public static void updateEvent() {
        System.out.println("Enter the name of the event to update: ");
        String name = scanner.nextLine();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getEventName().equalsIgnoreCase(name)) {
                System.out.println("Enter new location: ");
                String newLocation = scanner.nextLine();
                System.out.println("Enter new date (dd-mm-yyyy): ");
                String newDate = scanner.nextLine();

                // Update event yang ada dengan data baru
                Event updatedEvent = new Event(name, newLocation, newDate);
                events.set(i, updatedEvent);
                System.out.println("Event updated successfully.");
                return;
            }
        }
        System.out.println("Event not found.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEvent Management System");
            System.out.println("1. Tambah Event");
            System.out.println("2. Melihat Events");
            System.out.println("3. Delete Event");
            System.out.println("4. Update Event");
            System.out.println("5. Exit");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline setelah input int

            switch (choice) {
                case 1:
                    addEvent();
                    break;
                case 2:
                    viewEvents();
                    break;
                case 3:
                    deleteEvent();
                    break;
                case 4:
                    updateEvent();
                    break;
                case 5:
                    System.out.println("Keluar dari sistem...");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Mohon coba lagi.");
            }
        }
    }
}
