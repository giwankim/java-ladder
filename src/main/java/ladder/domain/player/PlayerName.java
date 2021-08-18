package ladder.domain.player;

public class PlayerName {

    private final String name;

    public PlayerName(String name) {
        validate(name);
        this.name = name;
    }

    public static PlayerName of(String name) {
        return new PlayerName(name);
    }

    public int length() {
        return name.length();
    }

    public String value() {
        return name;
    }

    private void validate(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException();
        }
        if (name.length() > 5) {
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "PlayerName{" +
                "name='" + name + '\'' +
                '}';
    }
}
