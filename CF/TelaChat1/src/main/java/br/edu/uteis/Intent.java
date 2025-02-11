package br.edu.uteis;

public class Intent {
    
    private String id;
    private String name;
    private double confidence;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }
    
    @Override
    public String toString() {
        return name;
    }
}