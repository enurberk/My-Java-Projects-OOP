
package javaapplication23;

public class Packet {
    
    private String message;
    private  String sourceAdress;
    private String targetAdress;
    
    public Packet(String m,String s,String t){
        this.message=m;
        this.sourceAdress=s;
        this.targetAdress=t;
    }
    public String getMessage(){
        return message;
    }
    public String getSourceAdress(){
        return sourceAdress;
    }
    public String getTargetAdress(){
        return targetAdress;
    }
}
