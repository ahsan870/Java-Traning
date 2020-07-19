package enumDemo;

public class CompanyExample {
	
	public enum Company {
        EBAY, PAYPAL, GOOGLE, YAHOO, ATT
    }
 
    Company cName;
 
    public CompanyExample(Company cName) {
        this.cName = cName;
    }
 
    public void companyDetails() {
        switch (cName) {
            case EBAY:
                System.out.println("EBAY: Biggest Market Place in the World.");
                break;
 
            case PAYPAL:
                System.out.println("PAYPAL: Simplest way to manage Money.");
                break;
 
            case GOOGLE:
            case YAHOO:
                System.out.println("YAHOO: 1st Web 2.0 Company.");
                break;
 
            default:
                System.out.println("DEFAULT: Google - biggest search giant.. ATT - my carrier provider..");
                break;
        }
    }
 
    public static void main(String[] args) {
    	CompanyExample ebay = new CompanyExample(Company.EBAY);
        ebay.companyDetails();
        CompanyExample paypal = new CompanyExample(Company.PAYPAL);
        paypal.companyDetails();
        CompanyExample google = new CompanyExample(Company.GOOGLE);
        google.companyDetails();
        CompanyExample yahoo = new CompanyExample(Company.YAHOO);
        yahoo.companyDetails();
        CompanyExample att = new CompanyExample(Company.ATT);
        att.companyDetails();
    }
	
	

}
