package cn.pluto.po;

import java.util.List;

public class KindCustom extends Kind {
    private List<Journal> journals;

    public List<Journal> getJournals() {
        return journals;
    }

    public void setJournals(List<Journal> journals) {
        this.journals = journals;
    }
}
