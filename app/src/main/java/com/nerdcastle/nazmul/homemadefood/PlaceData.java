package com.nerdcastle.nazmul.homemadefood;

import java.util.ArrayList;

/**
 * Created by megha on 15-03-06.
 */
public class PlaceData {

  public static String[] productNameArray = {"Pasta", "Burger", "Petis", "Egg Roll","Shingara", "Fuska", "Snacks Combo 1", "Vegetable Roll", "Pizza", "Hotdog"};
  public static String[] productQuantityArray = {"Half plate", "1 pc", "1 pc", "4 pc","1 pc", "Quarter plate", "single package", "1 pc", "1 small", "1 pc"};
  public static String[] productPriceArray = {"৳ 200", "৳ 42", "৳ 10", "৳ 50","৳ 10", "৳ 40", "৳ 100", "৳ 15", "৳ 400", "৳ 40"};

  public static ArrayList<Place> placeList() {
    ArrayList<Place> list = new ArrayList<>();
    for (int i = 0; i < productNameArray.length; i++) {
      Place place = new Place();
      place.name = productNameArray[i];
      place.quantity=productQuantityArray[i];
      place.price=productPriceArray[i];
      place.imageName = productNameArray[i].replaceAll("\\s+", "").toLowerCase();
      if (i == 2 || i == 5) {
        place.isFav = true;
      }
      list.add(place);
    }
    return (list);
  }

  public static Place getItem(String _id) {
    for (Place place : placeList()) {
      if (place.id.equals(_id)) {
        return place;
      }
    }
    return null;
  }
}
