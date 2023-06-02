package gerenciador.midias;

public class Action {
    private String action = "Action";

    public String getAction() {
        return action;
    }

    public Action(String action) {
        this.action = action;

    }

    @Override
    public String toString() {
        return "Action{" +
                "Action:='" + action + '\'' +
                '}';
    }
}

