package RegMaps;

/**
 * шаблон для региональных катр местности
 */
public abstract class RegMap {

    protected Locs l;
    protected String loc;
    protected boolean exit = false;

    public RegMap(String loc) {
        setLoc(loc);
    }

    public abstract void go();

    /**
     * установка локации на региональной карте
     */
    public abstract void setLoc(String loc);

    protected final void setExit() {
        exit = true;
    }
}
