package Services;

public class Students extends Person implements StudentRegistration {

    private Integer sks;
    private String mataKuliah;
    private Integer totalSks;


    public Students(Integer sks, String mataKuliah, Integer totalSks) {
        super();
        this.sks = sks;
        this.mataKuliah = mataKuliah;
        this.totalSks = totalSks;
    }








    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public Integer getTotalSks() {
        return this.sks = +this.sks;
    }

    public void setTotalSks(Integer totalSks) {
        this.totalSks = totalSks;
    }


    @Override
    public void student(String firstname, String lastName, String residence) {
        System.out.println("Data Mahasiswa");
        System.out.println("Nama Depan: " + getFirstname());
        System.out.println("Nama Belakang: " + getLastname());
        System.out.println("Tinggal di: " + getResidence());

    }

    @Override
    public void fullName() {
        System.out.println("Nama lengkap: " + getFirstname() + getLastname());
        System.out.println("Tinggal di" + getResidence());
        if (this.sks > 144) {
            System.out.println("Nama : " + "SPD");
        } else {
            System.out.println("Nama lengkap: " + getFirstname() + getLastname());
        }
    }

    @Override
    public void cardIdentitas() {
        System.out.println("Nama lengkap: " + getFirstname() + getLastname());
        System.out.println("SKS yang akan diambil: " + getSks());
        System.out.println("Mata kuliah yang diambil" + getMataKuliah());
        System.out.println("Total Sks sebelumnya: " + getTotalSks());
        System.out.println("Total sks semester ini" + (getTotalSks() + getSks()));
    }


}