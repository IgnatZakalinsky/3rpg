package RegMaps;

import RegMaps.Act1.r1.RegMap1;
import Start.Start;

/**
 * установка стартовой региональной карты
 */
public class RegMapStart extends RegMap {

    public RegMapStart(String loc) {
        super(loc);
    }

    public RegMap set() {
        return new RegMap1("1");
    }

    @Override
    public void go() {
        Start.exit = true;
        System.out.println("error: Стартовый класс не задан");
    }

    @Override
    public void setLoc(String loc) {
        this.loc = "0";
        if (!loc.equals("0")) System.out.println("error: Попытка установить локацию в техническом RegMapStart");
    }
}
