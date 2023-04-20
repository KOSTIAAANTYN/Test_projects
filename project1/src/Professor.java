public non-sealed class Professor extends Employee implements CanTeach {
    private int experience;
    private int msgSent;

    public Professor(String name, String surname, int experience) {
        super(name,surname);
        this.experience = experience;
        msgSent=0;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    String mail(String message){
        msgSent++;
        return super.mail(message);
    }
    @Override
    public String mail(String message,String studentSurname){
        msgSent++;
        return "Proffesor"+getName()+" sent to "+studentSurname+":"+message;
    }
    @Override
    public String mail(double mark,String studentSurname){
        msgSent++;
        return "Proffesor"+getName()+" put the mark to "+studentSurname+":"+mark;
    }
    public int getMsgSent() {
        return msgSent;
    }
}
