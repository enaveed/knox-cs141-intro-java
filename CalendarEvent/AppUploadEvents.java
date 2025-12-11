import java.util.List;

public class AppUploadEvents 
{
    public static void main(String[] args) throws Exception
    {
        // TODO: fill in your events that you have created into newevents.json
        // or put them into another file and change the name
        String filename = "newevents.json";
        //String filename = "example.json";
        
        // TODO: your email username, i.e. jspacco
        String username = "enaveed";
        
        // TODO: this password won't work; replace with your own
        String password = "8f731943";
        
        // the address of the server
        // leave this as is
        String address = "http://euclid.knox.edu:8888/events";

        List<Event> events = Event.getEvents(filename);
        System.out.println("Successfully found " + events.size() + " events");

        EventClient client = new EventClient();

        for (Event event : events)
        {
            client.postEvent(address, event, username, password);
        }
        System.out.println("Successfully uploaded " + events.size() + " events");
    }
}
