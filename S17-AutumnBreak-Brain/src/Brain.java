public class Brain {

    private String activeMemoryItem;
    private String passiveMemoryItemOne;
    private String passiveMemoryItemTwo;

    public Brain() {
        activeMemoryItem = "";
        passiveMemoryItemOne = "";
        passiveMemoryItemTwo = "";
    }

    public int getIQ() {
        if (activeMemoryItem.length() > 10 && passiveMemoryItemOne.length() > 10 && passiveMemoryItemTwo.length() > 10) {
            if (activeMemoryItem.length() > 20 || passiveMemoryItemOne.length() > 20 || passiveMemoryItemTwo.length() > 20) return 130;
            return 100;
        }
        return 70;
    }

    public void remember(String info) {
        refreshMemory(info);
        if (activeMemoryItem.equals(info)) return;
        passiveMemoryItemTwo = passiveMemoryItemOne;
        passiveMemoryItemOne = activeMemoryItem;
        activeMemoryItem = info;
    }

    public void refreshMemory(String info) {
        String temp;
        if (info.equals(passiveMemoryItemOne)) {
            temp = activeMemoryItem;
            activeMemoryItem = passiveMemoryItemOne;
            passiveMemoryItemOne = temp;
        } else if (info.equals(passiveMemoryItemTwo)) {
            temp = activeMemoryItem;
            activeMemoryItem = passiveMemoryItemTwo;
            passiveMemoryItemTwo = temp;
        }
    }

    public boolean recall(String info) {
        if (info.equals(activeMemoryItem) || info.equals(passiveMemoryItemOne) || info.equals(passiveMemoryItemTwo)) {
            refreshMemory(info);
            return true;
        }
        return false;
    }

    public String recall() {
        return activeMemoryItem;
    }

    public void bringPassiveToActive(int number) {
        String temp = activeMemoryItem;
        if (number == 1) {
            activeMemoryItem = passiveMemoryItemOne;
            passiveMemoryItemOne = temp;
        } else if (number == 2) {
            activeMemoryItem = passiveMemoryItemTwo;
            passiveMemoryItemTwo = passiveMemoryItemOne;
            passiveMemoryItemOne = temp;
        }
    }
}
