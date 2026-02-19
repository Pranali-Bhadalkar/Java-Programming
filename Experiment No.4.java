//Program based on concept of Multiple inheritance by using interface.
//( Smart Employee Role System (Using Multiple Interfaces) )

interface Developer {
    void writeCode();
}

interface Manager {
    void conductMeeting();
}

class TeamLead implements Developer, Manager {

    public void writeCode() {
        System.out.println("Team Lead is writing code for the project.");
    }

    public void conductMeeting() {
        System.out.println("Team Lead is conducting a project meeting.");
    }
}

public class SmartEmployeeRoleSystem {
    public static void main(String[] args) {
        TeamLead tl = new TeamLead();
        tl.writeCode();
        tl.conductMeeting();
    }
}



 



