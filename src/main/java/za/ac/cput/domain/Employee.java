package za.ac.cput.domain;

public class Employee {
    private int employeeNumber;
    private String firstName;
    private String lastname;

    private Employee(){

    }
   private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastname = builder.lastname;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }



    public String getFirstName() {
        return firstName;
    }



    public String getLastname() {
        return lastname;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
    public static class Builder{
        private int employeeNumber;
        private String firstName;
        private String lastname;


        public Builder setEmployeeNumber(int employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
        public Employee build() {return new Employee(this);}
    }
}
