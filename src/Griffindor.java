public class Griffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int brave;

    public Griffindor(String studentName, String departament, int magicPower, int trangressionDistance, int nobility, int honor, int brave) {
        super(studentName, departament, magicPower, trangressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public void printGriffindor () {
        System.out.println("Гриффиндор: " + "качества{" +
                "благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + brave +
                '}');
    }

    public static Griffindor bestStudentGriffindor(Griffindor[] griffindorStudents){
        Griffindor bestStudent = null;
        int sum = 0;
        for (int i = 0; i < griffindorStudents.length; i++) {
            if((griffindorStudents[i].getNobility() + griffindorStudents[i].getHonor() + griffindorStudents[i].getBrave()) > sum){
                sum = (griffindorStudents[i].getNobility() + griffindorStudents[i].getHonor() + griffindorStudents[i].getBrave());
                bestStudent = griffindorStudents[i];
            }
        }
        System.out.println("Лучший студент Гриффиндора: " + bestStudent.getStudentName());
        return bestStudent;
    }
}
