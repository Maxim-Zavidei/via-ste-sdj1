package model;

public class CdModelManager implements CdModel {

    private CdList list;

    public CdModelManager() {
        list = new CdList();
    }

    @Override
    public Cd getCd(int index) {
        return list.getCd(index);
    }

    @Override
    public CdList getCdsByTitle(String title) {
        return list.getCdsByTitle(title);
    }

    @Override
    public int getNumberOfCds() {
        return list.getNumberOfCds();
    }

    @Override
    public void addCd(Cd cd) {
        list.addCd(cd);
    }

    @Override
    public Cd removeFirstCdByTitle(String title) {
        return list.removeFirstCdByTitle(title);
    }

    @Override
    public void clear() {
        list = null;
    }
}
