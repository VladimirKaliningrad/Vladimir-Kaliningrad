package HomeWork3.base.abstractClasses;

import HomeWork3.base.interfaces.ICheckBirthday;
import HomeWork3.base.interfaces.ICheckFullName;
import HomeWork3.base.interfaces.ICheckQuantity;
import HomeWork3.base.interfaces.ICheckSex;

public abstract class ACheckDataProcessor implements ICheckFullName, ICheckQuantity, ICheckBirthday, ICheckSex {
    protected ACheckQuantity checkQuantity;
    protected ACheckFullName checkFullName;
    protected ACheckData checkBirthday;
    protected ACheckData checkSex;

    public ACheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        this.checkQuantity = checkQuantity;
        this.checkFullName = checkFullName;
        this.checkBirthday = checkBirthday;
        this.checkSex = checkSex;
    }
}
