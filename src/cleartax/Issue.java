package cleartax;



public class Issue {

    String transactionId;
    IssueType issueType;
    String subject;
    String description;
    String userEmail;
    String assignedAgentEmail;
    String resolution;
    IssueStatus issueStatus;


    public Issue(String transactionId,
                 IssueType issueType,
    String subject,
    String description,
    String userEmail) {
        this.transactionId = transactionId;
        this.issueType = issueType;
        this.subject = subject;
        this.description = description;
        this.userEmail = userEmail;
    }
}
