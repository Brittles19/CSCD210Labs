package cscd210Classes;

public class Stock { //class declarations
	private String ticker;
	private String companyName;
	private double purchasePrice;
	private double currentPrice;
@Override	
	public String toString() {
		String res = " "; //res means result
		res = res + this.companyName + " - " + this.ticker + " " + "Purchase Price: " + this.purchasePrice + " " + "Current price " + this.currentPrice;
	
		return res;
	}

	
	//DVC

	public Stock() {
		this.ticker = "DOW";
		this.companyName = "DOW Jones Industrial Average";
		this.currentPrice = 12;
		this.purchasePrice = 0;
	}

	//EVC
	public Stock (final String ticker, final String companyName, final double currentPrice) 
	{
		if(ticker == null || companyName == null || ticker.isEmpty() || companyName.isEmpty())
			throw new IllegalArgumentException("Ticker or company name is empty");
		if(currentPrice <= 0)
			throw new IllegalArgumentException("Company name cannot be less than 0 or 0");
		
		this.ticker = ticker;
		this.companyName = companyName;
		this.currentPrice = currentPrice;
		this.purchasePrice = 10;
	}
	
	 public Stock (final String companyName, final double currentPrice, final String ticker) {
		this.companyName = companyName;
		this.currentPrice = currentPrice;
		this.ticker = ticker;
		}
	}
	