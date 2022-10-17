public class Sponsor {
    String nameCompany;
    int supportSum;

    public Sponsor(String nameCompany, int supportSum) {
        this.nameCompany = nameCompany;
        this.supportSum = supportSum;
    }
    public void toSponsor(){
        System.out.printf("Спонсор \"%s\" спонсировал заезд %d%n", nameCompany,supportSum);
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public int getSupportSum() {
        return supportSum;
    }
}
