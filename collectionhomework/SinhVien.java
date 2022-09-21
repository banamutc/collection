package collectionhomework;

import java.time.LocalDate;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private String nameClass;
    private Double mathScore;
    private Double physicalScore;
    private Double chemistryScore;

    public SinhVien() {
    }

    public SinhVien(String id, String name, LocalDate dateOfBirth, String nameClass, Double mathScore, Double physicalScore, Double chemistryScore) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nameClass = nameClass;
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemistryScore = chemistryScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Double getMathScore() {
        return mathScore;
    }

    public void setMathScore(Double mathScore) {
        this.mathScore = mathScore;
    }

    public Double getPhysicalScore() {
        return physicalScore;
    }

    public void setPhysicalScore(Double physicalScore) {
        this.physicalScore = physicalScore;
    }

    public Double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(Double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    @Override
    public String toString() {
        return "Sinh vien --- Id: " +this.id + ", name: " + this.name
                + ", ngay sinh: " + this.dateOfBirth + ", Lop: " + this.nameClass + ", math score: " + this.mathScore
                + ", physical score: " + this.physicalScore + ", chemistry score: " + this.chemistryScore ;
    }
    public double sumScore() {
        return mathScore + physicalScore + chemistryScore;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chemistryScore, physicalScore, mathScore, name, id, nameClass, dateOfBirth);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        return Objects.equals(id, other.id);
    }
}
