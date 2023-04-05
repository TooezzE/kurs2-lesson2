public class Slizerin extends Hogwards{
    private int cunning;
    private int resolve;
    private int ambition;
    private int resourse;
    private int lustForPower;

    public Slizerin(String studentName, String departament, int magicPower, int trangressionDistance, int cunning, int resolve, int ambition, int resourse, int lustForPower) {
        super(studentName, departament, magicPower, trangressionDistance);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.resourse = resourse;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourse() {
        return resourse;
    }

    public void setResourse(int resourse) {
        this.resourse = resourse;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void printSlizerin () {
        System.out.println("Слизерин: " + "качества{" +
                "хитрость = " + cunning +
                ", решительность = " + resolve +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourse +
                ", жажда власти = " + lustForPower +
                '}');
    }

    public static Slizerin bestStudentSlizerin(Slizerin[] slizerinStudents){
        Slizerin bestStudent = null;
        int sum = 0;
        for (int i = 0; i < slizerinStudents.length; i++) {
            if((slizerinStudents[i].getCunning() + slizerinStudents[i].getResolve() + slizerinStudents[i].getAmbition() + slizerinStudents[i].getResourse() + slizerinStudents[i].getLustForPower()) > sum){
                sum = (slizerinStudents[i].getCunning() + slizerinStudents[i].getResolve() + slizerinStudents[i].getAmbition() + slizerinStudents[i].getResourse() + slizerinStudents[i].getLustForPower());
                bestStudent = slizerinStudents[i];
            }
        }
        System.out.println("Лучший студент Гриффиндора: " + bestStudent.getStudentName());
        return bestStudent;
    }
}
