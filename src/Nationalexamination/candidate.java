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
}
