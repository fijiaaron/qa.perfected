package qa.perfected.model;

import java.util.List;

public class Defect {
    public String id;
    public String summary;
    public String details;
    public List<String> comments;

    public Product product;
    public Feature feature;
    public Requirement requirement;
    public Test test;
}
