package tr.edu.duzce.ogrenci.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "personel")
public class Personel implements Serializable {
    @Id
    @Column(name = "id",unique = true,length = 10)
    private int personelId;

    @Column(name = "isim",length = 20)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;



    @Temporal(TemporalType.DATE)
    @Column(name = "dogumTarihi")
    private Date birthDate;

    @Column(name = "peronelNumber")
    private String personelNumber;

    @Lob
    @Column(name = "about")
    private String about;

    @Transient
    @Column(name = "salary")
    private double salary;

   /* public Personel() {

    }

    public Personel(int personelId, String firstName, String lastName, Date birthDate, String personelNumber) {
        this.personelId = personelId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.personelNumber = personelNumber;
    }
*/
    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPersonelNumber() {
        return personelNumber;
    }

    public void setPersonelNumber(String personelNumber) {
        this.personelNumber = personelNumber;
    }
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
