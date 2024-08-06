package dev.pkj.javadatastructures.prototypedesignpattern;

public class Client {
    public static void fillRegistry(PractitionerRegistry practitionerRegistry) {
        Practitioner sakraHospital = new Practitioner();
        sakraHospital.setHospital("Sakra Hospital");
        sakraHospital.setDepartment("Cardiology");
        sakraHospital.setCity("Bangalore");
        practitionerRegistry.register("sakrahospitalcardiology", sakraHospital);

        Surgeon sakraHospitalSurgeon = new Surgeon();
        sakraHospitalSurgeon.setHospital("Sakra Hospital");
        sakraHospitalSurgeon.setDepartment("Cardiology");
        sakraHospitalSurgeon.setCity("Bangalore");
        sakraHospitalSurgeon.setSpeciality("Cardiac Arrest");
        practitionerRegistry.register("sakrahospitalsurgeoncardiology", sakraHospitalSurgeon);

    }
    public static void main(String[] args) {
        PractitionerRegistry practitionerRegistry = new PractitionerRegistry();
        fillRegistry(practitionerRegistry);

        Practitioner piyush = practitionerRegistry.get("sakrahospitalcardiology").clone();
        piyush.setName("Piyush jaiswal");
        piyush.setAge(36);

        Practitioner madan = practitionerRegistry.get("sakrahospitalcardiology").clone();
        madan.setName("Madan Shukla");
        madan.setAge(36);

        Practitioner pranay = practitionerRegistry.get("sakrahospitalsurgeoncardiology").clone();
        pranay.setName("Pranay Pandey");
        pranay.setAge(36);

        System.out.println(piyush.toString());
        System.out.println(madan.toString());
        System.out.println(pranay.toString());

    }
}
