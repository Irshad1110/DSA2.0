package cleartax;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Agent {

    String agentEmail;
    String agentName;
    Queue<Issue> agentIssues = new LinkedList<>();
    List<String> workHistory = new ArrayList<>();
    boolean busy = false;

    public Agent(String agentEmail,
    String agentName) {
        this.agentEmail = agentEmail;
        this.agentName = agentName;

    }

}
