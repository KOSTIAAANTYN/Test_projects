public final class Student extends User {
    int group;
    int year;

    Student(String name, String surname, int group, int year) {
        super(name,surname);
        this.group = group;
        this.year = year;
    }

    @Override
    public String getName() {
        System.out.println("GetName");
        return super.getName();
    }

    @Override
    public void setName(String name) {
        System.out.println("SetName");
        super.setName(name);
    }

    @Override
    public String getSurname() {
        System.out.println("GetSurname");
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        System.out.println("SetSurname");
        super.setSurname(surname);
    }

    @Override
    String mail(String message){
        return "Student:"+super.getName()+":"+message;
    }

}
