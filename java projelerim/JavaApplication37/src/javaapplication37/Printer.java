
package javaapplication37;

public abstract class Printer implements Scan,Fax,Color,Black{

    @Override
    public abstract void Scanning();

    @Override
    public abstract void Faxing();

    @Override
    public abstract void Colorful();

    @Override
    public abstract void BlackandWhite();
    
}
