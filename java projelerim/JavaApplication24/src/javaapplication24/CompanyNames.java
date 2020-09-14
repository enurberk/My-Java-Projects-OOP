
package javaapplication24;

public enum CompanyNames {
    GOOGLE("sdgdfbdfbdf"),
    MICROSOFT("dhdhdhdh"),
    IBM("dhghgngn"),
    APPLE("dfhdghgfgh"),
    AKINSOFT("dhffgnfgnfgn");
    
    final private String description;

    private CompanyNames(String description) {
        this.description=description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
}
