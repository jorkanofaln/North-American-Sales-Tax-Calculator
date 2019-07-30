package sample;

public class TaxCalculator {
    double price;
    String stateCode;
    TaxCalculator(double price, String stateCode){
        this.stateCode = stateCode;
        this.price = price;
    }
    double getSalesTaxRate(){
        double salesTaxRate;
        switch(this.stateCode){
            case"AB":
                salesTaxRate = 0.05;
                break;
            case"AL":
                salesTaxRate = 0.04;
                break;
            case"AR":
                salesTaxRate = 0.065;
                break;
            case"AZ":
                salesTaxRate = 0.056;
                break;
            case"BC":
                salesTaxRate = 0.12;
                break;
            case"CA":
                salesTaxRate=0.075;
                break;
            case"CO":
                salesTaxRate=0.029;
                break;
            case"CT":
                salesTaxRate=0.0635;
                break;
            case"DC":
                salesTaxRate=0.0575;
                break;
            case"FL":
                salesTaxRate=0.06;
                break;
            case"GA":
                salesTaxRate=0.04;
                break;
            case"HI":
                salesTaxRate=0.04;
                break;
            case"ID":
                salesTaxRate=0.06;
                break;
            case"IL":
                salesTaxRate=0.0625;
                break;
            case"IN":
                salesTaxRate=0.07;
                break;
            case"IA":
                salesTaxRate=0.06;
                break;
            case"KS":
                salesTaxRate=0.065;
                break;
            case"KY":
                salesTaxRate=0.06;
                break;
            case"LA":
                salesTaxRate=0.04;
                break;
            case"MA":
                salesTaxRate=0.0625;
                break;
            case"MB":
                salesTaxRate=0.13;
                break;
            case"MD":
                salesTaxRate=0.06;
                break;
            case "ME":
                salesTaxRate=0.055;
                break;
            case"MI":
                salesTaxRate=0.06;
                break;
            case"MN":
                salesTaxRate=0.0688;
                break;
            case"MO":
                salesTaxRate=0.0423;
                break;
            case"MS":
                salesTaxRate=0.07;
                break;
            case"NB":
                salesTaxRate=0.15;
                break;
            case"NE":
                salesTaxRate=0.055;
                break;
            case"NL":
                salesTaxRate=0.15;
                break;
            case"NV":
                salesTaxRate=0.0685;
                break;
            case"NJ":
                salesTaxRate=0.07;
                break;
            case"NM":
                salesTaxRate=0.0513;
                break;
            case"NT":
                salesTaxRate=0.05;
                break;
            case"NS":
                salesTaxRate=0.15;
                break;
            case"NU":
                salesTaxRate=0.05;
                break;
            case"NY":
                salesTaxRate=0.04;
                break;
            case"NC":
                salesTaxRate=0.0475;
                break;
            case"ND":
                salesTaxRate=0.05;
                break;
            case"OH":
                salesTaxRate=0.0575;
                break;
            case"OK":
                salesTaxRate=0.045;
                break;
            case"ON":
                salesTaxRate=0.13;
                break;
            case"PA":
                salesTaxRate=0.0475;
                break;
            case"PE":
                salesTaxRate=0.15;
                break;
            case"QC":
                salesTaxRate=0.15;
                break;
            case"RI":
                salesTaxRate=0.07;
                break;
            case"SC":
                salesTaxRate=0.06;
                break;
            case"SD":
                salesTaxRate=0.04;
                break;
            case"SK":
                salesTaxRate=0.11;
                break;
            case"TN":
                salesTaxRate=0.07;
                break;
            case"TX":
                salesTaxRate=0.0475;
                break;
            case"UT":
                salesTaxRate=0.0595;
                break;
            case"VT":
                salesTaxRate=0.06;
                break;
            case"VA":
                salesTaxRate=0.053;
                break;
            case"WA":
                salesTaxRate=0.065;
                break;
            case"WV":
                salesTaxRate=0.06;
                break;
            case"WI":
                salesTaxRate=0.05;
                break;
            case"WY":
                salesTaxRate=0.04;
                break;
            case"YK":
                salesTaxRate=0.05;
                break;
            default:
                salesTaxRate = 0.0;
                break;
        }
        return salesTaxRate;
    }
    double calculateSalesTax(){
        double rate = this.getSalesTaxRate();
        double taxRate = 1 + rate;
        return this.price * taxRate;
    }
}
