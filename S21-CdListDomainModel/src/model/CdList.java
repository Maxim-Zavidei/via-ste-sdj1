package model;

import java.util.ArrayList;

public class CdList {

    private ArrayList<Cd> cds;

    public CdList() {
        this.cds = new ArrayList<>();
    }

    public Cd getCd(int index) {
        return cds.get(index);
    }

    public CdList getCdsByTitle(String title) {
        CdList toReturn = new CdList();
        for (Cd cd : cds) if (cd.getTitle().equals(title)) toReturn.addCd(cd);
        return toReturn;
    }

    public int getNumberOfCds() {
        return cds.size();
    }

    public void addCd(Cd cd) {
        cds.add(cd);
    }

    public void removeCdByIndex(int index) {
        cds.remove(index);
    }

    public Cd removeFirstCdByTitle(String title) {
        for (Cd cd : cds) if (cd.getTitle().equals(title)) {
            cds.remove(cd);
            return cd;
        }
        return null;
    }

    @Override
    public String toString() {
        return "CdList{" + "cds=" + cds + '}';
    }
}
