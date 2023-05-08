package HWClass18;

class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher= new Teacher();
        MathTeacher mathTeacher = new MathTeacher();
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        PianoTeacher pianoTeacher = new PianoTeacher();

        teacher.teach();
        mathTeacher.relax();
        chemistryTeacher.discuss();
        pianoTeacher.test();

    }
}
