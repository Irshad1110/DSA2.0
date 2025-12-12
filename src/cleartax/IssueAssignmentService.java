package cleartax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueAssignmentService {

    private Map<String, Issue> issueMap = new HashMap<>();
    private Map<String, Agent> agentMap = new HashMap<>();


    //createIssue(transactionId, issueType, subject, description, email)
//addAgent(agentEmail, agentName ,List<issueType>)
//assignIssue(issueId) // -> Issue can be assigned to the agents based on different strategies. For now, assign to any one of the free agents.
//getIssues(filter) // -> issues against the provided filter
//updateIssue(issueId, status, resolution)
//resolveIssue(issueId, resolution)
//viewAgentsWorkHistory() // -> a list of issue which agents worked on



    public void createIssue(String transactionId,
                             IssueType issueType,
                             String subject,
                             String description,
                             String userEmail) {
        Issue issue = new Issue(transactionId, issueType, subject, description, userEmail);
        issueMap.put(transactionId, issue);
        System.out.println("Issue " + issue.transactionId +" created");
    }

    public void addAgent(String agentEmail,
                         String agentName) {
        Agent agent = new Agent(agentEmail, agentName);
        agentMap.put(agentEmail, agent);
        System.out.println("Agent " + agentName + " created");
    }

    public void assignIssue(String id) {
        Issue issue = issueMap.get(id);
        for(Agent agent : agentMap.values()) {
            if(!agent.busy) {
                agent.busy = true;
                agent.workHistory.add(issue.transactionId);
                issue.assignedAgentEmail = agent.agentEmail;
                System.out.println("Issue "+ issue.transactionId+ " assigned to agent " + agent.agentName);
                return;
            } else {
                agent.agentIssues.add(issue);
                System.out.println("issue added to waitlist of " + agent.agentName);
            }
        }
    }

    public void updateIssue(String id, IssueStatus status, String resolution) {
        Issue issue = issueMap.get(id);
        issue.issueStatus = status;
        issue.resolution = resolution;

        if(status == IssueStatus.RESOLVED) {
            System.out.println("issue resolved " + issue.transactionId);
            Agent agent = agentMap.get(issue.assignedAgentEmail);
            assignNextIssue(agent);
        }

    }

    public void assignNextIssue(Agent agent) {
        if(agent.agentIssues.isEmpty()) {
            agent.busy = false;
        }

        Issue issue = agent.agentIssues.poll();
        issue.assignedAgentEmail = agent.agentEmail;;
        issue.issueStatus = IssueStatus.IN_PROGRESS;
        agent.busy = true;
        System.out.println("Issue "+ issue.transactionId+ " assigned to agent " + agent.agentName);
    }
}
