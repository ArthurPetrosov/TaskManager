package org.example.TaskManager.services;

public class Meeting extends Task {

    protected String title;
    protected String topic;
    protected String project;
    protected String start;

    public Meeting(int id, String title, String topic, String project, String start) {
        super(id);
        this.title = title;
        this.topic = topic;
        this.project = project;
        this.start = start;
    }

    public String getTitle() {
        return title;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}