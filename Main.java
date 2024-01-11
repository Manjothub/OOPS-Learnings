public class Main {
    public static void main(String[] args) {

        // now creating object of student
        Student st;
        st = new Student();
        st.studentName = "John";
        st.studentId = 1;
        st.studentCity = "Delhi";

//        st.study();
//        st.showFullDetails();

        Student st2 =  new Student(12);
        Student st3 = new Student(12, "Manjot", "delhi");

        st2.showFullDetails();
//        st3.showFullDetails();
        Dog d1 = new Dog();
        d1.eating();
    }
}
