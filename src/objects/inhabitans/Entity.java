package objects.inhabitans;

import lombok.Setter;

@Setter
public abstract class Entity {
    private String name;
    private String icon;

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
