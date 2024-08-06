package dev.pkj.javadatastructures.prototypedesignpattern;

public class Practitioner implements Prototype<Practitioner>{
    private String name;
    private String hospital;
    private String department;
    private String city;
    private int age;

    public Practitioner() {}

    public Practitioner(Practitioner practitioner) {
        this.name       = practitioner.name;
        this.age        = practitioner.age;
        this.hospital   = practitioner.hospital;
        this.department = practitioner.department;
        this.city       = practitioner.city;
    }

    @Override
    public Practitioner clone() {
        return new Practitioner(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ("Name " + this.getName() + " Age " + this.getAge() + " Hospital " + this.getHospital() + " Department " +
                this.getDepartment() + " City " + this.getCity());
    }
}
