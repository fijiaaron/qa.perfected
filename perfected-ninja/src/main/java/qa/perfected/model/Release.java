package qa.perfected.model;

import java.util.List;

public class Release {
    public String id;
    public String releaseName;
    public String description;
    public List<String> comments;

    public Product product;
    public List<Feature> features;

    public List<TestRun> testRuns;
}
