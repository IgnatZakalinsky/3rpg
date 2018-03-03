package RegMaps.Act1.r1;

import RegMaps.Locs;

public class Loc2_3 extends Locs {
    @Override
    public String go() {
        return "2";
    }

    @Override
    public void info() {
        String s = "(не реализовано)\n" +
                "переход в соседние локации: лес, озеро, дорога в город, ...\n";
        System.out.println(s);
    }
}
