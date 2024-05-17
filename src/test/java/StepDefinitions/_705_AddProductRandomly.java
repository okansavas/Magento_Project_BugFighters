package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _705_AddProductRandomly {
    TC_705_POM tcp = new TC_705_POM();


    @Given("Add a Randomly Selected Product to The Basket")
    public void addARandomlySelectedProductToTheBasket() {

        for (int i = 0; i < 2; i++) {
            int random = tcp.randomGenerator(tcp.topMenuList.size());
            tcp.myClick(tcp.topMenuList.get(random));

            if (tcp.pageTitleText.getText().equalsIgnoreCase("What's New")) {
                int random16 = tcp.randomGenerator(tcp.productNameList.size());
                //mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
                tcp.myClick(tcp.productNameList.get(random16));

                //String strProductPriceNew = mn.productPrice.getText();

                int random1 = tcp.randomGenerator(tcp.productSizeList.size());
                tcp.myClick(tcp.productSizeList.get(random1));

                int random2 = tcp.randomGenerator(tcp.productColorList.size());
                tcp.myClick(tcp.productColorList.get(random2));

                tcp.myClick(tcp.addToCartButton);

            } else if (tcp.pageTitleText.getText().equalsIgnoreCase("Women")) {
                int random3 = tcp.randomGenerator(tcp.productNameList.size());
                // mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
                tcp.myClick(tcp.productNameList.get(random3));

                //String strProductPriceWomen = mn.productPrice.getText();

                int random4 = tcp.randomGenerator(tcp.productSizeList.size());
                tcp.myClick(tcp.productSizeList.get(random4));

                int random5 = tcp.randomGenerator(tcp.productColorList.size());
                tcp.myClick(tcp.productColorList.get(random5));

                tcp.myClick(tcp.addToCartButton);

            } else if (tcp.pageTitleText.getText().equalsIgnoreCase("Men")) {
                int random6 = tcp.randomGenerator(tcp.productNameList.size());
                // mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
                tcp.myClick(tcp.productNameList.get(random6));

                //String strProductPriceMan = mn.productPrice.getText();

                int random7 = tcp.randomGenerator(tcp.productSizeList.size());
                tcp.myClick(tcp.productSizeList.get(random7));

                int random8 = tcp.randomGenerator(tcp.productColorList.size());
                tcp.myClick(tcp.productColorList.get(random8));

                tcp.myClick(tcp.addToCartButton);

            } else if (tcp.pageTitleText.getText().equalsIgnoreCase("Gear")) {
                int random9 = tcp.randomGenerator(tcp.productNameList.size());
                // mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
                tcp.myClick(tcp.productNameList.get(random9));

                //String strProductPriceGear = mn.productPrice.getText();

                tcp.myClick(tcp.addToCartButton);

            } else if (tcp.pageTitleText.getText().equalsIgnoreCase("Training")) {
                tcp.myClick(tcp.handSelectedByErin);
                tcp.SelectMenuValue(tcp.limiterSelect, "36");

                int random10 = tcp.randomGenerator(tcp.productNameList.size());
                //mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
                tcp.wait.until(ExpectedConditions.visibilityOf(tcp.pageTitleText));
                tcp.myClick(tcp.productNameList.get(random10));

                //String strProductPriceTraining = mn.productPrice.getText();

                int random11 = tcp.randomGenerator(tcp.productSizeList.size());
                tcp.myClick(tcp.productSizeList.get(random11));

                int random12 = tcp.randomGenerator(tcp.productColorList.size());
                tcp.myClick(tcp.productColorList.get(random12));

                tcp.myClick(tcp.addToCartButton);

            } else if (tcp.pageTitleText.getText().equalsIgnoreCase("Sale")) {

                tcp.myClick(tcp.shopWomensDeals);
                tcp.SelectMenuValue(tcp.limiterSelect, "36");

                int random13 = tcp.randomGenerator(tcp.productNameList.size());
                //mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
                tcp.wait.until(ExpectedConditions.visibilityOf(tcp.pageTitleText));
                tcp.myClick(tcp.productNameList.get(random13));

                //String strProductPriceGear = mn.productPrice.getText();

                int random14 = tcp.randomGenerator(tcp.productSizeList.size());
                tcp.myClick(tcp.productSizeList.get(random14));

                int random15 = tcp.randomGenerator(tcp.productColorList.size());
                tcp.myClick(tcp.productColorList.get(random15));

                tcp.myClick(tcp.addToCartButton);
            }

        }

        tcp.wait.until(ExpectedConditions.elementToBeClickable(tcp.showBasket));
        tcp.myClick(tcp.showBasket);
        tcp.wait.until(ExpectedConditions.visibilityOf(tcp.cartSubTotal));

        String strTotalPrice = tcp.cartSubTotal.getText();
        String subsTotalPrice = strTotalPrice.replaceAll("[^0-9.]", "");
        double totalPrice = Double.parseDouble(subsTotalPrice);

        double total = 0;

        for (int i = 0; i < tcp.productsPriceInBasket.size(); i++) {
            String subs = tcp.productsPriceInBasket.get(i).getText().replaceAll("[^0-9.]", "");
            double parse = Double.parseDouble(subs);

            total = total + parse;
        }

        Assert.assertEquals(totalPrice, total, "Product price and total amounts are unequal");
        System.out.println("total = " + total);
        System.out.println("totalPrice = " + totalPrice);


    }
}
