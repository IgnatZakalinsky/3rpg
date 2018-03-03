package RegMaps.Act1.r1;

import RegMaps.Locs;

/**
 * вступление
 */
public class Loc1 extends Locs {


    @Override
    public String go() {
        return "2";
    }

    @Override
    public void info() {
        String s = "В одной далёкой далёкой деревне жил великий воин! (это вы)\n" +
                "...и решил он наконец покинуть родную деревню что бы покорить мир!\n" +
                "...однако перед тем как отправиться в путешествие нужно собрать снаряжение.\n\n";
        System.out.println(s);
    }
}
