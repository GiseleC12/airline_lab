public class Passenger {
    private String name;
    private int uniqueId;
    private String email;

    public Passenger(String name, int uniqueId, String email){
        this.name = name;
        this.uniqueId   = uniqueId;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
