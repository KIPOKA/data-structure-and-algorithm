/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngobeni.mo.uberDriver;

/**
 *
 * @author oddette
 */
public class UberDriver {
    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private int exprience;
    public enum Gender{
        M,m,F,f
    }


    public UberDriver(){

    }

    public UberDriver(String name, String surname, Gender gender, int age, int exprience) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.exprience = exprience;
    }


    public void setName(String name) throws Exception {
        if (isNameOrSurnameValid(name)){
            this.name = name;
        }else{
            throw new Exception();
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws  Exception{
        if (isNameOrSurnameValid(name)){
            this.name = name;
        }else{
            throw new Exception();
        }
    }
    //gender validation


    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (isValidGender(gender)){
            this.gender = gender;

        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isAgeValid(age)){
            this.age = age;
        }else{
            throw new NumberFormatException();
        }

    }

    public int getExprience() {
        return exprience;
    }

    public void setExprience(int exprience) {
        if (isExperienceValid(exprience)){
            this.exprience = exprience;
        }else{
            throw new NumberFormatException();
        }

    }
    //Helper method to validate the gender of the uber driver
    public boolean isValidGender(Gender gender) {
        switch(gender) {
            case M:
            case m:
            case F:
            case f:
                return true;
            default:
                return false;
        }
    }
    //Helper method to validate the age of the uber driver
    public boolean isAgeValid(int age){
        if (age >=18 && age <= 100){
            return true;
        }else {
            return false;
        }
    }

    //Helper method to validate the number of year experience of the uber driver
    public boolean isExperienceValid(int year){
        if (year >=6 && year <= 100){
            return true;
        }else {
            return false;
        }
    }

    //Helper method to determine if the name and surname are valid
    public boolean isNameOrSurnameValid(String name){
        return name.matches( "[A-Z][a-z]*" );
    }


    @Override
    public String toString() {
        return "UberDriver{" + "name=" + name + ", surname=" + surname + ", gender=" + gender + ", age=" + age + ", exprience=" + exprience + '}';
    }
}
