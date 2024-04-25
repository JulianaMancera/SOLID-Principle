//Implementing the interface Notification

public class NotificationAction implements Notification {
    
    @Override 
    public void sendEmailNotification(String email){
        
        // Simulate sending email notification
        System.out.println("Email notification sent to: "+ email);
    }
}
