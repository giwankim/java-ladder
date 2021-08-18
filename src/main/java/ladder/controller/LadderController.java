package ladder.controller;

import ladder.domain.ladder.Ladder;
import ladder.domain.player.PlayerNames;
import ladder.view.InputView;
import ladder.view.ResultView;

public class LadderController {

    private LadderController() {
    }

    public static void run() {
        PlayerNames names = PlayerNames.of(InputView.playerNames());
        Ladder ladder = Ladder.of(InputView.ladderHeight(), names.size());
        ResultView.printResult(ladder, names);
    }
}
