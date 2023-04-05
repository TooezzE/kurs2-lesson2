public class Hogwards {
    private String studentName;
    private String departament;
    private int magicPower;
    private int trangressionDistance;

    public Hogwards(String studentName, String departament, int magicPower, int trangressionDistance) {
        this.studentName = studentName;
        this.departament = departament;
        this.magicPower = magicPower;
        this.trangressionDistance = trangressionDistance;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartament(){
        return departament;
    }

    public void setDepartament(String departament){
        this.departament = departament;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrangressionDistance() {
        return trangressionDistance;
    }

    public void setTrangressionDistance(int trangressionDistance) {
        this.trangressionDistance = trangressionDistance;
    }

    public static void printStudent(Hogwards student){
        System.out.print("Имя студента: " + student.getStudentName() +
                "{мощность колдовства = " + student.getMagicPower() +
                ", расстояние трангрессии = " + student.getTrangressionDistance() +
                '}' + " Факультет - ");
        if (student.getDepartament().equals("Гриффиндор")){
            Griffindor griffindorStudent = (Griffindor) student;
            griffindorStudent.printGriffindor();
        } else if(student.getDepartament().equals("Пуффендуй")){
            Puffendui puffenduiStudent = (Puffendui) student;
            puffenduiStudent.printPuffendui();
        } else if(student.getDepartament().equals("Когтевран")){
            Cogtevran cogtevranStudent = (Cogtevran) student;
            cogtevranStudent.printCogtevran();
        } else if(student.getDepartament().equals("Слизерин")){
            Slizerin slizerinStudent = (Slizerin) student;
            slizerinStudent.printSlizerin();
        }
    }

    public static void mostPowerfulStudent(Hogwards firstStudent, Hogwards secondStudent){
        if((firstStudent.getMagicPower() + firstStudent.getTrangressionDistance()) > (secondStudent.getMagicPower() + secondStudent.getTrangressionDistance())){
            System.out.println(firstStudent.getStudentName() + " обладает большей мощностью магии чем " + secondStudent.getStudentName());
        } else if((firstStudent.getMagicPower() + firstStudent.getTrangressionDistance()) < (secondStudent.getMagicPower() + secondStudent.getTrangressionDistance())){
            System.out.println(secondStudent.getStudentName() + " обладает большей мощностью магии чем " + firstStudent.getStudentName());
        } else {
            System.out.println("Студенты " + firstStudent.getStudentName() + " и " + secondStudent.getStudentName() + " одинаково сильны в магии");
        }
    }
}
