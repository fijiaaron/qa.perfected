package qa.perfected.model;

public class TestResult {
    public Test test;
    public Progress state;
    public Status status;


    public enum Progress {
        Not_Started, In_Progress, Completed, Blocked, Skipped
    }

    public enum Status {
        Passed, Failed, NA
    }
}
