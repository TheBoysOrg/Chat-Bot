package br.edu.uteis;

import java.util.List;
import java.util.Map;

public class Bot {
    
    private String text;
    private List<Intent> intents;
    private Map<String, Object> entities;
    private Map<String, Object> traits;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Intent> getIntents() {
        return intents;
    }

    public void setIntents(List<Intent> intents) {
        this.intents = intents;
    }

    public Map<String, Object> getEntities() {
        return entities;
    }

    public void setEntities(Map<String, Object> entities) {
        this.entities = entities;
    }

    public Map<String, Object> getTraits() {
        return traits;
    }

    public void setTraits(Map<String, Object> traits) {
        this.traits = traits;
    }
    
    @Override
    public String toString() {
        return String.valueOf(intents.get(0));
    }
    
}
