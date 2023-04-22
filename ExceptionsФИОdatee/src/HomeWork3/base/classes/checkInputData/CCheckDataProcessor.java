package HomeWork3.base.classes.checkInputData;

import HomeWork3.base.abstractClasses.ACheckData;
import HomeWork3.base.abstractClasses.ACheckDataProcessor;
import HomeWork3.base.abstractClasses.ACheckFullName;
import HomeWork3.base.abstractClasses.ACheckQuantity;

public class CCheckDataProcessor extends ACheckDataProcessor {
    public CCheckDataProcessor(ACheckQuantity checkQuantity, ACheckFullName checkFullName, ACheckData checkBirthday, ACheckData checkSex) {
        super(checkQuantity, checkFullName, checkBirthday, checkSex);
    }

    @Override
    public boolean checkBirthday(String birthday) {
        super.checkBirthday.checkElement(birthday);
        System.out.println("Birthday format is OK.");
        return true;
    }

    @Override
    public boolean checkFullName(String[] fullName) {
        super.checkFullName.checkFullName(fullName);
        System.out.println("Full name format is OK.");
        return true;
    }

    @Override
    public boolean checkQuantity(String[] data) {
        super.checkQuantity.checkQuantity(data);
        System.out.println("Quantity data is OK.");
        return true;
    }

    @Override
    public boolean checkSex(String sex) {
        super.checkSex.checkElement(sex);
        System.out.println("Sex format is OK.");
        return true;
    }
}
