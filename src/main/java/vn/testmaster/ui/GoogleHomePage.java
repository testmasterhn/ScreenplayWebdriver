package vn.testmaster.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

public class GoogleHomePage extends PageObject {
    public static Target SEARCH_BOX = Target.the("Search ")
            .locatedBy("//input[@class=\"gLFyf gsfi\"]");

    public static Target RESULT_ITEM = Target.the("The result")
            .locatedBy("//div[@class=\"kp-header\"]//div[@data-attrid=\"title\"]/span");
}