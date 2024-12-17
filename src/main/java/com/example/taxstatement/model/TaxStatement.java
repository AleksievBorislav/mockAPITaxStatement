package com.example.taxstatement.model;

public class TaxStatement {

    private String name;
    private String taxId;
    private Double employmentIncome;
    private Double taxPaid;
    private Double taxRefundDue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Double getEmploymentIncome() {
        return employmentIncome;
    }

    public void setEmploymentIncome(Double employmentIncome) {
        this.employmentIncome = employmentIncome;
    }

    public Double getTaxPaid() {
        return taxPaid;
    }

    public void setTaxPaid(Double taxPaid) {
        this.taxPaid = taxPaid;
    }

    public Double getTaxRefundDue() {
        return taxRefundDue;
    }

    public void setTaxRefundDue(Double taxRefundDue) {
        this.taxRefundDue = taxRefundDue;
    }

    @Override
    public String toString() {
        return "TaxStatement{" +
                "name='" + name + '\'' +
                ", taxId='" + taxId + '\'' +
                ", employmentIncome=" + employmentIncome +
                ", taxPaid=" + taxPaid +
                ", taxRefundDue=" + taxRefundDue +
                '}';
    }
}
