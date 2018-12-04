//Product DOA

package com.server.pojoutil;

public class Product{
	private Integer pid;
    private String name;
    private String code;
    private Double price;
    private Integer availableStock;
    private Double tax;
	private Boolean offerAvailStat;
//	private Timestamp firstDateOfPurchase;


	public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(Integer availableStock) {
        this.availableStock = availableStock;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Boolean getOfferAvailStat() {
        return offerAvailStat;
    }

    public void setOfferAvailStat(Boolean offerAvailStat) {
        this.offerAvailStat = offerAvailStat;
    }

	/*public Timestamp getFirstDateOfPurchase(){
		return this.firstDateOfPurchase;
	}

	public void setFirstDateOfPurchase(Timestamp firstDateOfPurchase){
		this.firstDateOfPurchase = firstDateOfPurchase;
	}*/
}