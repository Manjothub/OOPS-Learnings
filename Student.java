class Student {
    // this is data: data members: instance variable
    int studentId;
    String studentName;
    String studentCity;

    // Behaviour : member methods: function that will go to the object
    public void study(){
        System.out.println(studentName + " is studying");
        System.out.println(this.studentName);
    }

    public Student(){
        this(96,"Manjot","Delhi");
        System.out.println("This is Default Constructor");
    }

    public Student(int id){
        studentId =id;
    }

    public Student(int id,String name,String city){
        studentId = id;
        studentName = name;
        studentCity = city;
    }

    public void showFullDetails(){
        System.out.println("My Name is "+studentName);
        System.out.println("My Id is "+studentId);
        System.out.println("My City is "+studentCity);
    }
}

