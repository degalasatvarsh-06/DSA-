import java.util.*;

/* USER CLASS */
class User {
    String username;
    String password;
    String branch;
    String college;

    User(String u, String p, String b, String c){
        username = u;
        password = p;
        branch = b;
        college = c;
    }
}

/* NODE FOR LINKED LIST */
class Node{
    User data;
    Node next;

    Node(User u){
        data = u;
        next = null;
    }
}

/* LINKED LIST FOR USERS */
class UserList{

    Node head;

    void addUser(User u){

        Node newNode = new Node(u);

        if(head == null){
            head = newNode;
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}

/* MAIN PROGRAM */
public class CareerPlatform {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        UserList users = new UserList();

        System.out.println("===== CREATE ACCOUNT =====");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Your Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Your College Name: ");
        String college = sc.nextLine();

        User newUser = new User(username,password,branch,college);
        users.addUser(newUser);

        System.out.println("\nLogin Successful!");

        /* Internship List */
        String internships[] = {
                "Google Software Internship",
                "Microsoft Student Internship",
                "Amazon Technical Internship",
                "Deloitte Technology Internship",
                "TCS Graduate Internship"
        };

        /* Bubble Sort (Sorting Opportunities) */
        for(int i=0;i<internships.length-1;i++){
            for(int j=0;j<internships.length-i-1;j++){

                if(internships[j].compareTo(internships[j+1]) > 0){

                    String temp = internships[j];
                    internships[j] = internships[j+1];
                    internships[j+1] = temp;

                }
            }
        }

        System.out.println("\n===== AVAILABLE INTERNSHIPS =====");

        for(String i:internships){
            System.out.println(i);
        }

        /* Linear Search */
        System.out.print("\nSearch Internship: ");
        String search = sc.nextLine();

        boolean found=false;

        for(String i:internships){

            if(i.toLowerCase().contains(search.toLowerCase())){
                System.out.println("Internship Found: "+i);
                found=true;
            }
        }

        if(!found){
            System.out.println("Internship Not Found");
        }

        /* Queue for Applications */
        Queue<String> applications = new LinkedList<>();

        applications.add("Google Internship Application");
        applications.add("Microsoft Internship Application");

        System.out.println("\n===== APPLICATION QUEUE =====");

        while(!applications.isEmpty()){

            System.out.println("Processing: "+applications.poll());

        }

        /* Stack for Career Tips */
        Stack<String> tips = new Stack<>();

        tips.push("Build strong programming skills.");
        tips.push("Practice Data Structures and Algorithms.");
        tips.push("Work on real-world projects.");
        tips.push("Participate in hackathons.");

        System.out.println("\n===== CAREER SUCCESS TIPS =====");

        while(!tips.isEmpty()){

            System.out.println(tips.pop());

        }

    }
}