package ladder.domain.impl;

import java.util.List;
import ladder.domain.engine.Line;

public class MyLine implements Line {

    private final List<Tile> tiles;

    private MyLine(List<Tile> tiles) {
        this.tiles = tiles;
    }

    public static MyLine of(List<Tile> tiles) {
        return new MyLine(tiles);
    }

    @Override
    public int permute(int source) {
        return tiles.get(source).permute();
    }

    public List<Tile> getTiles() {
        return tiles;
    }
}
