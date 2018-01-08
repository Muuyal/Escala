public class Passengers {
    private String name;
    private String travel;
    private int phone;
    private String eMail;
    private String addrsStreet;
    private String addrsCity;
    private String addrsColony;
    private int addrsCP;
    private String notes;
    private String id;

    Passengers(String name, int phone, String eMail) {
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    //Metodos

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getTravel() {
        return travel;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void setAddrsStreet(String addrsStreet) {
        this.addrsStreet = addrsStreet;
    }

    public String getAddrsStreet() {
        return addrsStreet;
    }

    public void setAddrsCity(String addrsCity) {
        this.addrsCity = addrsCity;
    }

    public String getAddrsCity() {
        return addrsCity;
    }

    public void setAddrsColony(String addrsColony) {
        this.addrsColony = addrsColony;
    }

    public String getAddrsColony() {
        return addrsColony;
    }

    public void setAddrsCP(int addrsCP) {
        this.addrsCP = addrsCP;
    }

    public int getAddrsCP() {
        return addrsCP;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}