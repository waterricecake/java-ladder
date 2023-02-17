package domain.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Layer {

    private final List<Boolean> lines;

    public Layer() {
        this.lines = new ArrayList<>();
    }

    public void makeLine(final boolean condition) {
        if (condition && lines.isEmpty()) {
            lines.add(true);
            return;
        }
        if (condition && !lines.get(lines.size() - 1)) {
            lines.add(true);
            return;
        }
        lines.add(false);
    }

    public List<Boolean> getLines() {
        return Collections.unmodifiableList(lines);
    }
}
