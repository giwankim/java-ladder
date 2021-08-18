package ladder.domain.player;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class PlayerNames {

    private final List<PlayerName> names;

    public PlayerNames(List<PlayerName> names) {
        validate(names);
        this.names = names;
    }

    public static PlayerNames of(List<String> names) {
        List<PlayerName> rawNames = names.stream()
                .map(PlayerName::of)
                .collect(Collectors.toList());
        return new PlayerNames(rawNames);
    }

    public int size() {
        return names.size();
    }

    public int maxNameLength() {
        return names.stream()
                .mapToInt(PlayerName::length)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public List<PlayerName> getNames() {
        return names;
    }

    private void validate(List<PlayerName> names) {
        if (names == null || names.isEmpty()) {
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "PlayerNames{" +
                "names=" + names +
                '}';
    }
}
