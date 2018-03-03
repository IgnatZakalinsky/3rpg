package RegMaps.Act1.r1;

import RegMaps.RegMap;
import Start.Start;

public class RegMap1 extends RegMap {
    public RegMap1(String loc) {
        super(loc);
    }

    @Override
    public void go() {
        while (!this.exit) {
            switch (loc) {
                case "1":
                    l = new Loc1();
                    setLoc(l.go());
                    break;
                case "2":
                    l = new Loc2();
                    setLoc(l.go());
                    break;
                case "2_1":
                    l = new Loc2_1();
                    setLoc(l.go());
                    break;
                case "2_2":
                    l = new Loc2_2();
                    setLoc(l.go());
                    break;
                case "2_3":
                    l = new Loc2_3();
                    setLoc(l.go());
                    break;

                default:
                    setExit();
                    Start.exit = true;
            }
        }
    }

    @Override
    public void setLoc(String loc) {
        this.loc = loc;
    }
}
