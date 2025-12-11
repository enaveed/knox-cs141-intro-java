import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.List;

public class AppDataAnalysis {
public static void main(String[] args) throws Exception 
{ 
// countBirthdays();
// tagsContainsAI();
// count1900s();
// countEventsOnFriday();
// tagsContains("Literature");

mostCommonTag();
maximum(); 
minimum(); 
average();
subset(); 
countUser("enaveed"); 
noDuplicates(); 
eventsPerUser(); 
countEventsByYear(2003);


}
// countBirthdays();
public static void countBirthdays() throws Exception { List<Event> events = Event.getEvents();
int numBirthdays = 0;
for (Event event : events) {
if (event.getType().equals("Birthday")) 
  {
  numBirthdays++; 
  }
}
System.out.println("Total birthdays: " + numBirthdays); 
}

// tagsContainsAI();
public static void tagsContainsAI() throws Exception 
{ 
    List<Event> events = Event.getEvents();
    int numAI = 0;
    for (Event event : events) {
    if (event.getTags().contains("AI")) 
    {
     System.out.println(event.getName());
     numAI++; 
    }
}
System.out.println("Events with 'AI' tag: " + numAI); 
}

// tagContains();
public static void tagsContains(String word) throws Exception 
{ List<Event> events = Event.getEvents();
int num = 0;
for (Event event : events) {
if (event.getTags().contains(word)) 
{
System.out.println(event.getName());
num++; 
}
}
System.out.println("Events with '" + word + "' tag: " + num); 
}


// count1900s();
public static void count1900s() throws Exception 
{ List<Event> events = Event.getEvents();
int num1900s = 0;
for (Event event : events) 
{
int year = event.getDate().getYear(); if (year >= 1900 && year < 2000) {
num1900s++;
 }
}

System.out.println("Events in the 1900s: " + num1900s);
}
public static void countEventsOnFriday() throws Exception 
{ 
    
 List<Event> events = Event.getEvents();
 int numFriday = 0;
 for (Event event : events) {
 if (event.getDate().getDayOfWeek() == DayOfWeek.FRIDAY){
  numFriday++;
  }
}

System.out.println("Total events: " + events.size());
System.out.println("Events on Fridays: " + numFriday);}


//mostCommonTag();
public static void mostCommonTag() throws Exception {

List<Event> events = Event.getEvents();
HashMap<String, Integer> tagCounts = new HashMap<>();
for (Event event : events) 
 {
 for (String tag : event.getTags())
 {
 tagCounts.put(tag, tagCounts.getOrDefault(tag, 0) + 1);
 }
}

String mostCommonTag = null; int mostCommonTagCount = 0;
for (String tag : tagCounts.keySet()) { int count = tagCounts.get(tag);
if (count > mostCommonTagCount) 
{
mostCommonTag = tag;
mostCommonTagCount = count;
}
}

System.out.println("Most common tag: " + mostCommonTag);
System.out.println("Count: " + mostCommonTagCount);

}

public static void maximum() throws Exception { List<Event> events = Event.getEvents();

int maxtag = 0;
for (Event event : events){
int count = event.getTags().size(); if (count > maxtag) 
 {
maxtag = count; 
 }
}

System.out.println("Maximum number of tags: " + maxtag);

}

//minimum();
public static void minimum() throws Exception { List<Event> events = Event.getEvents();
int mintag = Integer.MAX_VALUE;
for (Event event : events) {
int count = event.getTags().size(); if (count < mintag) {
mintag = count;}

}

 System.out.println("Minimum number of tags: " + mintag);

}

// average();
public static void average() throws Exception { List<Event> events = Event.getEvents(); double totalTags = 0;
for (Event event : events) 
{
totalTags += event.getTags().size();
}

System.out.println("Average number of tags: " + totalTags / events.size());

}

//subset();
public static void subset() throws Exception { List<Event> events = Event.getEvents(); int totalMLBCount = 0;
int maxTags = 0;
int minTags = Integer.MAX_VALUE; double totalTags = 0;
for (Event event : events) 
{
boolean hasMLB = event.getTags().contains("MLB"); if (hasMLB) 
{
int tagCount = event.getTags().size(); totalMLBCount++;
totalTags += tagCount;
if (tagCount > maxTags) 
  { 
    maxTags = tagCount;
  }
  if (tagCount < minTags) 
  {
  minTags = tagCount; 
  }
 } 
}

double averageTags = totalMLBCount > 0 ? totalTags / totalMLBCount : 0;
System.out.println("MLB count: " + totalMLBCount); System.out.println("Maximum tags: " + maxTags); System.out.println("Minimum tags: " + (minTags == Integer.MAX_VALUE ? 0 :
minTags));
System.out.println("Average tags: " + averageTags);
}

//countUser();
public static void countUser(String user) throws Exception {

 List<Event> events = Event.getEvents(); int count = 0;
for (Event event : events) 
{
if (event.getUsername().equals(user)) 
 {
count++;
 }
}

System.out.println("Events by " + user + ": " + count); 

}

//noDuplicates();
public static void noDuplicates() throws Exception { List<Event> events = Event.getEvents();
int duplicateCount = 0;
String[] duplicates = new String[events.size()];
for (int i = 0; i < events.size(); i++)
{
for (int j = i + 1; j < events.size(); j++) 
{
if (events.get(i).getName().equals(events.get(j).getName()))
{ 
    boolean alreadyListed = false;
    for (int k = 0; k < duplicateCount; k++) 
{

if (duplicates[k].equals(events.get(i).getName())) 
  { 
    alreadyListed = true;
    break;
 } 

  }
  if (!alreadyListed) 
  {
  duplicates[duplicateCount++] = events.get(i).getName();
  } 
 }
} 
}

System.out.println("Duplicate events: " + duplicateCount);

}


//eventsPerUser();
public static void eventsPerUser() throws Exception {
    List<Event> events = Event.getEvents();
    HashMap<String, Integer> userEventCount = new HashMap<>();

    for (Event event : events) {
        String username = event.getUsername();
        userEventCount.put(username, userEventCount.getOrDefault(username, 0) + 1);
    }

    for (String user : userEventCount.keySet())
    {
        System.out.println("User " + user + " has created " + userEventCount.get(user) + " events.");
    }
}

//countEventsByYear();
public static void countEventsByYear(int year) throws Exception {
    List<Event> events = Event.getEvents();
    int count = 0;

    for (Event event : events) {
        if (event.getDate().getYear() == year) {
            count++;
        }
    }

    System.out.println("Events in year " + year + ": " + count);
}

}





