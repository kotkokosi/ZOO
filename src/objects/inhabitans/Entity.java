package objects.inhabitans;

public abstract class Entity {
    private String name;
    private String icon;

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public Entity(String name, String icon) {
        this.name = name;
        this.icon = icon;
    }
}
