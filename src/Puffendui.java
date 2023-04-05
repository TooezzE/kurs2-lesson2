public class Puffendui extends Hogwards {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendui(String studentName, String departament, int magicPower, int trangressionDistance, int industriousness, int loyalty, int honesty) {
        super(studentName, departament, magicPower, trangressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void printPuffendui() {
        System.out.println("Пуффендуй: " + "качества{" +
                "трудолюбие = " + industriousness +
                ", верность = " + loyalty +
                ", честность = " + honesty +
                '}');
    }

    public static Puffendui bestStudentPuffendui(Puffendui[] puffenduiStudents){
        Puffendui bestStudent = null;
        int sum = 0;
        for (int i = 0; i < puffenduiStudents.length; i++) {
            if((puffenduiStudents[i].getIndustriousness() + puffenduiStudents[i].getLoyalty() + puffenduiStudents[i].getHonesty()) > sum){
                sum = (puffenduiStudents[i].getIndustriousness() + puffenduiStudents[i].getLoyalty() + puffenduiStudents[i].getHonesty());
                bestStudent = puffenduiStudents[i];
            }
        }
        System.out.println("Лучший студент Пуффендуя: " + bestStudent.getStudentName());
        return bestStudent;
    }
}
