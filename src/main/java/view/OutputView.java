package view;

import domain.model.Ladder;
import domain.model.Layer;
import domain.model.Player;
import domain.vo.Name;

import java.util.List;

public class OutputView {

    private static final String RESULT_ANNOUNCEMENT = "\n사다리 결과\n";
    private static final int INTERVAL_UNIT = 6;
    private static final String FRONT_SPACE = "     ";
    private static final String LINE_DELIMITER = "|";
    private static final String CONNECTED_LINE = "-----";
    private static final String UNCONNECTED_LINE = "     ";
    private static final String NAME_SPACE = " ";
    public void printResult(List<Name> names, Ladder ladder) {
        System.out.println(RESULT_ANNOUNCEMENT);
        printNames(names);
        printLadder(ladder);
    }
    public void printLadder(Ladder ladder) {
        for (Layer layer : ladder.getLayers()) {
            printLayer(layer);
        }
    }
    private void printLayer(Layer layer) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(FRONT_SPACE).append(LINE_DELIMITER);
        List<Boolean> lines = layer.getLines();
        lines.forEach(line -> stringBuilder.append(selectLine(line)).append(LINE_DELIMITER));
        System.out.println(stringBuilder);
    }
    private String selectLine(boolean line) {
        if (line) {
            return CONNECTED_LINE;
        }
        return UNCONNECTED_LINE;
    }
    public void printNames(final List<Name> names) {
        StringBuilder stringBuilder = new StringBuilder();
        names.forEach(name -> {
            int difference = INTERVAL_UNIT - name.get().length();
            stringBuilder.append(NAME_SPACE.repeat(difference)).append(name.get());
        });
        System.out.println(stringBuilder);
    }
}