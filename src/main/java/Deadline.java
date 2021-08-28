package ip.src.main.java;

public class Deadline extends Task {

    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String description() {
        return description + " (by: " + by + ")";
    }
}