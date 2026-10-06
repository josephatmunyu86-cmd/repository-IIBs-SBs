package Nationalexamination;

public class candidate {
    String candidateName;
    String schoolName;
    static String examYear;
    static int registrationFee;
    static String gradingPolicy;
    String registrationStatus;
    String examinationCentre;
    {
        registrationStatus = "Not Registered";
        examinationCentre = "Not Assigned";
        System.out.println("IIB Invoked");
    }
    // Static Initialization Block
    static {
        examYear = "2026";
        registrationFee = 50000;
        gradingPolicy = "A = 80-100, B = 70-79, C = 60-69, D = 50-59, F = Below 50";
        System.out.println("Static Block Invoked");
    }
    // Constructor
    public candidate(String candidateName, String schoolName) {
        this.candidateName= candidateName;
        this.schoolName= schoolName;
        System.out.println("Constructor Invoked");
    }
    // Method to display candidate information
    public void showCandidateInfo() {
        System.out.println("Candidate Name: " + candidateName);
        System.out.println("School Name: " + schoolName);
        System.out.println("Exam Year: " + examYear);
        System.out.println("Registration Fee: UGX " + registrationFee);
        System.out.println("Grading Policy: " + gradingPolicy);
        System.out.println("Registration Status: " + registrationStatus);
        System.out.println("Examination Centre: " + examinationCentre);
    }
}
