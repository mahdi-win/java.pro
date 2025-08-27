public class Main {
    public static void main(String[] args) {
        // ایجاد استاد
        Professor p1 = new Professor("Ahmad","121214","Hadizadeh","012254587","0919","1385");
        Student S1 = new Student("MOMO","403987676","Mohammad@gmail.com","0223568555","09323","1385");
        Student S2 = new Student("Mahdi","403987676","Mohammad@gmail.com","0223568555","09323","1385");
        FileManager.saveStudent(S1);
        FileManager.saveStudent(S2);
        FileManager.saveProfessor(p1);





        // ایجاد دانشجو


        // ایجاد درس‌ها


        // اختصاص درس به استاد


        // انتخاب واحد دانشجو



        // نمایش اطلاعات


        System.out.println("----------");
        System.out.println("MOMO");
        System.out.println("momo");
        Department d1 = new Department("Math");
        Faculty f1 = new Faculty("Fany");
        d1.addProfessor(p1);
        d1.addStudent(S1);
        d1.addStudent(S2);
        f1.addDepartment(d1);

        f1.showFacultyInfo();
        System.out.println(f1.getName());




        System.out.println("----------");


        Menu menu = new Menu();
        menu.first();
        System.out.println("salam");
        menu.first();

    }
}