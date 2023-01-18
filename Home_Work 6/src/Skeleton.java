public class Skeleton extends Boss{
    private int shot;

    public int getShot() {
        return shot;
    }

    public void setShot(int shot) {
        this.shot = shot;
    }

    @Override
    public String printinfo() {
        return super.printinfo() + "number of arrows: " + shot;
    }
}
