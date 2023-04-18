package org.example.TaskManager.services;

public class EpicTask extends Task {
    protected String title;
    protected String[] subtasks;

    public EpicTask(int id, String[] subtasks) {
        super(id);
        this.title = title;
        this.subtasks = subtasks;
    }

    public String getTitle() {
        return title;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.contains(query)) {
                return true;
            }
        }
        return false;
    }
}
