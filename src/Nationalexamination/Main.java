package Nationalexamination;

public class Main {
    public static void main(String[] args) {
        System.out.println("Candidate Registration System");
        // Creating the first candidate
        candidate candidate1 = new candidate("john", "Makerere High School");
        candidate1.showCandidateInfo();
    }
