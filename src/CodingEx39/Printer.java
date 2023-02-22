package CodingEx39;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel>-1 && tonerLevel<= 100)? tonerLevel: -1;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount<=100 && tonerAmount>0){
            if(!(this.tonerLevel+tonerAmount>100)){
                this.tonerLevel+=tonerAmount;
                return this.tonerLevel;
            }
            return-1;
        }
        return-1;
    }
    public int printPages(int pages){
        int pagesToPrint= pages;
        pagesToPrint = duplex? ((pages/2)+(pages%2)):pages;
        this.pagesPrinted+= pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
