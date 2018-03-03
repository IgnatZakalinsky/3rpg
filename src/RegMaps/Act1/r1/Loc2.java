package RegMaps.Act1.r1;

import RegMaps.Locs;
import Start.Start;

public class Loc2 extends Locs {

    @Override
    public String go() {
        return "2_" + Start.in();
    }

    @Override
    public void info() {
        String s = "Великий воин стоит посреди родной деревни и его вновь мучает вопрос:\n" +
                "Куда же пойти?\n" +
                "\n" +
                "1 - Наведаться в дом родителей\n" +
                "2 - Поискать работу\n" +
                "3 - покинуть деревню\n\n";
        System.out.println(s);

    }
}
