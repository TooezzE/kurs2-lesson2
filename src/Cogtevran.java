public class Cogtevran extends Hogwards{
    private int clever;
    private int wisdom;
    private int wittiness;
    private int creative;

    public Cogtevran(String studentName, String departament, int magicPower, int trangressionDistance, int clever, int wisdom, int wittiness, int creative) {
        super(studentName, departament, magicPower, trangressionDistance);
        this.clever = clever;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creative = creative;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public void printCogtevran () {
        System.out.println("Когтевран: " + "качества{" +
                "ум = " + clever +
                ", мудрость = " + wisdom +
                ", остроумие = " + wittiness +
                ", творчество = " + creative +
                '}');
    }

    public static Cogtevran bestStudentCogtevran(Cogtevran[] cogtevranStidents){
        Cogtevran bestStudent = null;
        int sum = 0;
        for (int i = 0; i < cogtevranStidents.length; i++) {
            if((cogtevranStidents[i].getClever() + cogtevranStidents[i].getWisdom() + cogtevranStidents[i].getWittiness() + cogtevranStidents[i].getCreative()) > sum){
                sum = (cogtevranStidents[i].getClever() + cogtevranStidents[i].getWisdom() + cogtevranStidents[i].getWittiness() + cogtevranStidents[i].getCreative());
                bestStudent = cogtevranStidents[i];
            }
        }
        System.out.println("Лучший студент Когтеврана: " + bestStudent.getStudentName());
        return bestStudent;
    }
}
