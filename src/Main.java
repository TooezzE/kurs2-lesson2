public class Main {
    public static void main(String[] args) {
        Griffindor student1 = new Griffindor("Гарри Поттер", "Гриффиндор", 56, 44, 56, 86, 99);
        Griffindor student2 = new Griffindor("Гермиона Грейнджер", "Гриффиндор",88, 65, 20, 80, 67);
        Griffindor student3 = new Griffindor("Рон Уизли", "Гриффиндор", 45, 10, 91, 70, 10);
        Griffindor[] griffindorStudents = {student1, student2, student3};

        Puffendui student4 = new Puffendui("Захария Смит", "Пуффендуй", 78, 66, 23, 88, 45);
        Puffendui student5 = new Puffendui("Седрик Диггори", "Пуффендуй", 89, 65, 78, 99, 27);
        Puffendui student6 = new Puffendui("Джастин Финч-Флетчли", "Пуффендуй", 45, 58, 47, 63, 50);
        Puffendui[] puffenduiStudents = {student4, student5, student6};

        Cogtevran student7 = new Cogtevran("Чжоу Чанг", "Когтевран", 88, 20, 21, 87, 79, 12);
        Cogtevran student8 = new Cogtevran("Падма Патил", "Когтевран", 44, 11, 56, 95, 19, 80);
        Cogtevran student9 = new Cogtevran("Маркус Белби", "Когтевран", 45, 10, 74, 36, 55, 93);
        Cogtevran[] cogtevranStudents = {student7, student8, student9};

        Slizerin student10 = new Slizerin("Драко Малфой", "Слизерин", 41, 45, 92, 90, 64, 51, 99);
        Slizerin student11 = new Slizerin("Грэхэм Монтегю", "Слизерин", 55, 85, 2, 97, 99, 83, 91);
        Slizerin student12 = new Slizerin("Грегори Гойл", "Слизерин", 20, 36, 31, 38, 52, 66, 23);
        Slizerin[] slizerinStudents = {student10, student11, student12};

        Hogwards.printStudent(student10);
        Griffindor.bestStudentGriffindor(griffindorStudents);
        Puffendui.bestStudentPuffendui(puffenduiStudents);
        Cogtevran.bestStudentCogtevran(cogtevranStudents);
        Slizerin.bestStudentSlizerin(slizerinStudents);
        Hogwards.mostPowerfulStudent(student3, student9);
    }

}