package art.ironcoding.recursion;

import java.util.ArrayList;
import java.util.List;

public class Component {

    private String name;
    private List<Component> sons;
    private int level;

    public Component addSon(Component component) {
        this.sons.add(component);
        return this;
    }

    public boolean hasSon() {
        return !this.sons.isEmpty();
    }

    public Component(String name) {
        this.name = name;
        this.sons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getSons() {
        return sons;
    }

    public void setSons(List<Component> sons) {
        this.sons = sons;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
