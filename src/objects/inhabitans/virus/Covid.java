package objects.inhabitans.virus;

import interfaces.Resident;

public class Covid extends Virus implements Resident {
    public Covid(String name, String icon) {
        super(name, icon);
    }
}
