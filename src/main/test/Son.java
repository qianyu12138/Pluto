import java.util.List;

public class Son extends Father {
    private List<Son2> sons;

    public List<Son2> getSons() {
        return sons;
    }

    public void setSons(List<Son2> sons) {
        this.sons = sons;
    }

    @Override
    public String toString() {
        return "Son{" +
                "sons=" + sons +
                '}'+super.getName();
    }

}
