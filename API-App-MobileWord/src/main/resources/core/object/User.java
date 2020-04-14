package core.object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    private Account acc;
    
    @SerializedName("id")
    private int id;

    @SerializedName("fullname") @Expose
    private String fullname;

    @SerializedName("profit")  @Expose
    private String profit;

    @SerializedName("email") @Expose
    private String email;

    @SerializedName("bground") @Expose
    private String bground;

    @SerializedName("bdate") @Expose
    private String bdate;

    @SerializedName("address") @Expose
    private String address;

    @SerializedName("pnumber") @Expose
    private String pnumber;
    
    
    public User(int  id, String fullname, String profit, String bground, String bdate, String address, String pnumber) {
        this.id = id;
        this.fullname = fullname;
        this.profit = profit;
        this.bground = bground;
        this.bdate = bdate;
        this.address = address;
        this.pnumber = pnumber;
    }
    
    

    @Override
	public String toString() {
		return "User [acc=" + acc + ", id=" + id + ", fullname=" + fullname + ", profit=" + profit + ", email=" + email
				+ ", bground=" + bground + ", bdate=" + bdate + ", address=" + address + ", pnumber=" + pnumber + "]";
	}



	public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getBground() {
        return bground;
    }

    public void setBground(String bground) {
        this.bground = bground;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public User(String email) {
        this.email = email;
    }
}
