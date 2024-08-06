package dev.pkj.javadatastructures.prototypedesignpattern;

public class Surgeon extends Practitioner {
    private String speciality;

    public Surgeon() {}

    public Surgeon(Surgeon surgeon) {
        super(surgeon);
        this.speciality = surgeon.speciality;
    }

    @Override
    public Surgeon clone() {
        return new Surgeon(this);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return ("Name " + this.getName() + " Age " + this.getAge() + " Hospital " + this.getHospital() + " Department " +
                this.getDepartment() + " City " + this.getCity() + " speciality " + this.getSpeciality());
    }
}
